/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
*/
package com.mycompany.login_form;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author JhayJTheGosu
 */
public class SplashScreen extends javax.swing.JFrame {
    public SplashScreen() {
        initComponents();
        
         // jframe bg color
        Color kulay = new Color(67,83,61);
        getContentPane().setBackground(kulay); 
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        pleasewait = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jProgressBar1.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jProgressBar1.setStringPainted(true);

        pleasewait.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        pleasewait.setText("Please wait.....");

        jLabel1.setBackground(new java.awt.Color(248, 250, 229));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 250, 229));
        jLabel1.setText("Netbeans with MS Access");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pleasewait)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pleasewait)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        SplashScreen fr1 = new SplashScreen();
        //Login_Form fr2 = new Login_Form();
        fr1.setVisible(true);
        
         for(int i = 1;i <= 100;i++){
            try{
                Thread.sleep(80);
                fr1.jProgressBar1.setValue(i);
                if(i% 2 == 0){
                    fr1.pleasewait.setText("Please wait..");
                }
                else if(i% 3 == 0){
                    fr1.pleasewait.setText("Please wait...");
                }
                else {
                    fr1.pleasewait.setText("Please wait.");
                }
                if(i == 100){
                    Loginf frame5 = new Loginf();
                    fr1.setVisible(false);
                    frame5.setVisible(true);
                }
            }catch(InterruptedException x){
                System.out.println(x);
            }
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(false);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JProgressBar jProgressBar1;
    public javax.swing.JLabel pleasewait;
    // End of variables declaration//GEN-END:variables
}
