/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author Jamit
 */
public class chebox {
    static JButton button = new JButton();
    static JCheckBox box = new JCheckBox();
    static JFrame frame = new JFrame();
    static ImageIcon check = new ImageIcon("image/check.png");
    static ImageIcon cross = new ImageIcon("image/cross.png");
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        button.setText("submit");
        button.setBounds(20, 100, 80, 50);
        button.addActionListener(new evt());
        
        
        box.setText("im not a robot");
        //box.setPreferredSize(new Dimension(50, 50));
        box.setBounds(100, 100, 250, 50);
        box.setFocusable(false);
        box.setFont(new Font("Calibri", Font.PLAIN, 30));
        box.setIcon(cross);
        box.setSelectedIcon(check);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 0, 500, 500);
        frame.setLayout(null);
        frame.add(box);
        frame.add(button);
        frame.setVisible(true);
    }
    
    public static class evt implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button){
                System.out.println(box.isSelected());
               
            }
            
            //To change body of generated methods, choose Tools | Templates.
        }
    
    }
    
}
