import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Usb here.
 * 
 * @author Diego Alfonso Ambriz Martinez 
 * @version 20-11-2014
 */
public class Usb extends Bonus
{
    /**
     * Act - do whatever the Usb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean isUsb;
    private boolean isDead;
    private SimpleTimer ipodTimer;
    
    public Usb()
    {
        isUsb=false;
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
            isUsb=true;
            getWorld().removeObject(this);
        }
    }
    
    public void setUsb(boolean dead)
    {
        isDead=dead;
    }
    
    public boolean GetUsb()
    {
        return isUsb;
    }
}
