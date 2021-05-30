/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Jamit
 */
public class mypanel extends JPanel{
    Image image;
    mypanel(){
        image = new ImageIcon("image/logo.png").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }
    @Override
    public void paint(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        //g2d.drawImage(image, 0, 0, null);
        //g2d.setPaint(Color.BLUE);
        //g2d.setStroke(new BasicStroke(5));
        //g2d.drawLine(0, 0, 500, 500);
        
        //g2d.drawRect(0, 0, 100, 100);
        //g2d.fillRect(0, 0, 100, 100);
        //g2d.drawOval(0, 0, 100, 150);
        //g2d.fillOval(0, 0, 100, 150);
        //g2d.drawArc(0, 0, 100, 100, 00, 180);
        //g2d.fillArc(0, 0, 100, 100, 180, 180);
        
        //int[] xPoints = {150,250,350};
        //int[] yPoints = {300,150,300};
        //g2d.drawPolygon(xPoints, yPoints, 3);
        //g2d.fillPolygon(xPoints, yPoints, 3);
        
        //g2d.setFont(new Font("INK free", Font.BOLD, 50));
        //g2d.drawString("hello ", 50, 50);
        
        
        
    }
}
