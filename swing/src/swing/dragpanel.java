/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jamit
 */
public class dragpanel extends JPanel {
    ImageIcon image =  new ImageIcon("image/logo.png");
    int WIDTH = image.getIconWidth();
    int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point prevPT;
    
    public dragpanel(){
        gui();
    }
    
    public void gui(){
        imageCorner = new Point(0, 0);
        
        ClickListener clicklistener = new ClickListener();
        DragListener draglistener = new DragListener();
        this.addMouseListener(clicklistener);
        this.addMouseMotionListener(draglistener);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
    }
    
    private class ClickListener extends MouseAdapter{
        
        @Override
        public void mousePressed(MouseEvent e){
            prevPT = e.getPoint();
        }
    }
    
    private class DragListener extends MouseMotionAdapter{
        @Override
        public void mouseDragged(MouseEvent e){
            Point currentpt = e.getPoint();
            imageCorner.translate(
                    (int) (currentpt.getX() - prevPT.getX()),
                    (int) (currentpt.getY() - prevPT.getY())
            );
            prevPT = currentpt;
            repaint();
        }
    }
    
}
