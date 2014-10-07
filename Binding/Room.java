import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room extends World
{
    LifeMan lm;
    /**
     * Constructor for objects of class Room.
     * 
     */
    public Room()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1282, 706, 1); 
        
        final int DOOR_POS_NORTH = 0;
        final int DOOR_POS_EAST = 1;
        final int DOOR_POS_SOUTH = 2;
        final int DOOR_POS_WEST = 3;
        
        for(int x = 32; x < 1250; x += 64)
        {
            for(int y = 32; y < 674; y += 64)//algoritm to fill room walls with wall
            {
                if(y == 32)//north
                {
                    if(x == 672) this.addObject(new Door(DOOR_POS_NORTH), x, y);
                    else this.addObject(new OuterWall(), x, y);
                }
                else if(y > 608)//south
                    if(x == 672) this.addObject(new Door(DOOR_POS_SOUTH), x, y);
                    else this.addObject(new OuterWall(), x, y);
                else if(x == 32)//west
                {
                    if(y == 352) this.addObject(new Door(DOOR_POS_WEST), x, y);
                    else this.addObject(new OuterWall(), x, y);
                }
                else if(x > 1184)//east
                    if(y == 352) this.addObject(new Door(DOOR_POS_EAST), x, y);
                    else this.addObject(new OuterWall(), x, y);
            }
        }
        
        WindowBorder wb = new WindowBorder();//set the window borders to 0,0 so it goes round the whole game
        this.addObject(wb, 641, 353);//ALWAYS do this last, so the border gets drawn on top!!!
        lm = new LifeMan(this);
    }
}
