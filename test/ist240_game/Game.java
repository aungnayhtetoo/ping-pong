/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist240_game;

/**
 *
 * @author Aung Nay
 */
import java.awt.*;
import javax.swing.*; 

public class Game extends JPanel
{
    final int FRAMELENGTH = 950;
    final int FRAMEHEIGHT = 600;
    private JButton j1, j2;
    public String gname, infogame;
    
    public Game(String name, String info)
    {   
        super();
        gname = name;
        infogame = info;
        
        setBackground(Color.black);
        setSize(FRAMELENGTH, FRAMEHEIGHT);
        j1 = new JButton(gname);
        j2 = new JButton(infogame);
        j1.setFont(new Font("Calibri", Font.ITALIC, 20));
        j1.setBackground(Color.blue);
        j1.setForeground(Color.white);
        j1.setHorizontalAlignment(SwingConstants.CENTER);
        add(j1);
        add(j2);
        
    }
    
    public void MacLayoutSetup(){
            // On some MACs it might be necessary to have the statement below
            //for the background color of the button to appear
            try{
    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName()); } catch (Exception e)
    {
    e.printStackTrace(); }
    }
}
