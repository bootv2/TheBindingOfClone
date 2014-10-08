import greenfoot.*;
import java.util.ArrayList;

/**
 * This class manages all rooms, saves them when exited, and reloads them in their old state when entered.
 * The Map(gui) Also uses this class to see which rooms are explored.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoomMan  
{
    // instance variables - replace the example below with your own
    final int CELLAR_DIMENSIONS = 10;
    
    Room[][] rooms;

    /**
     * Constructor for objects of class RoomMan
     */
    public RoomMan()
    {   
    }
    
    /**
     * This function binds the reference to the room array array to this class(object)
     * This function also selects a spawn point for the player
     */
    public void setRooms(Room[][] r)
    {
        rooms = r;
        
        int startX, startY;
        startX = Greenfoot.getRandomNumber(CELLAR_DIMENSIONS);
        startY = Greenfoot.getRandomNumber(CELLAR_DIMENSIONS);
        
        while(rooms[startX][startY] == null)
        {
            startX = Greenfoot.getRandomNumber(CELLAR_DIMENSIONS);
            startY = Greenfoot.getRandomNumber(CELLAR_DIMENSIONS);
        }
        
        Greenfoot.setWorld(rooms[startX][startY]);
    }
    
    public void setCurrentRoom(int x, int y)
    {
        Greenfoot.setWorld(rooms[x][y]);
        
    }
    
   
}
