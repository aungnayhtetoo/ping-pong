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
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MainFrame extends JFrame 
{

    
    public final int FRAMEWIDTH = 700, FRAMEHEIGHT = 900;
    private CardLayout cl = new CardLayout();
    private JPanel mjp = new ControlPanel();
    
    public MainFrame()
    {
        super("Game Main Menu");  
        
        
        
        setBackground(Color.black);
        getContentPane().add(mjp, "Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(FRAMEWIDTH, FRAMEHEIGHT);
        getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
        setVisible(true);
        setResizable(false);
    }
    
    
    
    
}
