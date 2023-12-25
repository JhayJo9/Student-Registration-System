/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login_form;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author JhayJTheGosu
 */
public class Loginf extends javax.swing.JFrame {

    /**
     * Creates new form TestingImage
     */
    public Loginf() {
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
        txt_pass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbl_createAcc = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(53, 47, 68));
        jPanel1.setPreferredSize(new java.awt.Dimension(402, 463));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_pass.setBackground(new java.awt.Color(6, 6, 8));
        txt_pass.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(185, 180, 199));
        txt_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_pass.setBorder(null);
        txt_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_passMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_passMouseExited(evt);
            }
        });
        jPanel1.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 300, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 240, 230));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 80, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 240, 230));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 70, -1));

        txt_user.setBackground(new java.awt.Color(6, 6, 8));
        txt_user.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txt_user.setForeground(new java.awt.Color(185, 180, 199));
        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_user.setBorder(null);
        txt_user.setCaretColor(new java.awt.Color(31, 31, 35));
        txt_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_userMouseExited(evt);
            }
        });
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 300, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(250, 240, 230));
        jLabel4.setText("Dont have account?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 120, -1));

        lbl_createAcc.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        lbl_createAcc.setForeground(new java.awt.Color(0, 51, 255));
        lbl_createAcc.setText("Create Account");
        lbl_createAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_createAccclickcreate(evt);
            }
        });
        jPanel1.add(lbl_createAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 100, -1));

        btn_login.setBackground(new java.awt.Color(0, 150, 255));
        btn_login.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btn_login.setForeground(java.awt.Color.white);
        btn_login.setText("Login");
        btn_login.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.setFocusPainted(false);
        btn_login.setPreferredSize(new java.awt.Dimension(140, 30));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 240, 230));
        jLabel1.setText("Welcome Back!!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 190, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\com\\mycompany\\login_form\\images\\scs-logoresize.png"));
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLabel7.setPreferredSize(new java.awt.Dimension(91, 99));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 99, 91));

        jLabel8.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\com\\mycompany\\login_form\\images\\cct-logoresize.png"));
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLabel8.setPreferredSize(new java.awt.Dimension(91, 99));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, 91));

        btn_exit.setBackground(new java.awt.Color(0, 150, 255));
        btn_exit.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(250, 240, 230));
        btn_exit.setText("Exit");
        btn_exit.setBorder(null);
        btn_exit.setPreferredSize(new java.awt.Dimension(140, 30));
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
      
    }//GEN-LAST:event_txt_userActionPerformed

    private void lbl_createAccclickcreate(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_createAccclickcreate
        signup toSignup  = new signup();
        toSignup.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_createAccclickcreate

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        System.out.println("CLICKED LOGIN");
        // CHECK IF THE USER ENTER CREDENTIALS
        if(txt_user.getText().isEmpty() && !txt_pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter username");
        }
        else if(!txt_user.getText().isEmpty() && txt_pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter passsword");
        }else if (txt_user.getText().isEmpty() && txt_pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter required fields");
        } else {
            Connection con = null;
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                con = DriverManager.getConnection("jdbc:ucanaccess://JavaLoginClone.accdb");
                Statement stmt = con.createStatement();
                String sql = "SELECT Username, Password FROM Logintbl WHERE Username = ? AND Password = ?";
                
                //String sql = "SELECT Username, Password FROM Logintbl WHERE Username = ? OR Password = ?";
                pst = con.prepareStatement(sql);
                pst.setString(1, txt_user.getText());
                pst.setString(2, txt_pass.getText());
                rs = pst.executeQuery();
                
                if (rs.next()) {
                    //Check if the query is executed
                    if (txt_user.getText().equals(rs.getString("Username")) && txt_pass.getText().equals(rs.getString("Password"))) {
                        JOptionPane.showMessageDialog(null, "Login Succesfully");
                        MainForm m = new MainForm();
                        m.setVisible(true);
                        this.setVisible(false);
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect password");
                    //JOptionPane.showMessageDialog(null, "Username not found");
                }
            }catch (HeadlessException | ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_userMouseEntered
        txt_user.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1)); // border pixel
    }//GEN-LAST:event_txt_userMouseEntered

    private void txt_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_userMouseExited
      txt_user.setBorder(null);
    }//GEN-LAST:event_txt_userMouseExited

    private void txt_passMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passMouseEntered
         txt_pass.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1)); //border pixel
    }//GEN-LAST:event_txt_passMouseEntered

    private void txt_passMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passMouseExited
       txt_pass.setBorder(null);
    }//GEN-LAST:event_txt_passMouseExited

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
       int ask = JOptionPane.showConfirmDialog(null ,"Do you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
        if(ask == JOptionPane.YES_NO_OPTION){
            dispose();
        }
    }//GEN-LAST:event_btn_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Loginf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_createAcc;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
