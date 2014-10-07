import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rubble here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rubble extends Effects
{
    /**
     * Act - do whatever the Rubble wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Rubble(boolean lootwall)
    {
        if(lootwall == true) this.setImage("lootWallRubble.png");
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
