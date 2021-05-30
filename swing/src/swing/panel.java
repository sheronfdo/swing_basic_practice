 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jamit
 * this uses JFrame JPanel and their components
 * border layout and any other classes
 */
public class panel {
    public static void main(String []args){
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setBounds(1500,0,500,500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(5,5));
        
        JPanel panel = new JPanel();
        //panel.setBounds(0, 0, 100, 100);
        panel.setPreferredSize(new Dimension(0,100));
        //panel.setForeground(Color.white);
        panel.setBackground(Color.red);
        frame.add(panel,BorderLayout.NORTH);
        
        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(100,0));
        panel2.setBackground(Color.BLUE);
        frame.add(panel2,BorderLayout.WEST);
        
        JPanel panel3 = new JPanel();
        panel3.setPreferredSize(new Dimension(100,0));
        panel3.setBackground(Color.GREEN);
        frame.add(panel3,BorderLayout.EAST);
        
        JPanel panel4 = new JPanel();
        panel4.setPreferredSize(new Dimension(0,100));
        panel4.setBackground(Color.black);
        frame.add(panel4, BorderLayout.SOUTH);
        
        JPanel panel5 = new JPanel();
        panel5.setPreferredSize(new Dimension(0,100));
        panel5.setBackground(Color.yellow);
        frame.add(panel5, BorderLayout.CENTER);
        
    }

    
}
