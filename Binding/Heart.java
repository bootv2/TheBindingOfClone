import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart extends GUI
{
    /**
     * Act - do whatever the Heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Heart(boolean full)
    {
        if(full)
        {
            this.setImage("heart_full.png");
        }
        else this.setImage("heart_half.png");
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
