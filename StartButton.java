import greenfoot.*;

/**
 * A button that starts the game when clicked.
 * It displays the "Start" label.
 * 
 * @author Brian
 * @version June 2023
 */
public class StartButton extends Actor
{
    /**
     * Constructor for objects of class StartButton.
     */
    public StartButton()
    {
        // Set the initial image of the button
        GreenfootImage image = new GreenfootImage("start-button.png");
        setImage(image);
    }

    /**
     * Act method of the start button.
     * Detects when the button is clicked by the player.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
