import greenfoot.*;
import java.util.List;

public class Tower extends Actor {
    
    /**
     * Create a tower that will shoot the target 
     */
    
    int fireRate = 0;
    
    // tower
    public Tower() {
        GreenfootImage image = getImage(); 
        int newWidth = image.getWidth();
        int newHeight = image.getHeight();
        image.scale(60, 60);
        setImage(image); 
    }
    
    
    public void act() {
        enemyDetector();
    }
    
    public void enemyDetector() { 
        fireRate++;
        List<Enemy> enemies = getObjectsInRange(100, Enemy.class);
        
        for(Enemy eachEnemy : enemies) {
            if(fireRate > 11) {
                Projectile projectile = new Projectile();
                getWorld().addObject(projectile, getX(), getY());
                projectile.turnTowards(eachEnemy.getX(), eachEnemy.getY());
                fireRate = 0;
            }
        }
    }
}
