import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * after user pressed the try again button, the game will restart
 * 
 * @author Brian Wang
 * @version June 2023
 */

public class TryAgain extends Actor
{
    public void tryAgainImage() {
        GreenfootImage image = getImage(); 
        int newWidth = image.getWidth();
        int newHeight = image.getHeight();
        image.scale(60, 60);
        setImage(image);
    }

    /**
     * Act - do whatever the TryAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
    {
        tryAgainImage();
    }
}
