import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Usb here.
 * 
 * @author Diego Alfonso Ambriz Martinez 
 * @version 20-11-2014
 */
public class Usb extends Bonus
{
    public Usb()
    {
  
    }
    
    public void act() 
    {
        if(isTouching(Player.class))
        {
            getWorld().removeObject(this);
        }
    }
}
