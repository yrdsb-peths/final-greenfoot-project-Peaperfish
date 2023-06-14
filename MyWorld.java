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
    // money to start with
    public static int money = 100;
    
    public static int hp = 100;
    
    int basicTowerPrice = 50;
    
    int worldTime;
    
    int waveNumber = 1;
    
    private boolean gameEnded;
    
    private HealthDisplay healthDisplay;
    
    private int balloonCounter;
    
    private int speedIncrement;
    
    /**
     *  creating an 2d array for the map/road
     */
    int map [][] = { {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {1, 1, 2, 0, 3, 1, 1, 1, 1, 2},
                     {0, 0, 1, 0, 1, 0, 0, 0, 0, 1},
                     {0, 0, 1, 0, 4, 1, 1, 5, 0, 1},
                     {0, 0, 1, 0, 0, 0, 0, 1, 0, 1},
                     {0, 0, 1, 0, 0, 0, 0, 1, 0, 1},
                     {0, 0, 1, 0, 0, 0, 0, 1, 0, 1},
                     {0, 0, 3, 1, 1, 2, 0, 1, 0, 1},
                     {0, 0, 0, 0, 0, 1, 0, 1, 0, 1},
                     {0, 0, 0, 0, 0, 3, 1, 4, 0, 1},
                    };
                    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 840 x 600 cells with a cell size of 1 x 1 pixels.
        super(840, 600, 1, false);
        Menu menu = new Menu();
        addObject(menu,730,230);
        menu.setLocation(720,300);
        addObject(new MoneyDisplay(), 720, 200);
        
        healthDisplay = new HealthDisplay(hp);
        addObject(healthDisplay, 720, 80);
        
        
        balloonCounter = 0;
        
        speedIncrement = 0;
        
        Level1();
        
        TryAgain tryAgainButton = new TryAgain();
        addObject(tryAgainButton, 720, 500);
    }    
    
    /**
     * act
     */
    public void act() {
        if (!gameEnded) {
            addInTower();
            spawnWave();
            worldTime++;
        }
    }
    
    /**
     * level one 
     */
    private void Level1()
    {
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(map[j] [i] == 1) {
                    addObject(new Road(true), 30 + i * 60, 30 + j * 60);
                }
                
                if(map[j] [i] == 3) {
                    addObject(new Road(0), 30 + i * 60, 30 + j * 60);
                }
                
                if(map[j] [i] == 2) {
                    addObject(new Road(90), 30 + i * 60, 30 + j * 60);
                }
                
                if(map[j] [i] == 5) {
                    addObject(new Road(180), 30 + i * 60, 30 + j * 60);
                }
                
                if(map[j] [i] == 4) {
                    addObject(new Road(270), 30 + i * 60, 30 + j * 60);
                }
            }
        }
        
        hp = 100;

    }
    
    /**
     *  add tower and the tower would snap on to the grid
     */
    public void addInTower() {
        if (Greenfoot.mouseClicked(null) && Greenfoot.getMouseInfo().getActor() == null && money >= basicTowerPrice) {
            
            // tower will snap on to the grid
            addObject(new Tower(), (Greenfoot.getMouseInfo().getX() / 60) * 60 + 30,
            (Greenfoot.getMouseInfo().getY() / 60) * 60 + 30);
            
            // one tower cost 50
            money -= basicTowerPrice;
        }
    }
    
    public void spawnWave() {
        // first wave
        if(worldTime % 20 == 0) {
            addObject(new Enemy(waveNumber), 1, 90);
        }
        
        //second wave
        if(worldTime % 400 == 399) { 
            waveNumber++;
        }
        
            if (hp <= 0) {
                endGame();
        }
    }
    
    public void balloonPopped() {
        balloonCounter++;
        if (balloonCounter % 10 == 0) {
            speedIncrement++;
        }
    }
    
    public void decreaseHP(int amount) {
        hp -= amount;
        healthDisplay.updateHP(hp);

        if (hp <= 0) {
            endGame();
        }
    }


    private void endGame() {
        gameEnded = true;
        Greenfoot.setWorld(new EndScreen());
    }
    

}
