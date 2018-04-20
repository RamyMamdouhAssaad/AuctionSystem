/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Page3_Register extends javax.swing.JFrame {
     public Page3_Register() {
        initComponents();
        this.setSize(600, 600);
    }
    String username;
   String FirstName;
   String LastName;
   String Password;
   String Email;
   int visaCardNumber;
    String k = Integer.toString(visaCardNumber);
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 0, 200, 70);

        jButton4.setText("Login");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(360, 50, 80, 23);

        jTextField1.setText("First Name:");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(60, 190, 100, 25);

        jTextField2.setText("Last Name:");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(60, 230, 100, 25);

        jTextField3.setText("Password:");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(60, 270, 100, 25);

        jTextField4.setText("User Card No.:");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(60, 350, 100, 25);

        jTextField5.setText("Username:");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(60, 150, 100, 25);

        jTextField6.setText("Email:");
        getContentPane().add(jTextField6);
        jTextField6.setBounds(60, 310, 100, 25);

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 390, 80, 30);

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 390, 80, 30);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(200, 190, 220, 20);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(200, 230, 220, 20);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(200, 270, 220, 20);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(200, 310, 220, 20);
        getContentPane().add(jTextField11);
        jTextField11.setBounds(200, 350, 220, 20);
        getContentPane().add(jTextField12);
        jTextField12.setBounds(200, 150, 220, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg - Copy (4).jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-3, 80, 1000, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                Page2_Login s = new Page2_Login();
                s.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField12.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       username = jTextField12.getText();
         Password = jTextField9.getText();                                                               
        FirstName = jTextField7.getText();
        LastName = jTextField8.getText();
       
         Connection con = null; //manages connection

        
     try 
      {
            //Connect to your ODBC
          con =DriverManager.getConnection("jdbc:mysql://localhost/auction","root","");
         // create Statement for querying database
             System.out.println("Now we are reading Data");
            
            
           PreparedStatement ps = con.prepareStatement("insert into user_information(username,UserPassword) values (?,?)");
        
           ps.setString(1, username);
           ps.setString(2, Password);

           
           ps.executeUpdate(); 
           System.out.println ("\n After insert:");
 
      }    
      
     catch ( Exception e )  {                                                                  
         e.printStackTrace();
      }
     
     finally
     {
         try
         {
                                           
          con.close(); 
          
      }
      catch ( Exception e )                                
      {                                                                  
         e.printStackTrace();
      }                                                    
     }                                                                                          
     
      JOptionPane.showMessageDialog(null, "Registeration Successfull");
        Page2_Login m = new Page2_Login();
        m.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Page3_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page3_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page3_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page3_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page3_Register().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
