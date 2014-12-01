import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ipod here.
 * 
 * @author Diego Alfonso Ambriz Martinez 
 * @version 20-11-2014
 */
public class Ipod extends Bonus
{
    public Ipod()
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
