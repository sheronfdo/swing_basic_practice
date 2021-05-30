/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.JFrame;

/**
 *
 * @author Jamit
 */
public class frame extends JFrame{
    dragpanel panel = new dragpanel();
    public frame(){
        gui();
    }
    
    public void gui(){
        this.add(panel);
        this.setTitle("drag and drop");
        this.setBounds(1500, 0, 600, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
