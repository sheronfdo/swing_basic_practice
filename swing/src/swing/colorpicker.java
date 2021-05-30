/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author sheron fdo
 */
public class colorpicker extends JFrame implements ActionListener{
    public colorpicker(){
        gui();
    }
    
    JButton button = new JButton("pick a color");
    JLabel label = new JLabel();
    
    public void gui(){
        Border border = BorderFactory.createLineBorder(Color.yellow, 1);
        
        button.setBounds(0, 0, 200, 100);
        button.addActionListener(this);
        
        label.setText("this gone choosen color by you!");
        label.setBounds(200, 0, 1300, 100);
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setFont(new Font("MV Boli", Font.PLAIN, 75));
        label.setBorder(border);
        
        this.add(button);
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(1500, 0, 1500, 200);
        //this.setLayout(new FlowLayout());
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            //JColorChooser colorchooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "pick a color", null);
            label.setForeground(color);
        }
    }
}