/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author sheron fdo
 */
public class combo extends JFrame implements ActionListener {
    static JComboBox combo1;
    static JComboBox combo2;
    static JComboBox combo3;
    static String[][] animals = {{"crow","parrot","bat"},{"giraff","lion","tiger"}};
    static String[] type = {"birds","mammals"};
    
    public combo(){
        
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(1500, 0, 500, 500);
        
        
        combo2 = new JComboBox(type);
        //combo2.setEditable(true);
        combo2.addActionListener(this);
        
        combo3 = new JComboBox();
        combo3.setEditable(true);
        combo3.addItem("horse");
        combo3.addItem("cat");
        combo3.addItem("dog");
        combo3.insertItemAt("pig", 0);
        combo3.insertItemAt("frog", 1);
        combo3.setSelectedIndex(2);
        //combo3.removeItem("dog");
        //combo3.removeItemAt(4);
        //combo3.removeAllItems();
        combo3.addActionListener(this);
        
        combo1 = new JComboBox();
        combo1.addActionListener(this);
        
        this.add(combo2);
        this.add(combo1);
        this.add(combo3);
        this.setVisible(true);
        
        
        //gui();
    }
    //public void gui(){
    //    this.setLayout(new FlowLayout());
    //    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //    this.setBounds(1500, 0, 500, 500);
    //    this.setVisible(true);
    //}
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == combo2){
            combo1.removeAllItems(); // can remove all items from combobox
            for(int i = 0; i < animals[combo2.getSelectedIndex()].length; i++){
               combo1.addItem(animals[combo2.getSelectedIndex()][i]); // can use to add items to combobox
            }
            System.out.println(combo1.getItemCount());
            
        }
        if(e.getSource() == combo1){
            System.out.println(combo1.getSelectedItem()+" and index no is "+Integer.toString(combo1.getSelectedIndex()));
        }
    } 
}
