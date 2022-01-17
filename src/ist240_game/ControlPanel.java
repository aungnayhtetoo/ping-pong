
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ControlPanel extends JPanel implements ActionListener
{
    ButtonPanel bp;
    CenterPanel cp;
    Game inst, gm2, gm3;
    GameButtonPanel gcp;
    
   
    
    private pingpong.TennisFrame tennisgame;
    private pingpong.TennisGame tennisgamewin;
    
    private ClickMe.GamePanel clickMe;
    private ClickMe.ClickMeMainFrame clickMeMF;
    
    
    
    public ControlPanel() 
    {
        bp = new ButtonPanel();
        cp = new CenterPanel();
        gcp = new GameButtonPanel();
        
        tennisgame = new pingpong.TennisFrame();
        tennisgamewin = new pingpong.TennisGame(tennisgame);
        
        clickMeMF = new ClickMe.ClickMeMainFrame();
        clickMe = new ClickMe.GamePanel(clickMeMF);
        
        
        
        
        inst = new Game("Instruction", "Score and Instruction Page");
        
        //these are just place holder for the games
        gm3 = new Game("Game 3", "Rock Paper Scissor Game");
        
        
        BorderLayout border = new BorderLayout();
        setLayout(border);
        setBackground(Color.black);
        
        bp.jb1.addActionListener(this);
        bp.jb2.addActionListener(this);
        bp.jb3.addActionListener(this);
        bp.jb4.addActionListener(this);
        bp.jb5.addActionListener(this);
        gcp.jb1.addActionListener(this);
        gcp.jb1.addActionListener(this);
        
        
        add(bp,"South");
        add(cp,"Center");
    }
    
   
    public void CallTennisGame() throws InterruptedException
    {
        tennisgame = new pingpong.TennisFrame();
    }
    
    @Override
    public void actionPerformed(ActionEvent event) 
    {
       	Object obj = event.getSource();
     	if (obj == bp.jb1)
        {
            removeAll();
            add(inst,"Center");
            add(gcp,"South");
            validate();
            repaint();
     	}
        // Button to go back to main menu
        if (obj == gcp.jb1)
        {
            removeAll();
            add(cp,"Center");
            add(bp,"South");
            validate();
            repaint();
     	}
     	if (obj == bp.jb2)
     	{
            removeAll();
            add(clickMe,"Center");
            add(gcp,"South");
            validate();
            repaint();
     	}
        if (obj == bp.jb3)
     	{
            removeAll();
            add(tennisgamewin,"Center");
            add(gcp,"South");
            validate();
            repaint();
     	}
        if (obj == bp.jb4)
     	{
            removeAll();
            add(gm3,"Center");
            add(gcp,"South");
            validate();
            repaint();
     	}
        
        if (obj == bp.jb5)
        {
            System.exit(0);
        }
}
            
}
