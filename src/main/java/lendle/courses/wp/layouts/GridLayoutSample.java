/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class GridLayoutSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        GridLayout layout=new GridLayout(3, 2);
        frame.setLayout(layout);
        
        //1. add 6 CustomComponent to the frame
        //2. resize the frame to see the effect
        for(int i=0; i<6; i++){
            CustomComponent c=new CustomComponent();
            frame.add(c);
        }
        //////////////////////////////////////////////////////////////////////
        
        frame.setVisible(true);
    }
    
}
