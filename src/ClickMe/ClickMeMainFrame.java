package ClickMe;


import javax.swing.*;

//Group 07 Aung Nay, Hi Jin Moon, Andrew Parcho, Bennet
public class ClickMeMainFrame extends JFrame
{
    
    
    public int frameWidth = 1200, frameHeight = 900;
    public int x = 0, y = 0;
    GamePanel game1 = new GamePanel(this);
    
    public ClickMeMainFrame()
    {
        super();
        
//        gameMainFrame = new ist240_game.MainFrame();
        
        
        
        //add(game, "Center");
        //setSize(frameWidth,frameHeight);
        //setResizable(false);
        //setVisible(true);      
        
    }
    public int returnHeight()
    {
        return frameHeight;
        
    }
    
    public int returnWidth()
    {
        return frameWidth;
        
    }
    
}
