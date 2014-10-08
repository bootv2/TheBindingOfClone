import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DestructableObjects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DestructableObjects extends Actor
{
    /**
     * Act - do whatever the DestructableObjects wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int hp;
    
    final boolean IS_LOOTWALL = true;
    final boolean ISNT_LOOTWALL = false;
    
    public void act() 
    {
        // Add your action code here.
        if(this.getClass() == LootWall.class)
            move(1);//experimental
    }
    
    /**
     * ALWAYS INITIALISE HP FIRST
     * @param Integer amount of damage to do
     */
    public void damage(int amount)
    {
        hp -= amount;
        if(this.getClass() == LootWall.class && hp < 1)
        {
            this.getWorld().addObject(new Rubble(IS_LOOTWALL), this.getX(), this.getY());
            this.getWorld().addObject(new Chest(), this.getX(), this.getY());
        }
        else if(this.getClass() == Wall.class && hp < 1)
            this.getWorld().addObject(new Rubble(ISNT_LOOTWALL), this.getX(), this.getY());
        
        this.getWorld().removeObject(this);
    }
}
