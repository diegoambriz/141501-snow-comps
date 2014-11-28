import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author Diego Alfonso Ambriz Martinez 
 * @version 20-11-14
 */
public class Finn extends Enemy
{
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage []moveRight;
    private GreenfootImage []moveLeft;
    
    private GreenfootImage walkRight1=new GreenfootImage("finnRight1.png");
    private GreenfootImage walkRight2=new GreenfootImage("finnRight2.png");
    private GreenfootImage walkRight3=new GreenfootImage("finnRight3.png");
    private GreenfootImage walkRight4=new GreenfootImage("finnRight4.png");
    private GreenfootImage walkRight5=new GreenfootImage("finnRight5.png");
    
    private GreenfootImage walkLeft1=new GreenfootImage("finnLeft1.png");
    private GreenfootImage walkLeft2=new GreenfootImage("finnLeft2.png");
    private GreenfootImage walkLeft3=new GreenfootImage("finnLeft3.png");
    private GreenfootImage walkLeft4=new GreenfootImage("finnLeft4.png");
    private GreenfootImage walkLeft5=new GreenfootImage("finnLeft5.png");
    
    private int countMoveRight;
    private int countMoveLeft;
    
    private String direction;
    
    private int health;
    //public boolean dead;
    private Bonus bonus;
    
    public Finn()
    {
        moveRight=new GreenfootImage[5];
        moveLeft=new GreenfootImage[5];
        
        moveRight[0]=walkRight1;
        moveRight[1]=walkRight2;
        moveRight[2]=walkRight3;
        moveRight[3]=walkRight4;
        moveRight[4]=walkRight5;
        
        moveLeft[0]=walkLeft1;
        moveLeft[1]=walkLeft2;
        moveLeft[2]=walkLeft3;
        moveLeft[3]=walkLeft4;
        moveLeft[4]=walkLeft5;
       
        direction="Left";
        
        countMoveRight=0;
        countMoveLeft=0;
        health=3;
        //dead=false;
    }
    
    public void act() 
    {
       //if(getX()<270)
       /*if(isTouching(Block.class)!=true)
       {
           direction="Right";
       }
       
       //if(getX()>595)
       if(isTouching(BlockRight.class))
       {
           direction="Left";
       }*/
        
       if(direction=="Left")
       {
           if(countMoveLeft>4)
           {
               countMoveLeft=0;
           }
           
           setLocation(getX()-5,getY());
           setImage(moveLeft[countMoveLeft]);
           countMoveLeft++;
           
           if(isTouching(Block.class)!=true || isAtEdge() || isTouching(BlockLeft.class))
           {
               direction="Right";
           }
       }
       
       if(direction=="Right")
       {
           if(countMoveRight>4)
           {
               countMoveRight=0;
           }
           
           setLocation(getX()+5,getY());
           setImage(moveRight[countMoveRight]);
           countMoveRight++;
           
           if(isTouching(Block.class)!=true || isAtEdge() || isTouching(BlockRight.class))
           {
               direction="Left";
           }
       }
       
       if(isTouching(SnowBall.class))
       {
           health--;
           removeTouching(SnowBall.class);
       }
       
       if(health==0)
       {
           //this.dead=true;
           int rnd=Greenfoot.getRandomNumber(3);
            
           switch(rnd)
           {
               case 0:
               bonus=new Usb();
               break;
                
               case 1:
               bonus=new Ipod();
               break;
                
               case 2:
               bonus=new Tablet();
               break;
           }
            
           getWorld().addObject(bonus,getX(),getY());
           getWorld().removeObject(this);
       }
    } 
    
    /*public boolean isDead()
    {
       return dead;
    }
    
    public void setDead(boolean isDead)
    {
        dead=isDead;
    }*/
}
