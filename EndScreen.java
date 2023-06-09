import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @author Brian Wang
 * @version June 2023
 */
public class EndScreen extends World
{

    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen()
    {    
        // Create a new world with 840 x 600 cells with a cell size of 1 x 1 pixels.
        super(840, 600, 1); 
        prepare();
    }
    
    private void prepare() {
        // Display the game over message
        showText("Game Over", getWidth() / 2, getHeight() / 2 - 50);

        // Create the restart button and add it to the world
        TryAgain tryAgain = new TryAgain();
        addObject(tryAgain, getWidth() / 2, getHeight() / 2 + 50);
    }
    
    
    public void act() {
        if (Greenfoot.mouseClicked(_obj_)) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
    
}
