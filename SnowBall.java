import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnowBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnowBall extends Actor
{
    /**
     * Act - do whatever the SnowBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String shootDirection;
    private boolean target;

    public SnowBall(String aDirection)
    {
        shootDirection=aDirection;
        target=false;
    }
    
    public void act() 
    {
        if(shootDirection=="right")
        {
            setLocation(getX()+10,getY());
        }
        
        else
        {
            setLocation(getX()-10,getY());
        }
        
        if(isAtEdge())
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
