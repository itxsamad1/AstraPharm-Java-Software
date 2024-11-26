/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astrapharm;

import javax.swing.JOptionPane;

/**
 *
 * @author SamHacker
 */
public class Calcee extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    String id;
    public Calcee(String id) {
        initComponents();
        this.id=id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        mquantity = new javax.swing.JSpinner();
        cart = new javax.swing.JLabel();
        buy = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));
        getContentPane().add(mquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 100, 40));

        cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartMouseClicked(evt);
            }
        });
        getContentPane().add(cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 100, 40));

        buy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyMouseClicked(evt);
            }
        });
        getContentPane().add(buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/astrapharm/Medicine Description Calcee.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new CustomerHome1(this.id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMouseClicked
        // TODO add your handling code here:
        Object value = mquantity.getValue();
        int calcee = (Integer) value;
        int trate = 102*calcee;
        String med=value.toString()+"  :Calcee";
        DB_Model_AP db=new DB_Model_AP();
        try{
            int st=0;
            st=db.AddToCart(id, med,Integer.toString(trate));
            if(st!=0){
            JOptionPane.showMessageDialog(this, "Medicine Added to Cart ", "Cart", 1);
            }else{
            JOptionPane.showMessageDialog(this, "Add to Cart Error", "Alert", 2);
            }
        }catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_cartMouseClicked

    private void buyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyMouseClicked
        // TODO add your handling code here:
        Object value = mquantity.getValue();
        int calcee = (Integer) value;
        int trate = 10*calcee;
        String med= " Calcee";
        DB_Model_AP db=new DB_Model_AP();
        try{
            int st=0;
            st=db.Userbuy(id, med,Integer.toString(trate));
            if(st!=0){
                String t=""+trate;
            new CustomerBuy(id,t).setVisible(true);
            this.dispose();
            }else{
            JOptionPane.showMessageDialog(this, "Some error occur", "Alert", 2);
            }
        }catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_buyMouseClicked

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
            java.util.logging.Logger.getLogger(Calcee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcee("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buy;
    private javax.swing.JLabel cart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner mquantity;
    // End of variables declaration//GEN-END:variables
}
