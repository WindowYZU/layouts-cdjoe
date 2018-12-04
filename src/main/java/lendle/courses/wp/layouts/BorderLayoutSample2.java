/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.layouts;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class BorderLayoutSample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        BorderLayout layout=new BorderLayout();
        frame.setLayout(layout);
        
        //1. create five CustomComponents, add them to North, West, South, East, Center
        //2. change the preferred size of CustomComponent
        JButton button1=new JButton("1");
        frame.add(button1, "North");
        button1.setPreferredSize(new Dimension(100, 100));
        
        CustomComponent c=new CustomComponent();
        frame.add(c, "West");
        JButton button3=new JButton("3");      
        
        frame.add(button3, "South");
        JButton button4=new JButton("4");
        frame.add(button4, "East");
        button4.setPreferredSize(new Dimension(100, 100));
        JButton button5=new JButton("5");
        frame.add(button5);
        //////////////////////////////////////////////////////////////////////
        
        frame.setVisible(true);
    }
    
}
