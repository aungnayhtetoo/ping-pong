/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
     

/**
 *
 * @author Aung Nay
 */

public class Sound {
    
    public void playSoundef(String filepath)
    {
        try
        {
            File music = new File(filepath);

            if (music.exists())
            {
                AudioInputStream audioInp1 = AudioSystem.getAudioInputStream(music);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInp1);
                clip.start();
            }
        }
            
        catch(IOException | LineUnavailableException | UnsupportedAudioFileException ex)
        {
        }
    }
    public void playSoundefLoop(String filepath)
    {
        try
        {
            File music = new File(filepath);

            if (music.exists())
            {
                AudioInputStream audioInp1 = AudioSystem.getAudioInputStream(music);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInp1);
                clip.start();
                //clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
        }
            
        catch(IOException | LineUnavailableException | UnsupportedAudioFileException ex)
        {
        }
    
    }
    
            
     
}
