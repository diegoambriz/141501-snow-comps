import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Predator extends Enemy
{
    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage []moveRight;
    private GreenfootImage []moveLeft;
    
    private GreenfootImage walkRight1=new GreenfootImage("predatorRight.png");
    private GreenfootImage walkRight2=new GreenfootImage("predatorRight2.png");
    private GreenfootImage walkRight3=new GreenfootImage("predatorRight3.png");
    private GreenfootImage walkRight4=new GreenfootImage("predatorRight4.png");
    
    private GreenfootImage walkLeft1=new GreenfootImage("predatorLeft.png");
    private GreenfootImage walkLeft2=new GreenfootImage("predatorLeft2.png");
    private GreenfootImage walkLeft3=new GreenfootImage("predatorLeft3.png");
    private GreenfootImage walkLeft4=new GreenfootImage("predatorLeft4.png");
    
    private boolean isDirectionRight;
    private int countMoveRight;
    private int countMoveLeft;
    private String direction;
    
    private int health;
    private boolean dead;
    
    public Predator()
    {
        moveRight=new GreenfootImage[4];
        moveLeft=new GreenfootImage[4];
        
        moveRight[0]=walkRight1;
        moveRight[1]=walkRight2;
        moveRight[2]=walkRight3;
        moveRight[3]=walkRight4;
        
        moveLeft[0]=walkLeft1;
        moveLeft[1]=walkLeft2;
        moveLeft[2]=walkLeft3;
        moveLeft[3]=walkLeft4;
        
        isDirectionRight=true;
        countMoveRight=0;
        countMoveLeft=0;
        direction="Right";
        dead=false;
        health=3;
    }
    
    public void act() 
    {
       if(getX()<190)
       {
           direction="Right";
       }
       
       if(getX()>525)
       {
           direction="Left";
       }
        
       if(direction=="Left")
       {
           if(countMoveLeft>3)
           {
               countMoveLeft=0;
           }
           
           setLocation(getX()-5,getY());
           setImage(moveLeft[countMoveLeft]);
           countMoveLeft++;
       }
       
       if(direction=="Right")
       {
           if(countMoveRight>3)
           {
               countMoveRight=0;
           }
           
           setLocation(getX()+5,getY());
           setImage(moveRight[countMoveRight]);
           countMoveRight++;
       }
       
       if(isTouching(SnowBall.class))
       {
           health--;
           removeTouching(SnowBall.class);
       }
       
       if(health==0)
       {
           this.dead=true;
           System.out.println("Dead");
       }
    }
    
    public boolean isDead()
    {
       /*if(health==0)
       {
           return true;
           //setLocation(1000,0);
           
           //getWorld().removeObject(this);
       }
       
       else
           return false;*/
       return dead;
    }
}
