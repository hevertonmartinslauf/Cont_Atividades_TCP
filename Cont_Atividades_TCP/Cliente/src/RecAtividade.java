
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class RecAtividade extends Thread{
    
    int porta;
    JTable tabela;

    public RecAtividade(int porta, JTable tabela) {
        this.porta = porta;
        this.tabela = tabela;
    }

    @Override
    public void run() {
        ouvirPorta();
    }
    
    public void ouvirPorta(){
        String sep[];
        
        DataInputStream in;
        
        try {
            
            ServerSocket ouvindoSocket = new ServerSocket(porta);
            
            while(true){
                Socket cliSocket = ouvindoSocket.accept();
                in = new DataInputStream(cliSocket.getInputStream());
               
                String data = in.readUTF();
                
                sep = data.split(";");
                
                Vector vetor = new Vector();
           
                vetor.add(sep[0]);
                vetor.add(sep[1]);
                vetor.add(sep[2]);
                
                ((DefaultTableModel) tabela.getModel()).addRow(vetor);
                
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(RecAtividade.class.getName()).log(Level.SEVERE, null, ex);
                }
           
           }
            
        } catch (IOException ex) {
            Logger.getLogger(RecAtividade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
