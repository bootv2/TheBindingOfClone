/**
 * Write a description of class LifeMan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeMan  
{
    // instance variables - replace the example below with your own
    private static int hp = 6;
    final boolean FULL_HEART = true;
    final boolean HALF_HEART = false;
    Room currentWorld = null;
    
    Heart dummy = new Heart(FULL_HEART);

    /**
     * Constructor for objects of class LifeMan
     */
    public LifeMan(Room current)
    {
        currentWorld = current;
        for(int i = 0; i < hp; i+=2)//for every 2 hp, show a full heart
            {
                currentWorld.addObject(new Heart(FULL_HEART), (i + 3) * 17, 32);
            }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void damage(int dmg)
    {
        
        //I should remove all old hearts
        currentWorld.removeObjects(currentWorld.getObjects(Heart.class));
        
        // put your code here
        hp -= dmg;
        if(hp % 2 == 0)//even amount of health
        {
            for(int i = 0; i < hp; i+=2)//for every 2 hp, show a full heart
            {
                currentWorld.addObject(new Heart(FULL_HEART), (i + 3) * 17, 32);
            }
        }
        else
        {
            for(int i = 0; i < (hp - 1); i+=2)//for every 2 hp, show a full heart
            {
                currentWorld.addObject(new Heart(FULL_HEART), (i + 3) * 17, 32);
            }
            currentWorld.addObject(new Heart(HALF_HEART), (hp + 2) * 17, 32);
        }
    }
    
    public void heal(int h)
    {
        this.damage(-h);//healing is the inverse of damaging, I can flip the h value to negative, and use the damage function to heal
    }
}
