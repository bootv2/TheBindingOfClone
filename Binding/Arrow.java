import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Player
{
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public void arrowRotation(int degrees)
        {
            
    }
        public void act()
    {
        move(30);

    }
        public Arrow(int rotation)
        {
            switch(rotation)
            {
                case 0:
                    setRotation(0);
                    break;
                case 1:
                    setRotation(90);
                    break;
                case 2:
                    setRotation(180);
                    break;
                case 3:
                    setRotation(270);
                    break;
            }
        }
}