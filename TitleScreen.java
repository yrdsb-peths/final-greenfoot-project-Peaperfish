import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author Brian Wang
 * @version June 2023
 */

public class TitleScreen extends World
{
    private StartButton startButton;

    /**
     * Constructor for objects of class TitleScreen.
     */
    public TitleScreen()
    {
        super(840, 600, 1);
        prepare();
    }

    /**
     * Prepare the title screen.
     */
    private void prepare()
    {
        // Load the background image
        GreenfootImage backgroundImage = new GreenfootImage("title-screen.png");

        // Resize the background image to match the world size
        backgroundImage.scale(getWidth(), getHeight());

        // Set the resized image as the background
        setBackground(backgroundImage);

        // Create the start button and add it to the world
        startButton = new StartButton();
        addObject(startButton, getWidth() / 2, getHeight() / 2);

        // Instructions 
        Label label = new Label("Press 'Start' With Left Click To Start Game", 40);
        addObject(label, getWidth() / 2, 420);
        
        // Title
        Label label2 = new Label("Simplified Bloon TD Game 🎈", 40);
        addObject(label2, getWidth() / 2, 180);
    }

    /**
     * Act method of the title screen.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(startButton)) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
