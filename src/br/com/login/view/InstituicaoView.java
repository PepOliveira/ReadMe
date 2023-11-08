package br.com.login.view;

/**
 *
 * @author João Pedro Timo Angelotti Pinto
 */
public class InstituicaoView extends javax.swing.JFrame {

    public InstituicaoView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltar2 = new javax.swing.JButton();
        jButtonAvancar12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVoltar2.setBorderPainted(false);
        jButtonVoltar2.setContentAreaFilled(false);
        jButtonVoltar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 120, 40));

        jButtonAvancar12.setBorderPainted(false);
        jButtonAvancar12.setContentAreaFilled(false);
        jButtonAvancar12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAvancar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvancar12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAvancar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Instituição.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltar2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVoltar2ActionPerformed

    private void jButtonAvancar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvancar12ActionPerformed
        DoacaoFinalizadaView telaDeFinalizacao = new DoacaoFinalizadaView();
        telaDeFinalizacao.setVisible(true);
    }//GEN-LAST:event_jButtonAvancar12ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstituicaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAvancar12;
    private javax.swing.JButton jButtonVoltar2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
