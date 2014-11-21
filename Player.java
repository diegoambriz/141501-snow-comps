import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author Diego Alfonso Ambriz Martinez 
 * @version 20-11-2014
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage []moveRight;
    private GreenfootImage []moveLeft;
    private GreenfootImage []jumpLeft;
    private GreenfootImage []jumpRight;
    private GreenfootImage []jumpDown;
    private GreenfootImage []shootRight;
    private GreenfootImage []shootLeft;
    private GreenfootImage []dead;
    
    private Counter msgScore;
    private Counter msgLifes;
    private CounterLifes countLifes;
    private int enemies;
    
    private SimpleTimer playerTimer;
    
    private GreenfootImage walkRight1 =new GreenfootImage("nickRight1.png");
    private GreenfootImage walkRight2 =new GreenfootImage("nickRight2.png");
    private GreenfootImage walkRight3 =new GreenfootImage("nickRight3.png");
        
    private GreenfootImage walkLeft1 =new GreenfootImage("nickLeft1.png");
    private GreenfootImage walkLeft2 =new GreenfootImage("nickLeft2.png");
    private GreenfootImage walkLeft3 =new GreenfootImage("nickLeft3.png");
        
    private GreenfootImage jumpLeft1 =new GreenfootImage("jumpLeft.png");
    private GreenfootImage jumpLeft2 =new GreenfootImage("jumpLeft1.png");
    private GreenfootImage jumpLeft3 =new GreenfootImage("jumpLeft2.png");
    private GreenfootImage jumpLeft4 =new GreenfootImage("jumpLeft3.png");
    private GreenfootImage jumpLeft5 =new GreenfootImage("jumpLeft4.png");
    private GreenfootImage jumpLeft6 =new GreenfootImage("nickLeft1.png");
        
    private GreenfootImage jumpRight1 =new GreenfootImage("jumpRight.png");
    private GreenfootImage jumpRight2 =new GreenfootImage("jumpRight1.png");
    private GreenfootImage jumpRight3 =new GreenfootImage("jumpRight2.png");
    private GreenfootImage jumpRight4 =new GreenfootImage("jumpRight3.png");
    private GreenfootImage jumpRight5 =new GreenfootImage("jumpRight4.png");
    private GreenfootImage jumpRight6 =new GreenfootImage("nickRight1.png");
        
    private GreenfootImage jumpDown1= new GreenfootImage("jumpDown.png");
    private GreenfootImage jumpDown2= new GreenfootImage("jumpDown2.png");
    private GreenfootImage jumpDown3= new GreenfootImage("nickRight.png");
    
    private GreenfootImage shootRight1=new GreenfootImage("shootRight1.png");
    private GreenfootImage shootRight2=new GreenfootImage("shootRight2.png");
    private GreenfootImage shootRight3=new GreenfootImage("shootRight3.png");
    
    private GreenfootImage shootLeft1=new GreenfootImage("shootLeft1.png");
    private GreenfootImage shootLeft2=new GreenfootImage("shootLeft2.png");
    private GreenfootImage shootLeft3=new GreenfootImage("shootLeft3.png");
    
    private GreenfootImage dead1=new GreenfootImage("dead1.png");
    private GreenfootImage dead2=new GreenfootImage("dead2.png");
    private GreenfootImage dead3=new GreenfootImage("dead3.png");
    private GreenfootImage dead4=new GreenfootImage("dead4.png");
    private GreenfootImage dead5=new GreenfootImage("dead5.png");
    private GreenfootImage dead6=new GreenfootImage("dead6.png");
    private GreenfootImage dead7=new GreenfootImage("dead7.png");
    private GreenfootImage dead8=new GreenfootImage("nickRight1.png");
    
    private GreenfootSound jump=new GreenfootSound("jump.mp3");
    private GreenfootSound bonus=new GreenfootSound("bonus.mp3");
    private GreenfootSound shoot=new GreenfootSound("shoot.wav");
    private GreenfootSound deadSound=new GreenfootSound("dead.mp3");
    
    private int score=0;
    private int lifes=3;
    
    private boolean isDirectionRight;
    private boolean isTurnDown;
    private boolean aKeyDown;
    private boolean upKeyDown;
    
    private String direction;
    
    private int countMoveRight;
    private int countMoveLeft;
    private int countJumpLeft;
    private int countJumpRight;
    
    public Player()
    {
        moveRight= new GreenfootImage[3];
        moveLeft= new GreenfootImage[3];
        jumpLeft= new GreenfootImage[6];
        jumpRight=new GreenfootImage[6];
        jumpDown=new GreenfootImage[3];
        shootRight=new GreenfootImage[3];
        shootLeft=new GreenfootImage[3];
        dead=new GreenfootImage[8];
        
        moveRight[0]=walkRight1;
        moveRight[1]=walkRight2;
        moveRight[2]=walkRight3;
        
        moveLeft[0]=walkLeft1;
        moveLeft[1]=walkLeft2;
        moveLeft[2]=walkLeft3;
        
        jumpLeft[0]=jumpLeft1;
        jumpLeft[1]=jumpLeft2;
        jumpLeft[2]=jumpLeft3;
        jumpLeft[3]=jumpLeft4;
        jumpLeft[4]=jumpLeft5;
        jumpLeft[5]=jumpLeft6;
        
        jumpRight[0]=jumpRight1;
        jumpRight[1]=jumpRight2;
        jumpRight[2]=jumpRight3;
        jumpRight[3]=jumpRight4;
        jumpRight[4]=jumpRight5;
        jumpRight[5]=jumpRight6;
        
        jumpDown[0]=jumpDown1;
        jumpDown[1]=jumpDown2;
        jumpDown[2]=jumpDown3;
        
        shootRight[0]=shootRight1;
        shootRight[1]=shootRight2;
        shootRight[2]=shootRight3;
        
        shootLeft[0]=shootLeft1;
        shootLeft[1]=shootLeft2;
        shootLeft[2]=shootLeft3;
        
        dead[0]=dead1;
        dead[1]=dead2;
        dead[2]=dead3;
        dead[3]=dead4;
        dead[4]=dead5;
        dead[5]=dead6;
        dead[6]=dead7;
        dead[7]=dead8;
        
        enemies=5;
        isDirectionRight=true;
        isTurnDown=false;
        aKeyDown=false;
        upKeyDown=false;
        direction="right";
        
        msgLifes=new Counter();
        msgScore=new Counter("Score:");
        countLifes=new CounterLifes();
        playerTimer=new SimpleTimer();
    
        countMoveRight=0;
        countMoveLeft=0;
        countJumpLeft=0;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void act() 
    {
        getWorld().addObject(msgScore,400,25);
        getWorld().addObject(countLifes,50, 25);
        getWorld().addObject(msgLifes,120,25);
        
        isTurnDown=false;
        msgScore.setValue(score);
        msgLifes.setValue(lifes);
        
        if(enemies==0)
        {
            Greenfoot.stop();
        }
        
        if(playerTimer.millisElapsed()>=400)
        {
            playerTimer.mark();
            aKeyDown=false;
            upKeyDown=false;
        }
        
        if(lifes==0)
        {
            Greenfoot.stop();
        }
        
        if(Greenfoot.isKeyDown("right") && isTouching(Block.class) && isTouching(BlockRight.class)!=true)
        {
            isDirectionRight=true;
            direction="right";
            aKeyDown=true;
            
            if(countMoveRight>2)
            {
                countMoveRight=0;
            }
            
            if(getX()<=770 && isTouching(Block.class)&& isTouching(BlockRight.class)!=true)
            {
                if(Greenfoot.isKeyDown("right"))
                {
                    setLocation(getX()+5,getY());
                    setImage(moveRight[countMoveRight]);
                    countMoveRight++;
                }
            }
        }
  
        if(Greenfoot.isKeyDown("left") && isTouching(Block.class) && isTouching(BlockLeft.class)!=true)
        {
            isDirectionRight=false;
            direction="left";
            aKeyDown=true;
            
            if(countMoveLeft>2)
            {
                countMoveLeft=0;
            }
            
            if(getX()>20 && isTouching(Block.class)&& isTouching(BlockLeft.class)!=true)
            {
                if(Greenfoot.isKeyDown("left"))
                {
                    setLocation(getX()-5,getY());
                    setImage(moveLeft[countMoveLeft]);
                    countMoveLeft++;
                }
            }
        }
        
        if(Greenfoot.isKeyDown("up") && isTouching(Block.class))// && upKeyDown==false && aKeyDown==false)// && isTouching(BlockDown.class)!=true)
        {
            //aKeyDown=true;
            //upKeyDown=true;
            
            
            if(isDirectionRight!=true)
            {
                jump.play();
                for(int i=0;i<6;i++)
                {
                    Greenfoot.delay(1);
                    setLocation(getX(),getY()-16);
                    setImage(jumpLeft[i]);
                }
            }
            
            else
            {
                jump.play();
                for(int j=0;j<6;j++)
                {
                    Greenfoot.delay(1);
                    setLocation(getX(),getY()-16);
                    setImage(jumpRight[j]);
                }
            }
            
            if(isTouching(Block.class)!=true)
            {
                setImage(jumpDown[1]);
                setLocation(getX(),getY()+10);
            }
        }
        
        if(isTouching(Block.class)!=true)
        {
            setLocation(getX(),getY()+10);
            
            if(getY()>=550)
            {
                setImage(jumpDown[1]);
                setLocation(getX(),550);
            }
        }
        
        if(Greenfoot.isKeyDown("Enter") && isTurnDown==false && aKeyDown==false)
        {
            shoot.play();
            SnowBall aSnowBall;
            aKeyDown=true;
            
            if(isDirectionRight==true)
            {
                aSnowBall=new SnowBall("right");
                
                for(int i=0;i<3;i++)
                {
                    Greenfoot.delay(1);
                    setImage(shootRight[i]);
                }
                
                getWorld().addObject(aSnowBall,getX()+20,getY());
            }
            
            else
            {
                aSnowBall=new SnowBall("left");
                
                for(int i=0;i<3;i++)
                {
                    Greenfoot.delay(1);
                    setImage(shootLeft[i]);
                }
                
                getWorld().addObject(aSnowBall,getX()-20,getY());
            }
        }
        
        /*if(isTouching(Block.class)!=true && getY()<550)
        {
            isTurnDown=true;
            setLocation(getX(),getY()+10);
            
            setImage(jumpDown[0]);
            setImage(jumpDown[1]);
            
            
            
            if(getY()>500)
            {
                setLocation(getX(),550);
                
                if(isDirectionRight==true)
                {
                    setImage(walkRight1);
                }
                
                else
                {
                    setImage(walkLeft1);
                }
            }
        }*/
        
        if(isTouching(Predator.class)|| isTouching(Finn.class) || isTouching(Ghost.class))
        {
            deadSound.play();
            for(int i=0;i<8;i++)
            {
                    Greenfoot.delay(2);
                    setImage(dead[i]);
            }
            setLocation(100,550);
            lifes--;
        }

        if(isTouching(Usb.class))
        {
            bonus.play();
            score+=100;
            enemies--;
        }
        
        if(isTouching(Ipod.class))
        {
            bonus.play();
            score+=300;
            enemies--;
        }
        
        if(isTouching(Tablet.class))
        {
            bonus.play();
            score+=500;
            enemies--;
        }
    }
    
    public boolean isAtEdge()
    {
        SnowCompsWorld myWorld;
        myWorld=(SnowCompsWorld)getWorld();
        
        GreenfootImage myImage=this.getImage();
        
        if(getX()-myImage.getWidth()/2<=1 || getX()+myImage.getWidth()>=myWorld.getWidth())
        return(true);
        
        //if(getY()-myImage.getHeight()<=1 || getY()+myImage.getHeight()>=myWorld.getHeight())
        //return(true);
        
       return(false);
    }
    
    
    public String getDirection()
    {
        return direction;
    }
}