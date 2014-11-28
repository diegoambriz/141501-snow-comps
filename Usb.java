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
    
    public Usb()
    {
        isUsb=false;
        isDead=false;
    }
    
    public void act() 
    {
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
