import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plattaform3 here.
 * 
 * @author Diego Alfonso Ambriz Martinez 
 * @version 20-11-2014
 */
public class Plattaform6 extends Actor
{
    /**
     * Act - do whatever the Plattaform3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private Block [] array;
   
    public Plattaform6()
    {
       array= new Block[30];
       
       for(int i=0;i<30;i++)
       {
           array[i]=new Block();
       }
    }
    
    public void act() 
    {
        // Add your action code here.
    }
    
    protected void addedToWorld(World world)
    {
        getWorld().addObject(array[0], getX(), getY());
        getWorld().addObject(array[1], getX()+30, getY());
        getWorld().addObject(array[2], getX()+60, getY());
        getWorld().addObject(array[3], getX()+90, getY());
        getWorld().addObject(array[4], getX()+120, getY());
        getWorld().addObject(array[5], getX()+150, getY());
        getWorld().addObject(array[6], getX()+180, getY());
       
    }    
}