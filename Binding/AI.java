import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AI extends Mover
{
    /**
     * Act - do whatever the AI wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int hp;
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void damage(int amount)
    {
        hp -= amount;
        if(hp < amount)
        {
            this.getWorld().addObject(new Blood(), this.getX(), this.getY());
            this.getWorld().removeObject(this);
        }
    }



  
}
