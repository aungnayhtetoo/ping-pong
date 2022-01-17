/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist240_game;

/**
 *
 * @author aqh5621
 */
import java.awt.*;
import javax.swing.*;

public class ButtonPanel extends JPanel
{
    JButton jb1, jb2, jb3, jb4, jb5;
    
    public ButtonPanel()
    {
        super();
        FlowLayout flowlayout = new FlowLayout();
        this.setLayout(flowlayout);
        this.setBackground(Color.black);
        JPanel buttonpanel = new JPanel();
        jb1 = new JButton("Instructions");
        jb1.setFont(new Font("Calibri", Font.ITALIC, 20));
        jb1.setBackground(Color.blue);
        jb1.setForeground(Color.white);
        jb1.setHorizontalAlignment(SwingConstants.CENTER);
        buttonpanel.add(jb1);
        
        jb2 = new JButton("Game 1");
        jb2.setFont(new Font("Calibri", Font.ITALIC, 20));
        jb2.setBackground(Color.orange);
        jb2.setHorizontalAlignment(SwingConstants.CENTER);
        buttonpanel.add(jb2);
        
        jb3 = new JButton("Game 2");
        jb3.setFont(new Font("Calibri", Font.ITALIC, 20));
        jb3.setBackground(Color.yellow);
        jb3.setHorizontalAlignment(SwingConstants.CENTER);
        buttonpanel.add(jb3);
        
        jb4 = new JButton("Game 3");
        jb4.setFont(new Font("Calibri", Font.ITALIC, 20));
        jb4.setBackground(Color.green);
        jb4.setHorizontalAlignment(SwingConstants.CENTER);
        buttonpanel.add(jb4);
        
        jb5 = new JButton("Exit");
        jb5.setFont(new Font("Calibri", Font.ITALIC, 20));
        jb5.setBackground(Color.red);
        jb5.setForeground(Color.white);
        jb5.setHorizontalAlignment(SwingConstants.CENTER);
        buttonpanel.add(jb5);
        
        add(buttonpanel);
    }
}
