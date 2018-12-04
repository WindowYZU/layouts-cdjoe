/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.layouts;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class FlowLayoutSample3 {

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
        
        JButton clickButton=new JButton("Click!");
        //1. addActionListener to the clickButton
        //2. when clicking the button, add a new button to the container
        frame.add(clickButton, "South");
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button=new JButton(""+System.currentTimeMillis());
                container.add(button);
                frame.revalidate();
            }
        });
        //////////////////////////////////////////////////////////////////////
        
        frame.setVisible(true);
    }
    
}
