import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoneyyDisplay here.
 * 
 * @author Brian Wang
 * @version June 2023
 */
public class MoneyDisplay extends Actor
{
    /**
     * label to show the amount of money 
     */
    
    MyWorld game;
    
    public MoneyDisplay() {
        setImage(new GreenfootImage("Money: " + game.money, 35, Color.BLACK, 
        new Color(0, 0, 0, 0)));
    }
    
    public void act()
    {
        setImage(new GreenfootImage("Money: " + game.money, 35, Color.BLACK, 
        new Color(0, 0, 0, 0)));
        
        // cheat to reset the money
        if(Greenfoot.mouseClicked(this)) {
            game.money = 100;
        }
    }
}
