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
public class frame2 extends JFrame{
    
    twodanimation panel = new twodanimation();
    public frame2(){
        gui();
    }
    
    public void gui(){
        this.add(panel);
        this.setTitle("2d Animation");
        //this.setBounds(1500, 0, 600, 600);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
