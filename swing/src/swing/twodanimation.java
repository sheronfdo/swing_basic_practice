/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Jamit
 */
public class twodanimation extends JPanel implements ActionListener{
    
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image background;
    Image enemy;
    
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;
    public twodanimation(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        enemy = new ImageIcon("image/hamburger.png").getImage();
        background = new ImageIcon("image/background.png").getImage();
        timer = new Timer(1, this);
        timer.start();
        
    }

    
    @Override
    public void paint(Graphics g){
        super.paint(g); //paint background
        Graphics2D g2d = (Graphics2D) g;
        //g2d.drawImage(background, 0, 0, null);
        g2d.drawImage(enemy, x, y, null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if((x>=PANEL_WIDTH - enemy.getWidth(null)) || (x<0)){
            xVelocity = xVelocity * -1;
        }
        x = x+ xVelocity;
        if((y>=PANEL_WIDTH - enemy.getHeight(null)) || (y<0)){
            yVelocity = yVelocity * -1;
        }
        y = y+ yVelocity;
        repaint();
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
