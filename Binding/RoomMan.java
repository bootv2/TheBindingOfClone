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
    private int x;
    
    Room[][] rooms;

    /**
     * Constructor for objects of class RoomMan
     */
    public RoomMan()
    {   
    }
    
    public void setRooms(Room[][] r)
    {
        rooms = r;
        Greenfoot.setWorld(rooms[2][2]);
    }
    
    public void setCurrentRoom(int x, int y)
    {
        Greenfoot.setWorld(rooms[x][y]);
        
    }
    
   
}
