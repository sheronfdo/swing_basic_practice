/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Jamit
 */
public class keylisten extends JFrame implements KeyListener{
    public keylisten(){
        gui();
    }
    
    JLabel label;
    ImageIcon icon;
    public void gui(){
        icon = new ImageIcon("image/check.png");
        
        label = new JLabel();
        label.setBounds(200, 200, 100, 100);
        //label.setBackground(Color.red);
        label.setIcon(icon);
        //label.setOpaque(true);
        
        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.addKeyListener(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(1500, 0, 500, 500);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX() , label.getY() - 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 's':
                label.setLocation(label.getX() , label.getY() + 10);
                break;
        }
        //System.out.println("you released "+e.getKeyChar()+" "+e.getKeyCode());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println("you released "+e.getKeyChar()+" "+e.getKeyCode());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("you released "+e.getKeyChar()+" "+e.getKeyCode());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
