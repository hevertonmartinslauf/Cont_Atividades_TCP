
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ReceiveMessage extends Thread{
    
    ArrayList listaAtividades;
    ArrayList listaUsuarios;
    JTextArea txtLog;
    int contUser = 1;
    int contAtiv = 1;
    
    public ReceiveMessage(JTextArea Log, ArrayList listaU, ArrayList listaA) {
        this.txtLog = Log;
        this.listaUsuarios = listaU;
        this.listaAtividades = listaA;
    }
    
    @Override
    public void run() {
       listenPort();
    }
    
    public void listenPort(){
        
        String sep[], cabecalho, usuario,tipo,resposta = null;
        
        int serverPort = 7896;
        DataInputStream in;
        DataOutputStream out;
        
         try {
            ServerSocket ouvindoSocket = new ServerSocket(serverPort);
            while(true){
                Socket cliSocket = ouvindoSocket.accept();
                in = new DataInputStream(cliSocket.getInputStream());
                out = new DataOutputStream(cliSocket.getOutputStream());
                String data = in.readUTF();
                
                sep= data.split(";");
                cabecalho = sep[0];
                usuario = sep[1];
                tipo = sep[2];
                
                switch(cabecalho){
                    case"1"://usuários solicitando login
                        Usuario usrn = new Usuario(usuario,cliSocket.getInetAddress(),cliSocket.getPort(),contUser,Integer.parseInt(tipo)); 
                        listaUsuarios.add(usrn);
                        if(Integer.parseInt(tipo) == 0){
                            addLog("Atendente "+usuario+" logado");
                        }
                        if(Integer.parseInt(tipo) == 1){
                            addLog("Gerente "+usuario+" logado");
                        }
                        
                        resposta=contUser+";"+cliSocket.getPort();
                        out.writeUTF(resposta);
                        contUser++;
                    break;
                    case"2"://gerente enviando atividades    
                        Atividade ativ = new Atividade(sep[1], contAtiv, sep[2]);
                        listaAtividades.add(ativ);
                        addLog("Gerente "+sep[3]+" enviou atividade");
                        resposta = String.valueOf(contAtiv);
                        out.writeUTF(resposta);
                        contAtiv++;
                    break; 
                    case"3"://respondendo atividades
                        resposta(Integer.parseInt(sep[1]),sep[2]);
                        addLog("chegou resposta da atividade "+sep[1]);
                    break;
                    case"4"://solicitando sair do servidor
                        logoutUsuario(Integer.parseInt(sep[1]));
                        resposta = "S";
                        out.writeUTF(resposta);
                    break;          
                }
            } 
        }
        catch (IOException ex) {
            Logger.getLogger(ReceiveMessage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void resposta(int numero, String resposta){
        
        int codUser = 0;
        
        for(int i=0;i<listaAtividades.size();i++){
            Atividade ativ = (Atividade)listaAtividades.get(i);
            
            if(numero == ativ.getNumero()){
                ativ.setResposta(resposta);
                ativ.setFechada(1);
                listaAtividades.set(i, ativ);
                codUser = ativ.getAtendente();
                break;
            }
        }
        
        for(int i=0;i<listaUsuarios.size();i++){
            Usuario userTemp = (Usuario)listaUsuarios.get(i);
            
            if(userTemp.getId() == codUser){
                userTemp.setQtAtivPend(userTemp.getQtAtivPend()-1);
                
                listaUsuarios.set(i, userTemp);
            }
        }
    }
    
    public void logoutUsuario(int cod){
        
        Usuario user;
        
        for(int i=0;i<listaUsuarios.size();i++){
            user = (Usuario)listaUsuarios.get(i);
            if(user.getId() == cod){
                user.setAtivo(0);
                listaUsuarios.set(i, user);
            }
        }
    }
    
    public void addLog(String msg){
        Date data = new Date();
        txtLog.append(data.getHours() + ":" + data.getMinutes() + ":" + data.getSeconds() + " - " + msg + "\n");
    }
}