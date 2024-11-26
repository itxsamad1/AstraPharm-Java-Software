/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astrapharm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author SamHacker
 */
public class CustomerRegister extends javax.swing.JFrame {

    /**
     * Creates new form ShopkeeperRegister
     */
    
    public CustomerRegister() {
        initComponents();
        l1.setText("");
        l2.setText("");
        l3.setText("");
        l4.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        ccontact = new javax.swing.JTextField();
        caddress = new javax.swing.JTextField();
        cuser = new javax.swing.JTextField();
        cpass = new javax.swing.JTextField();
        crpass = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 170, 20));

        l2.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 170, 20));

        l3.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 170, 20));

        l4.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 320, 20));

        cname.setText("Enter Your  Name");
        cname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cnameMouseClicked(evt);
            }
        });
        cname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cnameKeyReleased(evt);
            }
        });
        getContentPane().add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 140, -1));

        ccontact.setText("Enter Contact #");
        ccontact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ccontactMouseClicked(evt);
            }
        });
        ccontact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ccontactKeyReleased(evt);
            }
        });
        getContentPane().add(ccontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 100, -1));

        caddress.setText("Enter Your Local Address");
        caddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caddressMouseClicked(evt);
            }
        });
        getContentPane().add(caddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 190, -1));

        cuser.setText("Enter User/ID");
        cuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuserMouseClicked(evt);
            }
        });
        cuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cuserKeyReleased(evt);
            }
        });
        getContentPane().add(cuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 110, -1));

        cpass.setText("Set Password");
        cpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpassMouseClicked(evt);
            }
        });
        cpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpassKeyReleased(evt);
            }
        });
        getContentPane().add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 110, -1));

        crpass.setText("Re-type Password");
        crpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crpassMouseClicked(evt);
            }
        });
        getContentPane().add(crpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 130, -1));

        jButton2.setBackground(new java.awt.Color(0, 153, 102));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 100, 30));

        jButton1.setBackground(new java.awt.Color(0, 153, 102));
        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 140, 30));

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/astrapharm/5. Customer.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(cpass.getText().equals(crpass.getText())){
        DB_Model_AP db= new DB_Model_AP();
        try{
        db.CustomerRegister(cname.getText(), cuser.getText(), ccontact.getText(), caddress.getText(), cpass.getText());
        }catch(Exception e){System.out.println(e);}
        JOptionPane.showMessageDialog(this, "Now! You are redirected to Login Page.","Account Created",1);
        new CustomerLogin().setVisible(true);
        this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Enter Both Password same", "Passowrd Mismatch", 2);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new CustomerLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cnameMouseClicked
        // TODO add your handling code here:
        cname.setText("");
    }//GEN-LAST:event_cnameMouseClicked

    private void cuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuserMouseClicked
        // TODO add your handling code here:
        cuser.setText("");
    }//GEN-LAST:event_cuserMouseClicked

    private void ccontactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ccontactMouseClicked
        // TODO add your handling code here:
        ccontact.setText("");
    }//GEN-LAST:event_ccontactMouseClicked

    private void caddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caddressMouseClicked
        // TODO add your handling code here:
        caddress.setText("");
    }//GEN-LAST:event_caddressMouseClicked

    private void cpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpassMouseClicked
        // TODO add your handling code here:
        cpass.setText("");
    }//GEN-LAST:event_cpassMouseClicked

    private void crpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crpassMouseClicked
        // TODO add your handling code here:
        crpass.setText("");
    }//GEN-LAST:event_crpassMouseClicked

    private void cnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnameKeyReleased
        // TODO add your handling code here:
        Pattern p1=Pattern.compile("[a-zA-Z ]{3,15}");
        Matcher m1=p1.matcher(cname.getText());
        if(!m1.matches()){
        l1.setText("Use atleast 3 characters");
        }else{
        l1.setText("");
        }
    }//GEN-LAST:event_cnameKeyReleased

    private void cuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuserKeyReleased
        // TODO add your handling code here:
        Pattern p2=Pattern.compile("[a-zA-Z0-9]{3,}+(@astra)");
        Matcher m2=p2.matcher(cuser.getText());
        if(!m2.matches()){
        l2.setText("ID should be xy12@astra");
        }else{
        l2.setText("");
        }
    }//GEN-LAST:event_cuserKeyReleased

    private void ccontactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccontactKeyReleased
        // TODO add your handling code here:
        Pattern p3=Pattern.compile("(030|031|032|033|034)+[0-9]{8}");
        Matcher m3=p3.matcher(ccontact.getText());
        if(!m3.matches()){
        l3.setText("e.g 03(complete 11 digits)");
        }else{
        l3.setText("");
        }
    }//GEN-LAST:event_ccontactKeyReleased

    private void cpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpassKeyReleased
        // TODO add your handling code here:
        Pattern p4=Pattern.compile("[a-zA-z0-9!@#$%^&*]{8,}");
        Matcher m4=p4.matcher(cpass.getText());
        if(!m4.matches()){
        l4.setText("It should have atleast 8 characters(+special) ");
        }else{
        l4.setText("");
        }
    }//GEN-LAST:event_cpassKeyReleased

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
            java.util.logging.Logger.getLogger(CustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caddress;
    private javax.swing.JTextField ccontact;
    private javax.swing.JTextField cname;
    private javax.swing.JTextField cpass;
    private javax.swing.JTextField crpass;
    private javax.swing.JTextField cuser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    // End of variables declaration//GEN-END:variables
}