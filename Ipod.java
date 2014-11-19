import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ipod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ipod extends Bonus
{
    /**
     * Act - do whatever the Ipod wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean isIpod;
    private boolean isDead;
    private SimpleTimer ipodTimer;
    
    public Ipod()
    {
        isIpod=false;
        ipodTimer=new SimpleTimer();
        ipodTimer.mark();
        isDead=false;
    }
    
    public void act() 
    {
        // Add your action code here.
        
        
        if(isDead==true)
        {
            ipodTimer.mark();
            if(ipodTimer.millisElapsed()>=10000)
            {
                getWorld().removeObject(this);
            }
        }
        /*if(this.ipodTimer.millisElapsed()>=10000)
        {
            ipodTimer.mark();
            isIpod=true;
        }*/
        
        if(isTouching(Player.class))
        {
            isIpod=true;
        }
    }
    
    public void setIpod(boolean dead)
    {
        isDead=dead;
    }
    
    public boolean GetIpod()
    {
        return isIpod;
    }
}
