/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.layouts;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class CardLayoutSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        CardLayout layout = new CardLayout();
        panel.setLayout(layout);
        JPanel panel2 = new JPanel();
        frame.add(panel);
        frame.add(panel2, "South");
        JButton next = new JButton(">");
        JButton first = new JButton("|<");
        JButton prev = new JButton("<");
        JButton last = new JButton(">|");
        panel2.add(first);
        panel2.add(prev);
        panel2.add(next);
        panel2.add(last);

        for (int i = 0; i < 10; i++) {
            panel.add(new JButton("" + i));
        }
        //add ActionListener to each control button and invoke
        //first, previous, next, and last for each button
        first.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.first(panel);
            }
        });
        prev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.previous(panel);
            }
        });
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.next(panel);
            }
        });
        last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.last(panel);
            }
        });
        //////////////////////////////////////////////////////

        frame.setVisible(true);
    }

}
