/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author Jamit
 */
public class selectfile extends JFrame implements ActionListener{
    public selectfile(){
        gui();
    }
    JButton button;
    public void gui(){
        
        button = new JButton("select a file");
        button.addActionListener(this);
        
        this.add(button);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(1500, 0, 500, 500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == button){
            JFileChooser filechooser = new JFileChooser();
            
            filechooser.setCurrentDirectory(new File("C:\\Users\\Jamit\\Documents\\"));
            
            //filechooser.showOpenDialog(null); // select file to open this command passes integer values for responses as open = 0, cancel = 1 
            //System.out.println(filechooser.showOpenDialog(null));
            //int response = filechooser.showOpenDialog(null);
            int response = filechooser.showSaveDialog(null);//select location to save this command passes integer values for responses as save = 0, cancel = 1 
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}
