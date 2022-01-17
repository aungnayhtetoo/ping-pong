/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist240_game;

/**
 *
 * @author User
 */
import java.awt.*;
import javax.swing.*;

public class CenterPanel extends JPanel
{

    JButton jb1;

    public CenterPanel()
    {
        super();
        GridLayout gridlayout = new GridLayout();
        setLayout(gridlayout);
        jb1 = new JButton();
        ImageIcon psu = new ImageIcon("images/psu.jpg");
        jb1.setIcon(psu);
        add(jb1);
    }
}