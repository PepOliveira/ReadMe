package br.com.login.view;

/**
 *
 * @author João Pedro Timo Angelotti Pinto
 */
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.*;
import ConexaoDAO.Conexao;
import javax.swing.JOptionPane;

public class CadastroView extends javax.swing.JFrame {

    Connection conexaoDAO = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public CadastroView() {
        initComponents();
        conexaoDAO = new Conexao().conector();
    }

    public void CriarUsuario() {
        String sql = "INSERT INTO login (nome, email, senha) VALUES(?,?,?)";
        try {
            pst = conexaoDAO.prepareStatement(sql);
            pst.setString(1, jTextFieldNome.getText());
            pst.setString(2, jTextFieldEmail.getText());
            String captura = new String(jPasswordFieldSenha.getPassword());
            pst.setString(3, captura);
            if (jTextFieldNome.getText().isEmpty() || (jTextFieldEmail.getText().isEmpty() || jPasswordFieldSenha.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
                }

                jTextFieldNome.setText("");
                jTextFieldEmail.setText("");
                jPasswordFieldSenha.setText("");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 210, 30));

        jTextFieldNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 210, 30));

        jPasswordFieldSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 210, 30));

        jButtonCadastrar.setBorderPainted(false);
        jButtonCadastrar.setContentAreaFilled(false);
        jButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CADASTRO.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed

    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed

    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        if (camposPreenchidos()) {
            CriarUsuario();
            this.setVisible(false); // Oculta a tela de cadastro

            LoginView loginView = new LoginView();
            loginView.setVisible(true); // Mostra a tela de login
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de cadastrar.");
        }
    }

// Método para verificar se todos os campos estão preenchidos
    private boolean camposPreenchidos() {
        return !jTextFieldNome.getText().isEmpty()
                && !jTextFieldEmail.getText().isEmpty()
                && !String.valueOf(jPasswordFieldSenha.getPassword()).isEmpty();

    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    public JPasswordField getjPasswordFieldSenha() {
        return jPasswordFieldSenha;
    }

    public void setjPasswordFieldSenha(JPasswordField jPasswordFieldSenha) {
        this.jPasswordFieldSenha = jPasswordFieldSenha;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public void setjTextFieldEmail(JTextField jTextFieldEmail) {
        this.jTextFieldEmail = jTextFieldEmail;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
