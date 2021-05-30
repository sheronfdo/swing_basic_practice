/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JProgressBar;


/**
 *
 * @author Jamit
 */

public class progress extends JFrame {
    public progress(){
        gui();
        fill();
    }
    
    JProgressBar bar = new JProgressBar();
    public void gui(){
        
        bar.setValue(0);
        bar.setBounds(0, 0, 484, 20);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 15));
        bar.setBackground(Color.red);
        bar.setForeground(Color.blue);
        
        this.add(bar);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(1500, 0, 500, 500);
        
        
        this.setVisible(true);
    
    }
    public void fill(){
        while (true){
            for(int i = 0; i <101; i++){
                bar.setValue(i);
                try {
                    sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(progress.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            bar.setString("successfully completed");
            try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(progress.class.getName()).log(Level.SEVERE, null, ex);
                }
            for(int i = 100; i >-1; i--){
                bar.setValue(i);
                try {
                    sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(progress.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            bar.setString("get ZERO");
            try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(progress.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
