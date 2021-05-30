/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jamit
 */
public class flowlayout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(1500, 0, 500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 350));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        JButton but1 = new JButton("1");
        panel.add(but1);
        JButton but2 = new JButton("2");
        panel.add(but2);
        JButton but3 = new JButton("3");
        panel.add(but3);
        JButton but4 = new JButton("4");
        panel.add(but4);
        JButton but5 = new JButton("5");
        panel.add(but5);
        JButton but6 = new JButton("6");
        panel.add(but6);
        JButton but7 = new JButton("7");
        panel.add(but7);
        JButton but8 = new JButton("8");
        panel.add(but8);
        JButton but9 = new JButton("9");
        panel.add(but9);
        
        frame.add(panel);
        frame.setVisible(true);
        
    }
    
}
