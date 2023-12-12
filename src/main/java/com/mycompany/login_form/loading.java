/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.mycompany.login_form;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author JhayJTheGosu
 */
public class loading extends SplashScreen {
    public static void main(String args []){
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
                    LogIn frame5 = new LogIn();
                    fr1.setVisible(false);
                    frame5.setVisible(true);
                }
            }catch(InterruptedException x){
                System.out.println(x);
            }
        }
    }
}
