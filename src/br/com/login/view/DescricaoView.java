package br.com.login.view;

/**
 *
 * @author João Pedro Timo Angelotti Pinto
 */
import ConexaoDAO.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DescricaoView extends javax.swing.JFrame {

    Connection conexaoDAO = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public DescricaoView() {
        initComponents();
        conexaoDAO = new Conexao().conector();
    }

    public void Brinquedo() {
        String sql = "INSERT INTO brinquedo (nome, usuario, telefone, descricao) VALUES (?,?,?,?)";
        try {
            pst = conexaoDAO.prepareStatement(sql);
            pst.setString(1, jTextFieldNome.getText());
            pst.setString(2, jTextFieldUsuario.getText());
            pst.setString(3, jTextFieldTelefone.getText());
            pst.setString(4, jTextFieldDescricao.getText());
            if (jTextFieldNome.getText().isEmpty() || jTextFieldUsuario.getText().isEmpty() || jTextFieldTelefone.getText().isEmpty() || jTextFieldDescricao.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");

            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Brinquedo cadastrado com sucesso");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jButtonAvancar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldTelefone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 220, 30));

        jTextFieldUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 220, 30));

        jTextFieldNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 220, 30));

        jTextFieldDescricao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 220, 30));

        jButtonVoltar.setBorderPainted(false);
        jButtonVoltar.setContentAreaFilled(false);
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 120, 30));

        jButtonAvancar.setBorderPainted(false);
        jButtonAvancar.setContentAreaFilled(false);
        jButtonAvancar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvancarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DadosDescricao.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneActionPerformed

    }//GEN-LAST:event_jTextFieldTelefoneActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        LoginView telaDeLogin = new LoginView();
        telaDeLogin.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvancarActionPerformed
        if (descricaoBrinquedoPreenchida()) {
            Brinquedo();
            InstituicaoView telaInstituicao = new InstituicaoView();
            telaInstituicao.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
    }

// Método para verificar se o campo de descrição do brinquedo está preenchido
    private boolean descricaoBrinquedoPreenchida() {
        return !jTextFieldTelefone.getText().isEmpty();
    }//GEN-LAST:event_jButtonAvancarActionPerformed

    private void jTextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoActionPerformed

    }//GEN-LAST:event_jTextFieldDescricaoActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed

    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed

    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DescricaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAvancar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
