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
    private SimpleTimer ipodTimer;
    
    public Ipod()
    {
        isIpod=false;
        ipodTimer=new SimpleTimer();
    }
    
    public void act() 
    {
        // Add your action code here.
        
        
        if(this.ipodTimer.millisElapsed()>=5000)
        {
            //ipodTimer.mark();
            isIpod=true;
        }
        
        if(isTouching(Player.class))
        {
            isIpod=true;
        }
    }
    
    public boolean GetIpod()
    {
        return isIpod;
    }
}
