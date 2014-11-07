import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage []moveRight;
    private GreenfootImage []moveLeft;
    
    private int countMoveRight;
    private int countMoveLeft;
    
    public Player()
    {
        GreenfootImage walkRight1 =new GreenfootImage("nickRight1.png");
        GreenfootImage walkRight2 =new GreenfootImage("nickRight2.png");
        GreenfootImage walkRight3 =new GreenfootImage("nickRight3.png");
        
        GreenfootImage walkLeft1 =new GreenfootImage("nickLeft1.png");
        GreenfootImage walkLeft2 =new GreenfootImage("nickLeft2.png");
        GreenfootImage walkLeft3 =new GreenfootImage("nickLeft3.png");
        
        moveRight= new GreenfootImage[3];
        moveLeft= new GreenfootImage[3];
        
        moveRight[0]=walkRight1;
        moveRight[1]=walkRight2;
        moveRight[2]=walkRight3;
        
        moveLeft[0]=walkLeft1;
        moveLeft[1]=walkLeft2;
        moveLeft[2]=walkLeft3;
        
        countMoveRight=0;
        countMoveLeft=0;
    }
    
    public void act() 
    {
        // Add your action code here.
        
        if(Greenfoot.isKeyDown("right"))
        {
            if(countMoveRight>2)
            {
                countMoveRight=0;
            }
            
            setLocation(getX()+5,getY());
            setImage(moveRight[countMoveRight]);
            countMoveRight++;
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            if(countMoveLeft>2)
            {
                countMoveLeft=0;
            }
            
            setLocation(getX()-5,getY());
            setImage(moveLeft[countMoveLeft]);
            countMoveLeft++;
        }
        
    }    
}
