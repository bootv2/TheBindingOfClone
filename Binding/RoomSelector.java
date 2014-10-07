import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RoomSelector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoomSelector extends World
{

    /*
     * I need to generate the rooms here, then I can pass these rooms by reference to the roomMan.
     * Since I still have access to the roomMan via reference, I pass the roomMan to all rooms.
     */
    
    /**
     * Constructor for objects of class RoomSelector.
     * 
     */
    Room[][] rooms = new Room[5][5];
    RoomMan[] roomManager = new RoomMan[1];//this is only because I NEED to pass by reference since I dont want 20 copies of 25 rooms filled with objects.
    public RoomSelector()
    {    
        super(1282, 706, 1);
        roomManager[0] = new RoomMan();
        
        generateRooms();
        
        bindRooms();
    }
    
    public void setRoom(int x, int y)
    {
        roomManager[0].setCurrentRoom(x, y);
    }
    
    void bindRooms()
    {
        roomManager[0].setRooms(rooms);
    }
     
    void generateRooms()
    {
        for(int i = 0; i < 5; i++)
        {
            for(int x = 0; x < 5; x++)
                rooms[i][x] = new Room(roomManager);
        }
    }
}
