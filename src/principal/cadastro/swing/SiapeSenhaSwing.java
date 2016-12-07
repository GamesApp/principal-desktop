/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.cadastro.swing;

import Criptografia.CodCifraDeVigenere;
import Criptografia.ExemploCriptografia;
import conexaodb.RequisicaoHttp;
import entidades.pessoa.Professor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import professor.swing.InformacoesSwing;
import professor.swing.ProfessorSwing;

/**
 *
 * @author matheush
 */
public class SiapeSenhaSwing extends javax.swing.JFrame {

    private String email;
    
    public SiapeSenhaSwing(String email) {
        this.email = email;
        
        initComponents();
        
        setSize(700,500);
        setLocationRelativeTo(null);
        
        jPFSenhaProfessor.setText("");
        jPFConfirmaSenhaProfessor.setText("");
    }

    SiapeSenhaSwing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTFSiapeProfessor = new javax.swing.JTextField();
        jPFSenhaProfessor = new javax.swing.JPasswordField();
        jPFConfirmaSenhaProfessor = new javax.swing.JPasswordField();
        jBSalvarProfessor = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLbInfo = new javax.swing.JLabel();
        jTFNomeProfessor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gamesapp/logo_escrita_250_86.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jPFSenhaProfessor.setText("jPasswordField1");

        jPFConfirmaSenhaProfessor.setText("jPasswordField1");

        jBSalvarProfessor.setBackground(new java.awt.Color(12, 12, 4));
        jBSalvarProfessor.setForeground(new java.awt.Color(248, 241, 241));
        jBSalvarProfessor.setText("Salvar");
        jBSalvarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarProfessorActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trintaseis/num1-ver (2).png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trintaseis/num2-ver.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trintaseis/num3-ver.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trintaseis/num4-cinza.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/file-outline.png"))); // NOI18N
        jLabel3.setText("Informações do Professor: ");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(133, 130, 130));
        jLabel4.setText("Senha: ");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(133, 130, 130));
        jLabel5.setText("Digite o seu Siape: ");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(133, 130, 130));
        jLabel10.setText("Repita a senha: ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gamesapp/logo_escrita_250_86.png"))); // NOI18N

        jLbInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/comment-question-outline (1).png"))); // NOI18N
        jLbInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbInfoMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(133, 130, 130));
        jLabel11.setText("Nome: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel9))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel11)
                .addGap(249, 249, 249)
                .addComponent(jLabel4))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jTFNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPFSenhaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLbInfo))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel5)
                .addGap(177, 177, 177)
                .addComponent(jLabel10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jTFSiapeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPFConfirmaSenhaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jBSalvarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel11))
                    .addComponent(jLabel4))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTFNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPFSenhaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbInfo))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10)))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFSiapeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPFConfirmaSenhaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jBSalvarProfessor))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarProfessorActionPerformed
        if (!jTFSiapeProfessor.getText().equals("") && !jTFNomeProfessor.getText().equals("")) {
            
            if (String.valueOf(jPFSenhaProfessor.getPassword()).equals(String.valueOf(jPFConfirmaSenhaProfessor.getPassword()))) {
                String senhaProfessor = String.valueOf(jPFSenhaProfessor.getPassword());
                //System.out.println("Senha professor: "+senhaProfessor);
                
                //VERIFICAR SE ESTÁ CORRETO A FUCK DA SENHA
                
                ExemploCriptografia ex = new ExemploCriptografia();
                String senhaCriptografada = ex.GeraCriptografia(senhaProfessor, 1);
                
                //System.out.println("senha professor criptografada: "+senhaCriptografada);
                //salvar PROFESSOR NO BANCO
                //CONSUMIR REQUISICAOHTTP MÉTODO SENDPOST
                
                Professor professor = new Professor();
                professor.setEmail(email);
                professor.setNome(jTFNomeProfessor.getText());
                professor.setSiape(jTFSiapeProfessor.getText());
                professor.setSenha(senhaCriptografada);
                
                try {
                    new RequisicaoHttp().insertProfessor(professor);
                } catch (Exception ex1) {
                    //colocar dialog de erro de conexão
                    Logger.getLogger(SiapeSenhaSwing.class.getName()).log(Level.SEVERE, null, ex1);
                }
                
                this.setVisible(false);
                //REVER ESSA INFORMAÇÕES SWING
                //new InformacoesSwing().setVisible(true);
                new ProfessorSwing().setVisible(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "Os campos de nova senha não coincidem!");
                jPFSenhaProfessor.setText("");
                jPFConfirmaSenhaProfessor.setText("");
            }
        }
       
    }//GEN-LAST:event_jBSalvarProfessorActionPerformed

    private void jLbInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbInfoMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Por favor, sua senha não deverá conter acentos! \nDica: utilize letras maiúsculas, minúsculas, números e caracteres especiais.\nIsso irá garantir uma maior segurança de suas senhas!" );
    }//GEN-LAST:event_jLbInfoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalvarProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLbInfo;
    private javax.swing.JPasswordField jPFConfirmaSenhaProfessor;
    private javax.swing.JPasswordField jPFSenhaProfessor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTFNomeProfessor;
    private javax.swing.JTextField jTFSiapeProfessor;
    // End of variables declaration//GEN-END:variables
}
