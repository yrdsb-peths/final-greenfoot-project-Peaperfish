import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * a world where tower and balloons live
 * a cheap version of bolloon td
 * 
 * @author Brian Wang
 * @version June 2023
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 15 x 10 cells with a cell size of 60 x 60 pixels.
        super(840, 600, 1);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Menu menu = new Menu();
        addObject(menu,730,230);
        menu.setLocation(720,300);
    }
}
