/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandit.View;

/**
 *
 * @author Fabian
 */
public class Fenster extends javax.swing.JFrame {

    /**
     * @return the btnStart
     */
    public javax.swing.JButton getBtnStart() {
        return btnStart;
    }

    /**
     * @return the btnStopp
     */
    public javax.swing.JButton getBtnStopp() {
        return btnStopp;
    }

    /**
     * @return the lblNumber1
     */
    public javax.swing.JLabel getLblNumber1() {
        return lblNumber1;
    }

    /**
     * @return the lblNumber2
     */
    public javax.swing.JLabel getLblNumber2() {
        return lblNumber2;
    }

    /**
     * @return the lblNumber3
     */
    public javax.swing.JLabel getLblNumber3() {
        return lblNumber3;
    }

    /**
     * Creates new form Fenster
     */
    public Fenster() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        btnStopp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblNumber1 = new javax.swing.JLabel();
        lblNumber2 = new javax.swing.JLabel();
        lblNumber3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnStart.setText("Start");
        jPanel1.add(btnStart);

        btnStopp.setText("Stopp");
        jPanel1.add(btnStopp);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        lblNumber1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 60)); // NOI18N
        lblNumber1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumber1.setMinimumSize(new java.awt.Dimension(50, 150));
        lblNumber1.setPreferredSize(new java.awt.Dimension(100, 300));
        jPanel2.add(lblNumber1);

        lblNumber2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 60)); // NOI18N
        lblNumber2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumber2.setMinimumSize(new java.awt.Dimension(50, 150));
        lblNumber2.setPreferredSize(new java.awt.Dimension(100, 300));
        jPanel2.add(lblNumber2);

        lblNumber3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 60)); // NOI18N
        lblNumber3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumber3.setMinimumSize(new java.awt.Dimension(50, 150));
        lblNumber3.setPreferredSize(new java.awt.Dimension(100, 300));
        jPanel2.add(lblNumber3);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(418, 347));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Fenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fenster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStopp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNumber1;
    private javax.swing.JLabel lblNumber2;
    private javax.swing.JLabel lblNumber3;
    // End of variables declaration//GEN-END:variables
}
