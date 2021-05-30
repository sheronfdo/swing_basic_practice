/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/**
 *
 * @author Jamit
 */
public class twodgraphic extends JFrame{
    twodgraphic(){
        gui();
    }
    mypanel panel;
    public void gui(){
        panel = new mypanel();
        
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setBounds(1500, 0, 500, 500);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    
}
