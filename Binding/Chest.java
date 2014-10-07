import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chest extends StaticObjects
{
    boolean isOpened = false;
    
    /**
     * Act - do whatever the Chest wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void open()
    {
        int amountOfPickups = Greenfoot.getRandomNumber(5);
        for(int i = 0; i < amountOfPickups && !isOpened; i++)
        {
            int spawnXOffset = Greenfoot.getRandomNumber(100) - 50;
            int spawnYOffset = Greenfoot.getRandomNumber(100) - 50;
            switch(Greenfoot.getRandomNumber(1))
            {
                case 0:
                    this.getWorld().addObject(new Life(), this.getX() + spawnXOffset, this.getY() + spawnYOffset);
                    break;
            }
            
        }
        isOpened = true;
        this.setImage("ChestOpen.png");
    }
}
