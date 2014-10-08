import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Animation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animation extends Effects
{
    
    int timer = 5;
    int amountOfFrames;
    int currentFrame;
    ArrayList<GreenfootImage> frames = new ArrayList<GreenfootImage>();
    
    boolean firstAct = true;
    
    /**
     * This automatically plays any animation created. It plays a frame every 5 acts.
     * This class destroys itself after playing.
     */
    public void act() 
    {
        if(firstAct) amountOfFrames = frames.size();
        timer--;
        if(timer == 0)
        {
            timer = 5;
            currentFrame++;
            if(currentFrame < amountOfFrames)
            {
                this.setImage(frames.get(currentFrame));
            }
            else 
            {
                this.getWorld().removeObject(this);
            }
        }
    }    
}
