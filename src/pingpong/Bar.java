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
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bar {
    private static final int BEGINNINGPOINTY = 700;
    private static final int WIDTH = 80;
    private static final int HEIGHT = 10;
    public int x = 0;
    private TennisGame game;
    private int BEGINNINGPOINTX = 550;
    
    public Bar(TennisGame win1) 
    {
	this.game = win1;
    }
    
    public void Movebar()
    {
        if (BEGINNINGPOINTX + x > 0 && BEGINNINGPOINTX + x < game.getWidth() - WIDTH)
            BEGINNINGPOINTX += x;
    }
    
    public void paint(Graphics gs)
    {
       
        gs.fillRect(BEGINNINGPOINTX, BEGINNINGPOINTY, WIDTH, HEIGHT);
             
    }
    
    /*
    public void keyReleased(KeyEvent e)
    {
        x = 0;
    }
    
    public void keyPressed(KeyEvent e) 
    {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
                x = -game.ballspeed;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		x = game.ballspeed;
    }
    */
    
    public Rectangle getBounds()
    {
        return new Rectangle(BEGINNINGPOINTX, BEGINNINGPOINTY, WIDTH, HEIGHT);
    }
    
    public int getBeginningY()
    {
        return BEGINNINGPOINTY;
    }
}
