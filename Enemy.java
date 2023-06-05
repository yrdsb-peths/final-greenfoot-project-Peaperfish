import greenfoot.*;
import java.util.List;

/**
 * balloons 
 * 
 * @author Brian Wang 
 * @version June 2023
 */

public class Enemy extends Actor {
    // calls world for access 
    MyWorld world;
    
    // ballons hp
    public int health = 6;
    
    public Enemy(int level) {
        if(level == 1) {
             setImage("balloon1.png");
        }
        
        if(level == 2) {
            setImage("balloon2.png");
        }
        
        if(level == 3) {
            setImage("balloon3.png");
        }
    }
    
    // act
    public void act() {
        moveAlongPath();
        hitByProjectile();
    }
    
    
    public void moveAlongPath() {
        // moving speed
        move(2);
        
        // making the balloon turn
        List <Road> road0 = getObjectsAtOffset(0, -30, Road.class);
        for (Road roads : road0) {
            if (roads.straight == false && getRotation() == 90) {
                setRotation(roads.turn);
            }
        }
        
        List <Road> road90 = getObjectsAtOffset(-30, 0, Road.class);
        for (Road roads : road90) {
            if (roads.straight == false && getRotation() == 0) {
                setRotation(roads.turn);
            }
        }
        
        List <Road> road180 = getObjectsAtOffset(0, 30, Road.class);
        for (Road roads : road180) {
            if (roads.straight == false && getRotation() == 270) {
                setRotation(roads.turn);
            }
        }
        
        List <Road> road270 = getObjectsAtOffset(30, 0, Road.class);
        for (Road roads : road270) {
            if (roads.straight == false && getRotation() == 180) {
                setRotation(roads.turn);
            }
        }
    }
    
    public void hitByProjectile() {
        Actor projectile = getOneIntersectingObject(Projectile.class);
        
        // remove projectile after it hits the balloon
        if(projectile != null) {
            health--;
            getWorld().removeObject(projectile);
        }
        
        // remove balloon after it has less than 0 hp
        if(health < 1) {
            world.money += 25;
            getWorld().removeObject(this);
        }
        else if(isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}

    











