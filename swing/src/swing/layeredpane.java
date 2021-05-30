/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/**
 *
 * @author Jamit
 */
public class layeredpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);
        
        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100, 100, 200, 200);
        
        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150, 150, 200, 200);
        
        JLayeredPane layeredpane = new JLayeredPane();
        layeredpane.setBounds(0, 0, 500, 500);
        //layeredpane.add(label1, JLayeredPane.DEFAULT_LAYER);
        //layeredpane.add(label2, JLayeredPane.MODAL_LAYER);
        //layeredpane.add(label3, JLayeredPane.DRAG_LAYER);
        
        layeredpane.add(label1, Integer.valueOf(0));
        layeredpane.add(label2, Integer.valueOf(1));
        layeredpane.add(label3, Integer.valueOf(2));
        
        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredpane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(1500, 0, 500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        
        
    }
    
}
