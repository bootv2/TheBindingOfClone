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
    
    
    final int CELLAR_DIMENSIONS = 10;
    final int MAP_GEN_ITERATIONS = 5;
    
    Room[][] rooms = new Room[CELLAR_DIMENSIONS + 1][CELLAR_DIMENSIONS + 1];
    RoomMan[] roomManager = new RoomMan[1];//this is only because I NEED to pass by reference since I dont want 20 copies of 25 rooms filled with objects.
    
    /**
     * Constructor for objects of class RoomSelector.
     * This is launched at game launch, this generates a cellar, creates a roomManager.
     * This switches to a random existing room after generating
     * This IS NOT AN INFINITE LOOP!!! generating a map in a 10*10 room space takes a while.
     */
    public RoomSelector()
    {    
        super(1282, 706, 1);
        roomManager[0] = new RoomMan();
        
        generateRooms();
        
        bindRooms();
    }
    
    /**
     * this function sets the room the player will play in.
     * since the map is a 2d composition of rooms, you have to select a position on this 2d plane.
     * @param Integer x position
     * @param Integer y position
     */
    public void setRoom(int x, int y)
    {
        roomManager[0].setCurrentRoom(x, y);
    }
    
    
    /**
     * Bind the reference of the room arrays to the roomManager
     */
    void bindRooms()
    {
        roomManager[0].setRooms(rooms);
    }
     
    /**
     * generate a map of rooms
     * select random starting point within map boundaries.
     * Select random length of line.
     * select random point in line.
     * draw an additional random length line within map boundaries.
     * repeat ^
     * This needs to be tweaked to generate just the right sized maps.

     * After rooms are generated, find empty rooms adjacent to lines. And place shops, item rooms, and secret rooms.
     * Boss rooms are placed at the end of a line only!!

     * ROOMS CAN BE NULL!!! so to check if a room exists, check if it's null.
     */
    void generateRooms()
    {
        int startY, length, direction;
        int startX = -1;
        for(int i = 0; i < MAP_GEN_ITERATIONS; i++)
        {
            if(startX == -1)//create new starting positions for the first iteration
            {
                startX = Greenfoot.getRandomNumber(CELLAR_DIMENSIONS);
                startY = Greenfoot.getRandomNumber(CELLAR_DIMENSIONS);
                rooms[startX][startY] = new Room(roomManager);
            }
            else
            {
                startX = Greenfoot.getRandomNumber(CELLAR_DIMENSIONS + 1);
                startY = Greenfoot.getRandomNumber(CELLAR_DIMENSIONS + 1);
                
                while(rooms[startX][startY] == null)
                {
                    startX = Greenfoot.getRandomNumber(CELLAR_DIMENSIONS);
                    startY = Greenfoot.getRandomNumber(CELLAR_DIMENSIONS);
                    System.out.println("I'm looking for a room as a starting point for the next line. I: " + i + "\n posX:\t" + startX + " posY:\t" + startY);
                }
            }
            direction = Greenfoot.getRandomNumber(4);
            switch(direction)// different code for different directions
            {//recalculate length if out of bounds...
                case 0://north
                    if(CELLAR_DIMENSIONS - (CELLAR_DIMENSIONS - startY) < 0) length = 1;
                    else length = Greenfoot.getRandomNumber(CELLAR_DIMENSIONS - (CELLAR_DIMENSIONS - startY));
                    //if(length > CELLAR_DIMENSIONS - startY) length -= CELLAR_DIMENSIONS - startY;
                    while(length != 0)//create rooms between the starting point and the end point.
                    {
                        System.out.println("I: " + i + "\t length: " + length + "\tinf?" );
                        rooms[startX][startY - length] = new Room(roomManager);
                        length--;
                    }
                    break;
                    
                case 1://east
                    if(CELLAR_DIMENSIONS - startX <= 0)length = 1;
                    else length = Greenfoot.getRandomNumber(CELLAR_DIMENSIONS - startX);
                    //if(startX + length > CELLAR_DIMENSIONS)length = CELLAR_DIMENSIONS - startX;
                    
                    while(length != 0)//create rooms between the starting point and the end point.
                    {
                        System.out.println("I: " + i + "\t length: " + length + "\tinf?" );
                        rooms[startX + length][startY] = new Room(roomManager);
                        length--;
                    }
                    break;
                    
                case 2://south
                    if(CELLAR_DIMENSIONS - startY <= 0) length = 1;
                    else length = Greenfoot.getRandomNumber(CELLAR_DIMENSIONS - startY);
                    //if(startY + length > CELLAR_DIMENSIONS)length = CELLAR_DIMENSIONS - startY;
                    while(length != 0)//create rooms between the starting point and the end point.
                    {
                        System.out.println("I: " + i + "\t length: " + length + "\tinf?" );
                        rooms[startX][startY + length] = new Room(roomManager);
                        length--;
                    }
                    break;
                    
                case 3://west
                    if(CELLAR_DIMENSIONS - (CELLAR_DIMENSIONS - startX) < 0) length = 1;
                    else length = Greenfoot.getRandomNumber(CELLAR_DIMENSIONS - (CELLAR_DIMENSIONS - startX));
                    //if(length > CELLAR_DIMENSIONS - startX) length -= CELLAR_DIMENSIONS - startX;
                    while(length != 0)//create rooms between the starting point and the end point.
                    {
                        System.out.println("I: " + i + "\t length: " + length + "\tinf?" );
                        rooms[startX - length][startY] = new Room(roomManager);
                        length--;
                    }
                    break;
            }
            
            
        }
    }
}
