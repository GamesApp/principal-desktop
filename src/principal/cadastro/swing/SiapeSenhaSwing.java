/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.cadastro.swing;

import Criptografia.CodCifraDeVigenere;
import Criptografia.ExemploCriptografia;
import javax.swing.JOptionPane;
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel6)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel7)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel9)))
                .addContainerGap(184, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jTFSiapeProfessor)
                            .addComponent(jPFSenhaProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                            .addComponent(jPFConfirmaSenhaProfessor))
                        .addGap(3, 3, 3)
                        .addComponent(jLbInfo)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBSalvarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTFSiapeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPFSenhaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPFConfirmaSenhaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jBSalvarProfessor)
                .addGap(56, 56, 56))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarProfessorActionPerformed
        if (!jTFSiapeProfessor.getText().equals("")) {
            
             if (String.valueOf(jPFSenhaProfessor.getPassword()).equals(String.valueOf(jPFConfirmaSenhaProfessor.getPassword()))) {
                String SenhaProfessor = String.valueOf(jPFSenhaProfessor.getPassword());
                System.out.println("Senha professor: "+SenhaProfessor);
                
                ExemploCriptografia ex = new ExemploCriptografia();
                String SenhaCriptografada = ex.GeraCriptografia(SenhaProfessor, 1);
                
                System.out.println("senha professor criptografada: "+SenhaCriptografada);
                //salvar PROFESSOR NO BANCO
                
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
    private javax.swing.JTextField jTFSiapeProfessor;
    // End of variables declaration//GEN-END:variables
}
