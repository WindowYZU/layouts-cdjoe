/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.layouts;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class AbsoluteLayoutSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        
        JLabel labelName=new JLabel("姓名：");
        JLabel labelTel=new JLabel("電話：");
        JTextField tfName=new JTextField();
        JTextField tfTel=new JTextField();
        //1. try to position the components above via setBounds
        //   and then add them to the frame
        //2. call frame.setResizable(fale), see what will happen
        labelName.setBounds(10, 10, 100, 30);
        labelTel.setBounds(10, 50, 100, 30);
        tfName.setBounds(120, 10, 200, 30);
        tfTel.setBounds(120, 50, 200, 30);
        frame.add(labelName);
        frame.add(labelTel);
        frame.add(tfName);
        frame.add(tfTel);
        frame.setResizable(false);
        ////////////////////////////////////////////////////
        frame.setVisible(true);
    }
    
}
