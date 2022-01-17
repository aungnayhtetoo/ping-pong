package ClickMe;
        
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//Group 07 Aung Nay, Hi Jin Moon, Andrew Parcho, Bennet

public final class GamePanel extends JPanel implements ActionListener
{
    private final JButton b1, b2;
    int score = 0;
    private int buttonsizeX = 120, buttonsizeY = 90;
    private int xright = 0, yleft = 0;
    
    private final Timer timer;
    private final Timer movetimer;
    private final Timer putimer;
    private final Timer notificationTimer;
    private final int delay = 1000;
    private final int movedelay = 1000;
    private final int pudelay = 15;
    private final int notificationDelay = 1000;
    
    private final JProgressBar pb1;
    private final int begin = 0, end = 60;
    public int i = 0, j = 0;
    
    private final JProgressBar notificationPB;
    private final int begin2 = 0, end2 = 10;
    public int l = 0, m = 0;
    
    private final JLabel plusFive = new JLabel();
    int seconds = 0;
    
    boolean scoreCheck;
    
    int z = 0;
    ClickMeMainFrame mf1;
    
    public GamePanel(ClickMeMainFrame mainf)
    {
        super();
        this.mf1 = mainf;
        
         
        KeyLis();
        
        setLayout(null);
        b1 = new JButton("Click Me");
        b1.setEnabled(false);
//        b1.setPreferredSize(new Dimension (buttonsizeX, buttonsizeY));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setOpaque(true);
        add(b1);
        b1.setBounds(1000,250,buttonsizeX,buttonsizeY);
        
        b2 = new JButton("+5 Seconds");
        b2.addActionListener(this);
        b2.setBounds(500,250,100,50);
        b2.setBackground(Color.GREEN);
        b2.setForeground(Color.BLACK);
        b2.setOpaque(true);
        
        pb1 = new JProgressBar(begin, end);
        j = end;
        pb1.setValue(j);
        pb1.setStringPainted(true);
        pb1.setString("You have " + end + " seconds");
        
        add(pb1);
        pb1.setBounds(400, 720, 750, 70); 
        timer = new Timer(delay,this);        
        movetimer = new Timer(movedelay, this);
        putimer = new Timer(pudelay, this);
        notificationTimer = new Timer(notificationDelay, this);
        
        notificationPB = new JProgressBar(begin2, end2);
        m = end2;
        notificationPB.setValue(m);
        
        plusFive.setText("+" + seconds + " Seconds!");
        plusFive.setFont(new Font("Default", Font.PLAIN, 12));
        plusFive.setBounds(550, mf1.getHeight(), 100, 100);
        add(plusFive);
        plusFive.setVisible(false);
        
    }
    
    
    public void KeyLis()
    {
        KeyListener listener = new KeyListener() 
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
                    timer.start();
                    movetimer.start();
                    b1.setEnabled(true);
                }   
        
            }
            @Override
            public void keyReleased(KeyEvent e) 
            {
                
            }
        };
        addKeyListener(listener);
        setFocusable(true);
        setBackground(Color.white);
    }

            
    
    public void moveButton()
    {
        xright = (int)(Math.random() * (1050));
        yleft = (int)(Math.random() * (600));
//        buttonsizeX -= 10;
//        buttonsizeY -= 2;
        b1.setBounds(xright,yleft,buttonsizeX,buttonsizeY);        
        //b1.setLocation(xright, yleft);
        repaint();
    }
    
    public void movePowerUp(int k)
    {
        b2.setBounds(500,k,100,50);
        repaint();
    }
    
    public void resizeButton(int c, int d)
    {
        buttonsizeX -= c;
        buttonsizeY -= d;
        scoreCheck = false;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void gameOver() 
    {   
        
        JOptionPane.showMessageDialog(this, "You Final Score is: " + getScore(), "Game Over", 
            JOptionPane.YES_NO_OPTION);
        System.exit(0);
        
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        //paintComponent will be useful in this lab.
        //read more about it in the paiting the screen lesson 
        //and also the keyboard listener method
        g.drawString("score = " + getScore(), 10, 730);
        g.drawString("Press Spacebar to start the game", 10, 750);
        g.drawString("You have 60 seconds to keep clicking on the button to score", 10, 770);
        repaint();
        requestFocusInWindow();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {   
        if (e.getSource() == b1)
        {
            score +=1;
            scoreCheck = true;  
        }
        
        if (e.getSource() == timer) 
        {
            j -= 1;
            pb1.setValue(j);
            pb1.setString("" + j);
        }
        
        if ((pb1.getValue() % 20) == 0)
        {
            putimer.start();
            add(b2);
        }
        
        if (e.getSource() == putimer)
        {
            z += 5;
            movePowerUp(z);
        }
        
               
        // power up button
        if (e.getSource() == b2)
        {
            j = j + 5;
            seconds = seconds + 5;
            plusFive.setText("+" + seconds + " Seconds!");
            plusFive.setVisible(true);
            notificationTimer.start();
        }
        //----
        
        if (e.getSource() == movetimer)
        {
            moveButton();
        }
        
        if (scoreCheck == true && score == 3) // These just make the game progressively harder
        {
            resizeButton(5,5);
            movetimer.setDelay(900);
        }
        if (scoreCheck == true && score == 6)
        {
            resizeButton(5,5);
            movetimer.setDelay(800);
        }
        if (scoreCheck == true && score == 9)
        {
            resizeButton(5,5);
            movetimer.setDelay(700);
        }
        if (scoreCheck == true && score == 15)
        {
            resizeButton(2,2);
            movetimer.setDelay(600);
        }
        if (scoreCheck == true && score == 18)
        {
            resizeButton(2,2);
            movetimer.setDelay(500);
        }
        if (scoreCheck == true && score == 25)
        {
            resizeButton(2,2);
            movetimer.setDelay(300);
        }
        if (scoreCheck == true && score == 32)
        {
            resizeButton(2,2);
            movetimer.setDelay(200);
        }
        
        if (pb1.getValue() == 0)
        {
            gameOver();
        }
        
        
       
    }
}
