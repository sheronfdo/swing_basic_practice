
package swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.Border;

/**
 *
 * @author Jamit
 */
public class menu extends JFrame implements ActionListener{
    public menu(){
        gui();
    }
    JMenuBar menubar = new JMenuBar();
    JMenu filemenu = new JMenu("File");
    JMenu editmenu = new JMenu("Edit");
    JMenu helpmenu = new JMenu("Help");
    JMenuItem loaditem = new JMenuItem("Load");
    JMenuItem saveitem = new JMenuItem("Save");
    JMenuItem exititem = new JMenuItem("Exit");
    public void gui(){
        Border border = BorderFactory.createLineBorder(Color.lightGray, 1, false);
        
        
        
        
        
        loaditem.setPreferredSize(new Dimension(100,20));
        loaditem.setBorder(border);
        loaditem.addActionListener(this);
        //loaditem.setIcon((Icon/ImageIcon icon)); //u can use normally set icon command with imageicon object
        saveitem.setPreferredSize(new Dimension(100,20));
        saveitem.setBorder(border);
        saveitem.addActionListener(this);
        exititem.setPreferredSize(new Dimension(100,20));
        exititem.setBorder(border);
        exititem.addActionListener(this);
        
        filemenu.setMnemonic(KeyEvent.VK_F); // alt+ F for load
        editmenu.setMnemonic(KeyEvent.VK_E); // alt+ E
        helpmenu.setMnemonic(KeyEvent.VK_H); // alt+ H
        loaditem.setMnemonic(KeyEvent.VK_L); // L
        saveitem.setMnemonic(KeyEvent.VK_S); // S
        exititem.setMnemonic(KeyEvent.VK_E); // E
        
        filemenu.add(loaditem);
        filemenu.add(saveitem);
        filemenu.add(exititem);
        
        menubar.add(filemenu);
        menubar.add(editmenu);
        menubar.add(helpmenu);
        
        
        this.setJMenuBar(menubar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(1500, 0, 500, 500);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == loaditem){
        launching launch = new launching();
        launch.setvisible();
        }
        if(e.getSource() == exititem){
         System.exit(0);
        }
    }
    
}
