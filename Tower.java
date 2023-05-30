import greenfoot.*;

public class Tower extends Actor {
    
    /**
     * Create a tower that will shoot the target 
     */
    
    // tower
    public Tower() {
        GreenfootImage image = getImage(); 
        int newWidth = image.getWidth();
        int newHeight = image.getHeight();
        image.scale(60, 60);
        setImage(image); 
    }
    
    public void act() {
        // Add your action code here.
    }
}
