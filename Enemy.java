import greenfoot.*;
import java.util.List;

/**
 * Write a description of class Enemy here.
 * 
 * @author Brian Wang 
 * @version June 2023
 */

public class Enemy extends Actor {
    public void act() {
        move(2);
        
        List <Road> road0 = getObjectsAtOffset(-30, 0, Road.class);
        for (Road road : road0) {
            if (!road.straight && getRotation() == 90) {
                setRotation(road.turn);
            }
        }
        
        List <Road> road90 = getObjectsAtOffset(0, -30, Road.class);
        for (Road road : road90) {
            if (!road.straight && getRotation() == 0) {
                setRotation(road.turn);
            }
        }
        
        List <Road> road180 = getObjectsAtOffset(0, 30, Road.class);
        for (Road road : road180) {
            if (!road.straight && getRotation() == 270) {
                setRotation(road.turn);
            }
        }
        
        List <Road> road270 = getObjectsAtOffset(30, 0, Road.class);
        for (Road road : road270) {
            if (!road.straight && getRotation() == 180) {
                setRotation(road.turn);
            }
        }
    }
}
