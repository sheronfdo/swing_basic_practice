
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Jamit
 */
public class textfield {
    static JButton but = new JButton();
    static JFrame frame = new JFrame();
    static JTextField textf = new JTextField();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        but.setText("submit");
        but.setBounds(260, 50, 100, 50);
        but.addActionListener(new evt());
        
        textf.setBounds(50, 50, 200, 50);
        textf.setText("hello");
        textf.setFont(new Font("Calibri", Font.PLAIN, 40));
        textf.setBackground(Color.black);
        textf.setForeground(new Color(0x00FF00));
        textf.setCaretColor(Color.red);
        
        frame.setTitle("text field");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(1500, 0, 500, 500);
        frame.setLayout(null);
        frame.add(textf);
        frame.add(but);
        frame.setVisible(true);
    }

    public static class evt implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==but){
            System.out.println(textf.getText());
            JOptionPane.showMessageDialog(null, textf.getText(), "jtextfield", JOptionPane.PLAIN_MESSAGE);
        } //To change body of generated methods, choose Tools | Templates.
        }
    
    }
}
