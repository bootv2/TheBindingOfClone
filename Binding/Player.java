import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pickup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Pickup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    if(Greenfoot.isKeyDown("right")){
            moveRight();
            animRight();
    }
    if(Greenfoot.isKeyDown("left")){
            moveLeft();
            animLeft();
    }
    if(Greenfoot.isKeyDown("up")){
            moveUp();
            animUp();
    }
    if(Greenfoot.isKeyDown("down")){
            moveDown();
            animDown();
    }   
}
private void animRight()
    {
        if(frameRight == 0) {setImage("pWalkRight0.png");}
        else if(frameRight == 4) {setImage("pWalkRight1.png");}
        else if(frameRight == 8)
        {
            frameRight = 0;
            return;
        }
        frameRight++;
    }
    private void animLeft()
    {
        if(frameLeft == 0) {setImage("pWalkLeft0.png");}
        else if(frameLeft == 4) {setImage("pWalkLeft1.png");}
        else if(frameLeft == 8)
        {
            frameLeft = 0;
            return;
        }
        frameLeft++;
    }
        private void animUp()
    {
        if(frameUp == 0) {setImage("pWalkUp0.png");}
        else if(frameUp == 4) {setImage("pWalkUp1.png");}
        else if(frameUp == 8)
        {
            frameUp = 0;
            return;
        }
        frameUp++;
    }
        private void animDown()
    {
        if(frameDown == 0) {setImage("pWalkDown0.png");}
        else if(frameDown == 4) {setImage("pWalkDown1.png");}
        else if(frameDown == 8)
        {
            frameDown = 0;
            return;
        }
        frameDown++;
    }
    private void moveLeft()
    {
        setLocation(getX() - 5, getY());
    }
        private void moveRight()
    {
        setLocation(getX() + 5, getY());
    }
        private void moveUp()
    {
        setLocation(getX() , getY() - 5);
    }
        private void moveDown()
    {
        setLocation(getX() , getY() + 5);
    }
private int frameRight;
private int frameLeft;
private int frameUp;
private int frameDown;
}


