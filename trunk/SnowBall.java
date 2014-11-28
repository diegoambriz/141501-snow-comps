import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnowBall here.
 * 
 * @author Diego Alfonso Ambriz Martinez 
 * @version 20-11-2014
 */
public class SnowBall extends Actor
{
    /**
     * Act - do whatever the SnowBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String shootDirection;
    private boolean target;
    
    /**
     * Constructor de la clase SnowBall
     */
    public SnowBall(String aDirection)
    {
        shootDirection=aDirection;
        target=false;
    }
    
    /**
     * Agrega un objeto SnowBall al mundo
     */
    public void act() 
    {
        if(shootDirection=="right")
        {
            setLocation(getX()+25,getY());
        }
        
        else
        {
            setLocation(getX()-25,getY());
        }
        
        if(isAtEdge()|| isTouching(BlockLeft.class) || isTouching(BlockRight.class))
        {
            getWorld().removeObject(this);
        }
        
        //if(isTouching(Predator.class))
        //{
          //  target=true;
           // getWorld().removeObject(this);
        //}
    }
    
    public boolean isShoot()
    {
        return target;
    }
    
    public boolean shootPredator()
    {
        if(target==true)
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
}
