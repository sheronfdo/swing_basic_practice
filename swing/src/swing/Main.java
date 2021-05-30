/*
uploads to github
*/

package swing;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Jamit
 */
public class Main extends JFrame{
    static JButton but1 = new JButton("Click Me");
    static JButton but2 = new JButton("Click Me");
    static JFrame frame = new JFrame();
    static JLabel label =new JLabel("Hello, World");
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Frame and settings
        
        frame.setTitle("Swing Tutorial".toUpperCase());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds((di.width-500)/2, (di.height-400)/2, 500, 400);
        frame.getContentPane().setBackground(new Color(125,125,125));
        frame.setLayout(null);
        
        
        
        //Label and settings
        ImageIcon icon = new ImageIcon("image/logo.png");
        Border border = BorderFactory.createLineBorder(Color.BLACK, 1, true);
        
        
        label.setIcon(icon);
        label.setBounds(10, 10, 250, 250);
        label.setForeground(new Color(124,45,79));
        label.setBackground(new Color(255,255,255));
        label.setOpaque(true);
        label.setBorder(border);
        label.setFont(new Font("calibri",Font.BOLD,30));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        
        frame.add(label);
        
        //add button and settings
        
        
        but1.setBounds(300, 10, 100, 50);
        but1.setText("Click but 1");
        but1.addActionListener(new evt());
        frame.add(but1);
        
        but2.setBounds(300, 120, 100, 50);
        but2.setText("Click but 2");
        but2.setFocusable(false); //true or false
        but2.setIcon(icon);
        but2.setHorizontalTextPosition(JButton.CENTER);
        but2.setVerticalTextPosition(JButton.BOTTOM);
        but2.setFont(new Font("Comic Sans",Font.BOLD,25));
        but2.setIconTextGap(-15);
        but2.setForeground(Color.cyan);
        but2.setBackground(Color.lightGray);
        but2.setBorder(BorderFactory.createEtchedBorder());
        but2.setEnabled(true);
        but2.addActionListener(e -> label.setText("Button 2 clicked"));
        frame.add(but2);
        
        frame.setVisible(true);
    }

    public static class evt implements ActionListener{

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if(e.getSource() == but1){
                label.setText("Button 1 clicked");
            }
            //To change body of generated methods, choose Tools | Templates.
        }
      
    }
    
}
