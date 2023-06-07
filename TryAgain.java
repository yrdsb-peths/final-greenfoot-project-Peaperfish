import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * after user pressed the try again button, the game will restart
 * 
 * @author Brian Wang
 * @version June 2023
 */

public class TryAgain extends Actor {
    private GreenfootImage buttonImage;
    
    public TryAgain() {
        buttonImage = new GreenfootImage("try-again.png"); // Replace "try_again_button.png" with the actual image file for the try again button
        setImage(buttonImage);
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}




