import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the road where the bad guy will be walking on
 * 
 * @author Brian Wang
 * @version June 2023
 */
public class Road extends Actor
{
    /**
     * road
     */
    
    public int turn;
    public boolean straight;
    
    public Road(boolean straight) {
        getImage().scale(60, 60);
        this.straight = straight;
    }
    
    public Road(int tuen) {
        getImage().scale(60, 60);
        this.turn = turn;
    }
    
    
    public void act()
    {
        // Add your action code here.
    }
}
