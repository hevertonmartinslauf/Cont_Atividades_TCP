
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public class EncAtividade extends Thread{

    ArrayList listaUsuarios;
    ArrayList listaAtividades;
    JTextArea txtLog;
    
    @Override
    public void run() {
        encaminhar();
    }
    
    public EncAtividade(ArrayList listaUsuarios, ArrayList listaAtividades, JTextArea log) {
        this.listaUsuarios = listaUsuarios;
        this.listaAtividades = listaAtividades;
        this.txtLog = log;
    }
    
    public void encaminhar(){
        
        while(true){
            Atividade ativ = null;
            Usuario user = null;
            ArrayList listaUsersHab = new ArrayList();
                    
            for(int i=0;i<listaAtividades.size();i++){
                Atividade ativTemp = (Atividade)listaAtividades.get(i);
                
                    if(ativTemp.getAtendente() == -1){
                        ativ = (Atividade)listaAtividades.get(i);
                        break;
                    }
            }
            
            if(ativ != null){//se achar uma atividade nao atendida
                
                for(int i=0;i<listaUsuarios.size();i++){
                        Usuario userTemp = (Usuario)listaUsuarios.get(i);
                        if(userTemp.getAtivo() == 1 && userTemp.getTipo() == 0 && userTemp.getQtAtivPend() <3){
                            listaUsersHab.add(userTemp);
                        }
                }
                
                if(!(listaUsersHab.isEmpty())){
                    
                    if(listaUsersHab.size()>1){
                        Collections.sort(listaUsersHab);
                        user = (Usuario)listaUsersHab.get(listaUsersHab.size()-1);
                    }
                    else{
                        user=(Usuario)listaUsersHab.get(0);
                    }
                    
                    marcarAtividade(ativ, user);
                    encaminhaAtividade(ativ, user);
                }
                else{
                    addLog("precisa-se de atendentes");
                }
            }
            
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(EncAtividade.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
 
    }
    
    public void addLog(String msg){
        Date data = new Date();
        txtLog.append(data.getHours() + ":" + data.getMinutes() + ":" + data.getSeconds() + " - " + msg + "\n");
    }
    
    public void marcarAtividade(Atividade ativ, Usuario user){
        
        for(int i=0;i<listaAtividades.size();i++){
            if(ativ.equals((Atividade)(listaAtividades.get(i)))){
                ativ.setAtendente(user.getId());
                listaAtividades.set(i, ativ);
            }
        }
        
        for(int i=0;i<listaUsuarios.size();i++){
            if(user.equals((Usuario)(listaUsuarios.get(i)))){
                user.setQtAtivPend(user.getQtAtivPend()+1);
                listaUsuarios.set(i, user);
            }
        }
    }
    
    public void encaminhaAtividade(Atividade ativ, Usuario user){
        Socket s = null;
        
        try {
            s = new Socket(user.getIp(),user.getPorta());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());

            out.writeUTF(ativ.getNumero()+";"+ativ.getCliente()+";"+ativ.getDescricao());
            
        } catch (IOException ex) {
            Logger.getLogger(EncAtividade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}