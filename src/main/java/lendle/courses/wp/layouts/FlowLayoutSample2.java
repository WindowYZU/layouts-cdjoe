/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.layouts;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class FlowLayoutSample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        FlowLayout layout=new FlowLayout();
        frame.setLayout(layout);
        //1. create five CustomComponent, and add them to the frame
        //2. change the preferredSize of CustomComponent
        for(int i=0; i<5; i++){
            CustomComponent c=new CustomComponent();
            c.setPreferredSize(new Dimension(500,50));
            frame.add(c);
        }
        //////////////////////////////////////////////////////////////////////
        
        frame.setVisible(true);
    }
    
}
