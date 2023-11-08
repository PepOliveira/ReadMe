package br.com.login.view;

/**
 *
 * @author João Pedro Timo Angelotti Pinto
 */
public class DoacaoFinalizadaView extends javax.swing.JFrame {

    public DoacaoFinalizadaView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonTelaInicial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonTelaInicial.setBorderPainted(false);
        jButtonTelaInicial.setContentAreaFilled(false);
        jButtonTelaInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTelaInicialActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTelaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 200, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Finalizacao.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTelaInicialActionPerformed
        LoginView telaDeLogin = new LoginView();
        telaDeLogin.setVisible(true);
    }//GEN-LAST:event_jButtonTelaInicialActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoacaoFinalizadaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTelaInicial;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
