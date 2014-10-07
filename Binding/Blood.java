import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blood here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blood extends Effects
{
    /**
     * Act - do whatever the Blood wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int amountOfBlood = 0;
    int bloodId;
    final int MAX_BLOOD = 10;
    
    public Blood()
    {
        String imageFile = "blood/blood" + (Greenfoot.getRandomNumber(17) + 1) + ".png";
        this.setImage(imageFile);
        
        bloodId = amountOfBlood;
        amountOfBlood++;
    }
    
    public void act() 
    {
        if(amountOfBlood - bloodId > MAX_BLOOD) this.getWorld().removeObject(this);
        // Add your action code here.
    }    
}
