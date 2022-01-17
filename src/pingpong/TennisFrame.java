/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

/**
 *
 * @author aqh5621
 */
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.RenderingHints;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
import javax.swing.JFrame;


    
public class TennisFrame extends JFrame
{
    public final int FINALframex = 400;
    public final int FINALframey = 900;
    TennisGame win1 = new TennisGame(this);
    
    
    
    public TennisFrame()
    {
        super();
        
        //add(win1, "Center");
        
    }   
        
        
        //setVisible(true);
        
//        class TimerListener implements ActionListener
//        {
//            @Override
//            public void actionPerformed(ActionEvent event) 
//            {
//                win1.Move();
//                win1.repaint();
//            }
//        }
//        
//        ActionListener l = new TimerListener();
//        int delay = 10; // In ms
//        Timer t = new Timer(delay, l);
//        t.start();
        
    
    
} 
