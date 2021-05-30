/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;



/**
 *
 * @author Jamit
 */
public class rbutton {
    static JFrame frame = new JFrame();
    static JRadioButton pizza = new JRadioButton("Pizza");
    static JRadioButton hamburger = new JRadioButton("Hamburger");
    static JRadioButton hotdog = new JRadioButton("Hotdog");
    static ImageIcon pizzaicon = new ImageIcon("image/pizza.png");
    static ImageIcon hamburgericon = new ImageIcon("image/hamburger.png");
    static ImageIcon hotdogicon = new ImageIcon("image/hotdog.png");
    
    public static void main(String[] args) {
        
        pizza.addActionListener(new evt());
        pizza.setIcon(pizzaicon);
        hamburger.addActionListener(new evt());
        hamburger.setIcon(hamburgericon);
        hotdog.addActionListener(new evt());
        hotdog.setIcon(hotdogicon);
        
        ButtonGroup group = new ButtonGroup();
        group.add(pizza);
        group.add(hamburger);
        group.add(hotdog);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(1500, 0, 500, 500);
        frame.setLayout(new FlowLayout());
        frame.add(pizza);
        frame.add(hamburger);
        frame.add(hotdog);
        frame.setVisible(true);
    }
    
    static class evt implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == pizza){
                System.out.println("You ordered pizza!");
            } else if(e.getSource() == hamburger){
                System.out.println("You ordered hamburger!");
            } else if(e.getSource() == hotdog){
                System.out.println("You ordered hotdog!");
            }
        }
        
    }
}
