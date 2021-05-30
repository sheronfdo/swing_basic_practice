/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Jamit
 */
public class gridlayout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(1500, 0, 500, 500);
        //frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3, 3,10,10)); //new GridLayout(3, 3)
        
        JButton but1 = new JButton("1");
        frame.add(but1);
        JButton but2 = new JButton("2");
        frame.add(but2);
        JButton but3 = new JButton("3");
        frame.add(but3);
        JButton but4 = new JButton("4");
        frame.add(but4);
        JButton but5 = new JButton("5");
        frame.add(but5);
        JButton but6 = new JButton("6");
        frame.add(but6);
        JButton but7 = new JButton("7");
        frame.add(but7);
        JButton but8 = new JButton("8");
        frame.add(but8);
        JButton but9 = new JButton("9");
        frame.add(but9);
        
        
        
        frame.setVisible(true);
        
    }
    
}
