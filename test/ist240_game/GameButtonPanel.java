/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist240_game;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GameButtonPanel extends JPanel
{
    JButton jb1;
    
    public GameButtonPanel()
    {
        super();
        FlowLayout flowlayout = new FlowLayout();
        setLayout(flowlayout);
        setBackground(Color.white);
        
        jb1 = new JButton("MainMenu");
        jb1.setFont(new Font("Calibri", Font.ITALIC, 20));
        jb1.setBackground(Color.blue);
        jb1.setForeground(Color.white);
        jb1.setHorizontalAlignment(SwingConstants.CENTER);
        add(jb1);
        
        
    }
}

