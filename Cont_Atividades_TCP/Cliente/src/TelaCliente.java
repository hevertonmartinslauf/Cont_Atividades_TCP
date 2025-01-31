
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaCliente extends javax.swing.JFrame {
    
    String server;
    int porta;
    int codUsuario=0;
    
    public TelaCliente() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelAtiv = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btnRespAtiv = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        lblResposta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResposta = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        btnEnviarAtiv = new javax.swing.JButton();
        lblAtividades = new javax.swing.JLabel();
        painelListAtiv = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabAtivPend = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboAtend = new javax.swing.JComboBox();
        btnLogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        painelAtiv.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cliente:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Descrição:");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        btnRespAtiv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRespAtiv.setText("Resp. Atividade");
        btnRespAtiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespAtivActionPerformed(evt);
            }
        });

        lblResposta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResposta.setText("Resposta:");

        txtResposta.setColumns(20);
        txtResposta.setRows(5);
        jScrollPane2.setViewportView(txtResposta);

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel3.setText("Atividade Nº:");

        lblNumero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(0, 51, 255));
        lblNumero.setText("NUMERO");

        lblTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTipo.setText("Atendente:");

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 0, 204));
        lblNome.setText("NOME");

        btnEnviarAtiv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEnviarAtiv.setText("Enviar Atividade");
        btnEnviarAtiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarAtivActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAtivLayout = new javax.swing.GroupLayout(painelAtiv);
        painelAtiv.setLayout(painelAtivLayout);
        painelAtivLayout.setHorizontalGroup(
            painelAtivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtivLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAtivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAtivLayout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lblNumero))
                    .addGroup(painelAtivLayout.createSequentialGroup()
                        .addGroup(painelAtivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelAtivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelAtivLayout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAtivLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEnviarAtiv)
                        .addGap(18, 18, 18)
                        .addComponent(btnRespAtiv))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAtivLayout.createSequentialGroup()
                        .addComponent(lblResposta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        painelAtivLayout.setVerticalGroup(
            painelAtivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAtivLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(painelAtivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblNumero)
                    .addComponent(lblTipo)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAtivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAtivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAtivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResposta)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAtivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRespAtiv)
                    .addComponent(btnEnviarAtiv))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblAtividades.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAtividades.setText("Atividades Pendentes");

        painelListAtiv.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabAtivPend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº", "Cliente", "Descricao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabAtivPend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAtivPendMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabAtivPend);

        javax.swing.GroupLayout painelListAtivLayout = new javax.swing.GroupLayout(painelListAtiv);
        painelListAtiv.setLayout(painelListAtivLayout);
        painelListAtivLayout.setHorizontalGroup(
            painelListAtivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListAtivLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelListAtivLayout.setVerticalGroup(
            painelListAtivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListAtivLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("NOME:");

        jLabel9.setText("TIPO:");

        comboAtend.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Atendente", "Gerente" }));

        btnLogar.setText("LOGAR");
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAtiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboAtend, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLogar))
                            .addComponent(lblAtividades)
                            .addComponent(painelListAtiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(comboAtend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLogar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(painelAtiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAtividades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelListAtiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        
        if("LOGAR".equals(btnLogar.getText())){
    
            try {
                server = JOptionPane.showInputDialog(this, "Insira o nome do servidor: ", InetAddress.getLocalHost().getHostAddress());
                logarServidor("1;"+txtUsuario.getText()+";"+comboAtend.getSelectedIndex());

                if(codUsuario !=0){
                    JOptionPane.showMessageDialog(this, "Login com sucesso", "LOGIN", JOptionPane.INFORMATION_MESSAGE);
                    lblNome.setText(txtUsuario.getText());
                    txtUsuario.setEnabled(false);
                    comboAtend.setEnabled(false);
                    btnLogar.setText("SAIR");
                }

                if(comboAtend.getSelectedIndex() == 0){//Atendente
                    painelListAtiv.setEnabled(true);
                    lblAtividades.setEnabled(true);
                    tabAtivPend.setEnabled(true);
                    btnEnviarAtiv.setEnabled(false);

                    RecAtividade ouvirAtiv = new RecAtividade(porta,tabAtivPend);
                    ouvirAtiv.start();
                }

                if(comboAtend.getSelectedIndex() == 1){//Gerente
                    lblTipo.setText("Gerente");
                    btnRespAtiv.setEnabled(false);
                    txtResposta.setEnabled(false);
                    lblResposta.setEnabled(false);
                } 
   
            } 

            catch (UnknownHostException ex) {
                Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else{
            sairServidor("4;"+codUsuario+";"+" ");
        }
        
    }//GEN-LAST:event_btnLogarActionPerformed

    public void sairServidor(String mensagem){
        Socket s = null;
       
       try{
           int serverPort = 7896;
           s = new Socket(server,serverPort);
           
           DataInputStream in = new DataInputStream(s.getInputStream());
           DataOutputStream out = new DataOutputStream(s.getOutputStream());
           out.writeUTF(mensagem);
           
           String data = in.readUTF();
           
           if("S".equals(data)){
               JOptionPane.showMessageDialog(this, "LOGOUT COM SUCESSO", "LOGOUT", JOptionPane.INFORMATION_MESSAGE);
               System.exit(0);
           }
           
       }
       catch(UnknownHostException e){
           System.out.println("Socket: "+e.getMessage());
       }
       
       catch(EOFException e){
           System.out.println("EOF: "+ e.getMessage());
       }
       
       catch(IOException e){
           System.out.println("IO: "+ e.getMessage());
       }
       
       finally{
           if(s!= null){
               try{s.close();}
               
               catch(IOException e){
                   //*close falhou*/
               }
           }
       }
    }
    
    public void logarServidor(String mensagem) throws UnknownHostException{
        
       Socket s = null;
       
       try{
           int serverPort = 7896;
           s = new Socket(server,serverPort);
           
           DataInputStream in = new DataInputStream(s.getInputStream());
           DataOutputStream out = new DataOutputStream(s.getOutputStream());
           out.writeUTF(mensagem);
           
           String data = in.readUTF();
           
           String sep[] = data.split(";");
           
           codUsuario = Integer.parseInt(sep[0]);
           porta = Integer.parseInt(sep[1]);
           
       }
       catch(UnknownHostException e){
           System.out.println("Socket: "+e.getMessage());
       }
       
       catch(EOFException e){
           System.out.println("EOF: "+ e.getMessage());
       }
       
       catch(IOException e){
           System.out.println("IO: "+ e.getMessage());
       }
       
       finally{
           if(s!= null){
               try{s.close();}
               
               catch(IOException e){
                   //*close falhou*/
               }
           }
       }
       
    }
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        tabAtivPend.setEnabled(false);
        lblAtividades.setEnabled(false);
        painelListAtiv.setEnabled(false);    
    }//GEN-LAST:event_formComponentShown

    private void btnEnviarAtivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarAtivActionPerformed
        
        String msgErro="";
        
        if("".equals(txtNome.getText())){
            msgErro = msgErro+"nome cliente invalido\n";
        }
        
        if("".equals(txtDescricao.getText())){
            msgErro = msgErro+"descricao invalida\n";
        }
        
        if("".equals(msgErro)){
            enviarAtividade();
        }
        else{
            JOptionPane.showMessageDialog(this, msgErro, "ERRO VALIDACAO", JOptionPane.ERROR);
        }
        
        txtNome.setText("");
        txtDescricao.setText("");
        
    }//GEN-LAST:event_btnEnviarAtivActionPerformed

    private void tabAtivPendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAtivPendMouseClicked
        int linha = tabAtivPend.getSelectedRow();
        
        if ( linha >= 0 ) {
            
                lblNumero.setText((tabAtivPend.getValueAt(linha, 0)).toString());
                txtNome.setText((tabAtivPend.getValueAt(linha, 1)).toString());
                txtDescricao.setText((tabAtivPend.getValueAt(linha, 2)).toString());
                
                ((DefaultTableModel) tabAtivPend.getModel()).removeRow(linha);
            
        } else {
            JOptionPane.showMessageDialog(this, "Linha não selecionada.", "Informação",  JOptionPane.ERROR_MESSAGE   );
        }
        
    }//GEN-LAST:event_tabAtivPendMouseClicked

    private void btnRespAtivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespAtivActionPerformed
        
        enviarResposta("3;"+lblNumero.getText()+";"+txtResposta+"; ");
        txtNome.setText("");
        txtDescricao.setText("");
        lblNumero.setText("");
    }//GEN-LAST:event_btnRespAtivActionPerformed
    
    public void enviarResposta(String mensagem){
        Socket s = null;
       
       try{
           int serverPort = 7896;
           s = new Socket(server,serverPort);
           
           DataOutputStream out = new DataOutputStream(s.getOutputStream());
           out.writeUTF(mensagem);
           
       }
       catch(UnknownHostException e){
           System.out.println("Socket: "+e.getMessage());
       }
       
       catch(EOFException e){
           System.out.println("EOF: "+ e.getMessage());
       }
       
       catch(IOException e){
           System.out.println("IO: "+ e.getMessage());
       }
       
       finally{
           if(s!= null){
               try{s.close();}
               
               catch(IOException e){
                   //*close falhou*/
               }
           }
       }
    }
    
    public void enviarAtividade(){
        
        Socket s = null;
       
       try{
           int serverPort = 7896;
           s = new Socket(server,serverPort);
           
           DataInputStream in = new DataInputStream(s.getInputStream());
           DataOutputStream out = new DataOutputStream(s.getOutputStream());
           out.writeUTF("2;"+txtNome.getText()+";"+txtDescricao.getText()+";"+txtUsuario.getText());
           
           String data = in.readUTF();
           
           JOptionPane.showMessageDialog(this, "atividade "+data+" enviada com sucesso", "ENVIO ATIVIDADE", JOptionPane.INFORMATION_MESSAGE);
           
       }
       catch(UnknownHostException e){
           System.out.println("Socket: "+e.getMessage());
       }
       
       catch(EOFException e){
           System.out.println("EOF: "+ e.getMessage());
       }
       
       catch(IOException e){
           System.out.println("IO: "+ e.getMessage());
       }
       
       finally{
           if(s!= null){
               try{s.close();}
               
               catch(IOException e){
                   //*close falhou*/
               }
           }
       }
        
    }
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarAtiv;
    private javax.swing.JButton btnLogar;
    private javax.swing.JButton btnRespAtiv;
    private javax.swing.JComboBox comboAtend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAtividades;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel painelAtiv;
    private javax.swing.JPanel painelListAtiv;
    private javax.swing.JTable tabAtivPend;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextArea txtResposta;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
