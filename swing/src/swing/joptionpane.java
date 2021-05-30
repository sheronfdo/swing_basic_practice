/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jamit
 */
public class joptionpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //show messege dialog
        /*
        JOptionPane.showMessageDialog(null, "this is some useful info", "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "here is more useless info :D", "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "really??", "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "your computer has a virus!!!", "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "call tech support now or else!!!", "title", JOptionPane.ERROR_MESSAGE);
        */
        
        
        //show confirm dialog
        /*
        JOptionPane.showConfirmDialog(null, "bro, do you ecen code ??", "my title", JOptionPane.YES_NO_CANCEL_OPTION); 
        
        //this passes integer values when click button we can use that numbers to identify what button pressed?
        //0 is for yes, 1 is for no ,2 is for cancel
        
        int option = JOptionPane.showConfirmDialog(null, "bor, do you ecen code ??", "my title", JOptionPane.YES_NO_CANCEL_OPTION);
        //we can get that integer number as a variable
        */
        
        
        //show input dialog 
        /*this can get inputs from user*/
        //JOptionPane.showInputDialog("what is your name");
        /*
        String name = JOptionPane.showInputDialog("what is your name");
        System.out.println("my name is : "+name);
        JOptionPane.showMessageDialog(null, "your name is : "+ name,"my name",JOptionPane.PLAIN_MESSAGE);
        */
        
        //show option dialog
        /*String[] reponses = {"No, You're awesome!","thank you!","*blush*"};
        ImageIcon icon = new ImageIcon("image/logo.png");
        
        //JOptionPane.showOptionDialog(parentComponent, reponses(massege), title, 0 (type of the pane), 0 (imformation type), icon, reponses (respons words sometime could be an array like this example), 0);
        JOptionPane.showOptionDialog(null, "you are awesome", "secret massege", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icon, reponses,0);
        */
        //if we have no special icons and responses to show we can inlcude "null" keyword
        //JOptionPane.showOptionDialog(null, "you are awesome", "secret massege", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,0);
    }
    
}
