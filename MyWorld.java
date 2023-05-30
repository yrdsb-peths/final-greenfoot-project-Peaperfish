import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * a world where tower and balloons live
 * a cheap version of bloons td
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
        Menu menu = new Menu();
        addObject(menu,730,230);
        menu.setLocation(720,300);
        Leave1();
    }    
    
    public void act() {
        addInTower();
    }
    /**
     *  creating an array for the map/road
     */
    int map [][] = { {0, 0, 0, 0, 0, 1, 1, 1, 0, 0},
                     {1, 1, 0, 0, 0, 1, 0, 1, 0, 0},
                     {0, 1, 0, 1, 1, 1, 0, 1, 1, 0},
                     {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
                     {0, 1, 0, 1, 1, 1, 0, 1, 1, 0},
                     {0, 1, 0, 0, 0, 1, 0, 1, 0, 0},
                     {0, 1, 0, 0, 1, 1, 0, 1, 1, 0},
                     {0, 1, 1, 0, 1, 0, 0, 0, 1, 0},
                     {0, 0, 1, 0, 1, 0, 0, 0, 1, 1},
                     {0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
                    };
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void Leave1()
    {
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(map[j] [i] == 1) {
                    addObject(new Road(), 30 + i * 60, 30 + j * 60);
                }
            }
        }
    }
    
    public void addInTower() {
        if (Greenfoot.mouseClicked(null)) {
            addObject(new Tower(), Greenfoot.getMouseInfo().getX(),Greenfoot.getMouseInfo().getY());
        }
    }
}
