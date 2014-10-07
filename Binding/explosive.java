import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class explosive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class explosive extends Actor
{
    /**
     * Act - do whatever the explosive wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int timer = 200;
    boolean explosiveSprite = false;
    public void act() 
    {
        timer--;
        if(timer == 0) explode();
        if(timer % 20 == 0 && explosiveSprite) 
        {
            this.setImage("bomb1.png");
            explosiveSprite = false;
        }
        else if(timer % 20 == 0 && !explosiveSprite) 
        {
            this.setImage("bomb2.png");
            explosiveSprite = true;
        }
    }    
    
    public void explode()
    {
        List<DestructableObjects> objectsInExplosiveRange = this.getObjectsInRange(200, DestructableObjects.class);
        for(DestructableObjects object: objectsInExplosiveRange)
        {
            object.damage(5);
        }
        
        List<AI> AiInExplosiveRange = this.getObjectsInRange(200, AI.class);
        for(AI ai: AiInExplosiveRange)
        {
            ai.damage(5);
        }
        
        this.getWorld().addObject(new Explosion(), this.getX(), this.getY());
        this.getWorld().removeObject(this);
        
    }
}
