/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import swing.launching;

/**
 *
 * @author Jamit
 */
public class launchpage implements ActionListener {
    static JFrame frame = new JFrame();
    static JButton button = new JButton();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new launchpage();
    }
    launchpage(){    
        
        button.setText("click me");
        button.setBounds(200, 225, 100, 50);
        button.addActionListener(this);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(150, 0, 500, 500);
        frame.setLayout(null);
        frame.add(button);
        
        frame.setVisible(true);
        
    }
    
    //public static class evt implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button){
                launching launch = new launching();
                launch.setvisible();
                
            }
        }
    
    //}
    
}
