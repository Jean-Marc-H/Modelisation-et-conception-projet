/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locationdevoiture;

/**
 *
 * @author Julien
 */
public class LocationDeVoitureFrame extends javax.swing.JFrame {

    /**
     * Creates new form LocationDeVoiture
     */
    public LocationDeVoitureFrame() {
        initComponents();
        aPanel.setVisible(false);
        lPanel.setVisible(false);
        rPanel.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        cPanel = new locationdevoiture.ConnectionPanel();
        aPanel = new locationdevoiture.AccueilPanel();
        lPanel = new locationdevoiture.LocationPanel();
        rPanel = new locationdevoiture.RetourPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jLayeredPane1.setLayout(new java.awt.CardLayout());
        jLayeredPane1.add(cPanel, "card2");
        cPanel.setProchain(aPanel);
        jLayeredPane1.add(aPanel, "card3");
        aPanel.setDeconnexion(cPanel);
        aPanel.setLocation(lPanel);
        aPanel.setRetour(rPanel);
        jLayeredPane1.add(lPanel, "card4");
        lPanel.setAnnuler(aPanel);
        lPanel.setConfirmer(aPanel);
        jLayeredPane1.add(rPanel, "card5");
        rPanel.setAnnuler(aPanel);
        rPanel.setConfirmer(aPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
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
            java.util.logging.Logger.getLogger(LocationDeVoitureFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocationDeVoitureFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocationDeVoitureFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocationDeVoitureFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocationDeVoitureFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private locationdevoiture.AccueilPanel aPanel;
    private locationdevoiture.ConnectionPanel cPanel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private locationdevoiture.LocationPanel lPanel;
    private locationdevoiture.RetourPanel rPanel;
    // End of variables declaration//GEN-END:variables
}
