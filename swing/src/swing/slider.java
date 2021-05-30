/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Jamit
 */
public class slider extends JFrame implements ChangeListener{
    public slider(){
        gui();
    }
    
    JPanel panel;
    JLabel label;
    JSlider slid;
    
    public void gui(){
        //this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(1500, 0, 500, 500);
        
        panel = new JPanel();
        label = new JLabel();
        slid = new JSlider(0,100,50);
        slid.addChangeListener(this);
        slid.setValue(26);
        
        slid.setPreferredSize(new Dimension(400, 200));
        
        slid.setPaintTicks(true);
        slid.setMinorTickSpacing(10);
        
        slid.setPaintTrack(true);
        slid.setMajorTickSpacing(25);
        
        slid.setPaintLabels(true);
        slid.setFont(new Font("MV Boli", Font.PLAIN, 15));
        
        label.setPreferredSize(new Dimension(100, 100));
        label.setText("C = "+slid.getValue());
        
        slid.setOrientation(SwingConstants.VERTICAL);
        //slid.setOrientation(SwingConstants.HORIZONTAL); //default orientation is horizontal
        
        panel.add(slid);
        panel.add(label);
        
        this.add(panel);
        this.setVisible(true);
    
    }
    
    public void stateChanged(ChangeEvent e){
        if(e.getSource() == slid){
            label.setText("C = "+slid.getValue());
        }
    }
    
}
