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
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public final class TennisGame extends JPanel implements ActionListener {
    
    Ball ball = new Ball(this);
    Bar bar = new Bar(this);
    Sound sound = new Sound();
    
    int ballspeed = 1;
    private final String gameover = "Soundeffect/Gameover.wav";
    private final String background = "Soundeffect/Background.wav";
    private final String crazy = "Soundeffect/Crazy.wav";
    
    TennisFrame tnf;
    
    Timer t;
    
    
    
    private int getScore()
    {
        return ballspeed - 1;
    }
    public TennisGame(TennisFrame maintnf)
    {
        super();
        this.tnf = maintnf;
        KeyboardLis();
        setFocusable(true);
        
        //ActionListener l = new TimerListener();
        int delay = 10; // In ms
        t = new Timer(delay, this);
        
        
        
        
        sound.playSoundefLoop(background);
    }
    
    
   public void KeyboardLis() 
   {
        KeyListener listener2 = new KeyListener() 
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
            }

            @Override
            public void keyPressed(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_SPACE)
                {
                    t.start();
                }

                if (e.getKeyCode() == KeyEvent.VK_LEFT)
                {
                    bar.x = -ballspeed;
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                {
                    bar.x = ballspeed;
                }
            }

            @Override
            public void keyReleased(KeyEvent e)
            {
                bar.x = 0;
            }
        };
        setFocusable(true);
        addKeyListener(listener2);
    }
            
       
    
    @Override
    public void actionPerformed(ActionEvent event) 
    {
        Move();
        repaint();
    }
    
    public void Move()
    {
        ball.Moveball();
        bar.Movebar();
    }

    @Override
    public void paint(Graphics gs)
    {
        super.paint(gs);
        Graphics2D g2d = (Graphics2D) gs;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON);
        ball.paint(gs);
        bar.paint(gs);
        
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Calibri", Font.ITALIC, 40));
        g2d.drawString(String.valueOf(getScore()), 10, 30);
        g2d.drawString("Press Spacebar to start the game", 10, 750);
     
    }
    
//    public static void pause(int ms) {
//        try 
//        {
//            Thread.sleep(ms);
//        } 
//        catch (InterruptedException e) 
//        {
//            Thread.currentThread().interrupt();
//        }
//    }
    
    
    
    public void gameOver() 
    {   
        
        sound.playSoundef(gameover);
//        if (getScore() < 5)
//        {
//            pause(1100);
//            sound.playSoundef(crazy);
//        }
        JOptionPane.showMessageDialog(this, "You Final Score is: " + getScore(), "Game Over", 
                JOptionPane.YES_NO_OPTION);
        
        
        
        System.exit(0);
        
    }

}
