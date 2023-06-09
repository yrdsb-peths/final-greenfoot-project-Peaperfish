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
    
    /**
     * Prepare the title screen.
     */
    private void prepare() {
        // Display the game over message
        showText("Game Over", getWidth() / 2, getHeight() / 2 - 50);

        // Create the try again button and add it to the world
        TryAgain tryAgainButton = new TryAgain();
        addObject(tryAgainButton, getWidth() / 2, getHeight() / 2 + 50);
        
        if (Greenfoot.mouseClicked(tryAgainButton)) {
            Greenfoot.setWorld(new MyWorld());
        }
    }

    /**
     * Act method of the title screen.
     */
    public void act() {

    }
}

