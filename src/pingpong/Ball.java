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
import java.util.Random;


public class Ball
{   
    Random r = new Random();
    int[] random2={-1 , 1};
    int random = (int)(Math.random() * ((470 - 0) + 1)) + 0;
    
    private static final int DIAMETER = 30;
    int BEGINNINGPOINTX = random;
    int BEGINNINGPOINTY = 10;
    int x = random2[r.nextInt(random2.length)];
    int y = 1;
    private TennisGame game;
    Sound sound = new Sound();
    
    private String bounce = "Soundeffect/Bounce.wav";
    private String wall = "Soundeffect/Wall.wav";
    
    public Ball(TennisGame win1)
    {
        this.game = win1;
        
    }
    
    public void Moveball()
    {   
        boolean changeDirection = true;
        if (BEGINNINGPOINTX + x < 0)
            x = game.ballspeed;
        else if (BEGINNINGPOINTX + x > game.getWidth() - DIAMETER)
            x = -game.ballspeed;
        else if (BEGINNINGPOINTY + y < 0)
            y = game.ballspeed;
        else if (BEGINNINGPOINTY + y > game.getHeight() - DIAMETER)
            game.gameOver();
        else if (collision())
        {
            y = -game.ballspeed;
            BEGINNINGPOINTY = game.bar.getBeginningY()- DIAMETER;
            game.ballspeed += 1;
	} else  
            changeDirection = false;
        
        if (changeDirection)
            sound.playSoundef(wall);
        
        

        BEGINNINGPOINTX = BEGINNINGPOINTX + x;
        BEGINNINGPOINTY = BEGINNINGPOINTY + y;
    }
    
    private boolean collision()
    {
        return game.bar.getBounds().intersects(getBounds());
    }
    
    public void paint(Graphics gs)
    {
        //gs.setColor(Color.RED);
        gs.fillOval(BEGINNINGPOINTX, BEGINNINGPOINTY, DIAMETER, DIAMETER);
    }
    
    public Rectangle getBounds()
    {
        return new Rectangle(BEGINNINGPOINTX, BEGINNINGPOINTY, DIAMETER, DIAMETER);
    }
    
    
}
