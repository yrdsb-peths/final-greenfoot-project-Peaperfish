import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthDisplay here.
 * 
 * @author Brian Wang 
 * @version June 2023
 */
public class HealthDisplay extends Actor
{
    /**
     * Act - do whatever the HealthDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int hp;

    public HealthDisplay(int initialHP) {
        hp = initialHP;
        updateImage();
    }

    public void updateHP(int newHP) {
        hp = newHP;
        updateImage();
    }

    private void updateImage() {
        GreenfootImage image = new GreenfootImage("HP: " + hp, 35, Color.BLACK, new Color(0, 0, 0, 0));
        setImage(image);
    }
}
