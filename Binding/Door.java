import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Actor
{
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    /**
     * this function initialises the door, and its pointing angle.
     * @param the position(0=n, 1=e, 2=s, 3=w)
     */
    final int TURNING_DEGREES_EAST = 90;
    final int TURNING_DEGREES_SOUTH = 180;
    final int TURNING_DEGREES_WEST = 270;
    
    public Door(int position)
    {
        switch(position)
        {
            case 0:
                break;//if the position is north, no rotation required.
            case 1:
                this.turn(TURNING_DEGREES_EAST);
                break;
            case 2:
                this.turn(TURNING_DEGREES_SOUTH);
                break;
            case 3:
                this.turn(TURNING_DEGREES_WEST);
                break;
        }
        
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
