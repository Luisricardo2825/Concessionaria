package view.Start;


import view.Gerente.Prin_gerente;
import view.login.Login;
import java.awt.Color;
import javax.swing.*;
import javax.swing.UnsupportedLookAndFeelException;

public class Start extends javax.swing.JFrame{
    public Start() throws InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{  view.login.Login p= new Login();
        Splash splash = new Splash();
        splash.setVisible(true);
        
                 try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Prin_gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
                 try {
            for (int i = 0; i <=101; i++) {
               Thread.sleep(50);
                 splash.contador.setText(Integer.toString(i)+'%');
               
                   splash.getContentPane()
                         .add(splash.reloa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, (int) (i*2.75), 2));
                
                     // splash.reloa.setBackground(new java.awt.Color(i-i, (int) (i*2.5), i*2-i));
                  
               if(i<30){
                splash.contador.setForeground(new Color(255,0,0));
                splash.reloa.setBackground(new Color(255,0,0));
                }
               if(i==50){
                splash.contador.setForeground(new Color(255,255,0));
                splash.reloa.setBackground(new Color(255,255,0));
                }
               if(i==80){
                splash.contador.setForeground(new Color(0,245,0));
                splash.reloa.setBackground(new Color(0,245,0));
                }
               if (i==101) {    
                    splash.dispose();
                          p.setVisible(true);}
           }}catch (Exception e) {}}
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
      new Start();
    }
}
