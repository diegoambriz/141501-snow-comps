import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ipod here.
 * 
 * @author Diego Alfonso Ambriz Martinez 
 * @version 20-11-2014
 */
public class Ipod extends Bonus
{
    /**
     * Act - do whatever the Ipod wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean isIpod;
    private boolean isDead;
    
    public Ipod()
    {
        isIpod=false;
        isDead=false;
    }
    
    public void act() 
    {
        if(isTouching(Player.class))
        {
            getWorld().removeObject(this);
        }
    }
}
