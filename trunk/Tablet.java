import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tablet here.
 * 
 * @author Diego Alfonso Ambriz Martinez 
 * @version 20-11-2014
 */
public class Tablet extends Bonus
{
    public Tablet()
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
