/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.login.swing;

import Criptografia.CodCifraDeVigenere;
import Criptografia.ExemploCriptografia;
import RecuperarSenha.RecuperarSenha;
import conexaodb.RequisicaoHttp;
import entidades.pessoa.Professor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import principal.cadastro.swing.CadastroSwing;
import principal.cadastro.swing.SiapeSenhaSwing;
import professor.swing.ProfessorSwing;

/**
 *
 * @author matheush
 */
public class LoginSwing extends javax.swing.JFrame {

    /**
     * Creates new form LoginSwing
     */
    public LoginSwing() {
        initComponents();
        
        setSize(700, 500);
        setLocationRelativeTo(null);
        jPFProfessorSenha.setText("");
        jLbRecuperarSenha.setText("<html><u>Recuperar senha</u>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFProfessorLogin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPFProfessorSenha = new javax.swing.JPasswordField();
        jBEntrar = new javax.swing.JButton();
        jBCadastrar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLbRecuperarSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gamesapp/logo_escrita_250_86.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(133, 130, 130));
        jLabel4.setText("Login: ");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(133, 130, 130));
        jLabel5.setText("Senha:");

        jPFProfessorSenha.setText("jPasswordField1");

        jBEntrar.setBackground(new java.awt.Color(1, 1, 1));
        jBEntrar.setForeground(new java.awt.Color(254, 254, 254));
        jBEntrar.setText("Entrar");
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });

        jBCadastrar.setBackground(new java.awt.Color(1, 1, 1));
        jBCadastrar.setForeground(new java.awt.Color(252, 245, 245));
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBCancelar.setBackground(new java.awt.Color(1, 1, 1));
        jBCancelar.setForeground(new java.awt.Color(253, 248, 248));
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jLbRecuperarSenha.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLbRecuperarSenha.setForeground(new java.awt.Color(15, 126, 14));
        jLbRecuperarSenha.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLbRecuperarSenha.setText("Recuperar senha");
        jLbRecuperarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbRecuperarSenhaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jTFProfessorLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jPFProfessorSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLbRecuperarSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(61, 61, 61)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(jTFProfessorLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(jPFProfessorSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbRecuperarSenha)
                .addGap(32, 32, 32)
                .addComponent(jBEntrar)
                .addGap(6, 6, 6)
                .addComponent(jBCadastrar)
                .addGap(6, 6, 6)
                .addComponent(jBCancelar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        // TODO add your handling code here:
        new CadastroSwing().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
        if (!jTFProfessorLogin.getText().equals("") && !String.valueOf(jPFProfessorSenha.getPassword()).equals("")) {
            CodCifraDeVigenere criptografar = new CodCifraDeVigenere(String.valueOf(jPFProfessorSenha.getPassword()));
            String senhaCriptografada = criptografar.cifrar();
            
            try {
                Professor professor = new RequisicaoHttp().loginProfessor(jTFProfessorLogin.getText(), senhaCriptografada);
                System.out.println("professor" + professor.toString());
                
                if (professor.getEmail() != null) {
                    System.out.println("passa");
                    
                    new ProfessorSwing().setVisible(true);
                    this.setVisible(false);
                } else {
                    
                    JOptionPane.showMessageDialog(null, "E-mail e/ou senha inválidos!\nFavor verificar e tentar novamente\n\nVocê pode clicar em cadastrar para criar um usuário", "Login não permitidos", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception ex) {
                Logger.getLogger(LoginSwing.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Favor preencha todos os campos!", "Erro no login", JOptionPane.WARNING_MESSAGE);
        }
        //verificar no banco o login e senha
        //
        //this.dispose();
    }//GEN-LAST:event_jBEntrarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jLbRecuperarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbRecuperarSenhaMouseClicked
        //recuperar senha
        if (!jTFProfessorLogin.getText().equals("")) {
            //procurar o email no banco
            String email = jTFProfessorLogin.getText();
            //pegar a senha do respectivo email e descriptografar
            String senha= "cF^IJ/cZM\\";//estará gravada no bando criptografada
            ExemploCriptografia recSenha = new ExemploCriptografia();
            String senhaDescriptografada = recSenha.GeraCriptografia(senha, 2);
            
            try{
                RecuperarSenha EnviaEmail = new RecuperarSenha();
                EnviaEmail.EnviarEmail(email, senhaDescriptografada);
                JOptionPane.showMessageDialog(null, "Dentro de instantes receberá sua senha no email cadastrado");

            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Não foi possível enviar o email\nVerifique seu email de login e a conexão com a internet\nObrigado!");
                jTFProfessorLogin.setText("");
        }
        }else{
            JOptionPane.showMessageDialog(null, "Informe seu email de login");
        }
        
    }//GEN-LAST:event_jLbRecuperarSenhaMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEntrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLbRecuperarSenha;
    private javax.swing.JPasswordField jPFProfessorSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFProfessorLogin;
    // End of variables declaration//GEN-END:variables
}
