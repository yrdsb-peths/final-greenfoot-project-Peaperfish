import greenfoot.*;
import java.util.List;

/**
 * balloons 
 * 
 * @author Brian Wang 
 * @version June 2023
 */

public class Enemy extends Actor {
    
    public void act() {
        moveAlongPath();
        hitByProjectile();
    }
    
    public void moveAlongPath() {
        move(2);
        
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
        if(projectile != null) {
            getWorld().removeObject(projectile);
        }
    }
}

    











