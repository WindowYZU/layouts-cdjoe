/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class FlowLayoutSample {

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
        //1. create five buttons, add them to the frame
        //2. test the effect of setAlignment
        //3. test the effect of hgap and vgap
        layout.setHgap(50);
        layout.setVgap(50);
        layout.setAlignment(FlowLayout.LEFT);
        for(int i=0; i<5; i++){
            JButton button=new JButton("button_"+i);
            frame.add(button);
        }
        //////////////////////////////////////////////////////////////////////
        
        frame.setVisible(true);
    }
    
}
