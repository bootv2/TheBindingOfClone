import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Animation
{
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Explosion()
    {
        new GreenfootSound("explosion.wav").play();
        
        frames.add(new GreenfootImage("explosion1.png"));
        frames.add(new GreenfootImage("explosion2.png"));
    }
    
    public void act() 
    {
        super.act();
    }    
}
