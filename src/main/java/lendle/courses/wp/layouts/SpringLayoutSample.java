/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.layouts;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class SpringLayoutSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        SpringLayout layout = new SpringLayout();
        frame.setLayout(layout);
        
        JLabel label=new JLabel("label");
        //layout the label to (5, 5)
        layout.putConstraint(SpringLayout.WEST, label, 5, SpringLayout.WEST, frame.getContentPane());
        layout.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.NORTH, frame.getContentPane());
        layout.putConstraint(SpringLayout.SOUTH, label, 5, SpringLayout.SOUTH, frame.getContentPane());
        ////////////////////////////
        frame.setLayout(layout);
       
        JScrollPane scroll=new JScrollPane();
        JPanel container=new JPanel(){
            @Override
            public Dimension getPreferredSize(){
                int count=this.getComponentCount();
                if(count>0){
                    int total=count*this.getComponent(0).getPreferredSize().width;
                    int row=(int)Math.ceil(total/500);
                    return new Dimension(500, this.getComponent(0).getPreferredSize().height*row+20*(row));
                }
                return new Dimension(500, 1);
            }
        };
        scroll.getViewport().add(container);
        frame.add(scroll, "Center");
       // frame.add(label);
        frame.setVisible(true);
    }

}
