import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plattaform1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plattaform1 extends Actor
{
    /**
     * Act - do whatever the Plattaform1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Block [] array;
    
    public Plattaform1()
    {
       array= new Block[25];
       
       for(int i=0;i<25;i++)
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
        getWorld().addObject(array[2], getX()+30, getY()-30);
        getWorld().addObject(array[3], getX(), getY()-30);
        getWorld().addObject(array[4], getX()+30, getY()-60);
        getWorld().addObject(array[5], getX(), getY()-60);

        
        getWorld().addObject(array[6], getX()+30, getY());
        getWorld().addObject(array[7], getX()+60, getY());
        getWorld().addObject(array[8], getX()+90, getY());
        getWorld().addObject(array[9], getX()+120, getY());
        getWorld().addObject(array[10], getX()+150, getY());
        getWorld().addObject(array[11], getX()+180, getY());
        getWorld().addObject(array[12], getX()+210, getY());
        getWorld().addObject(array[13], getX()+240, getY());
        getWorld().addObject(array[14], getX()+270, getY());
        getWorld().addObject(array[15], getX()+300, getY());
        getWorld().addObject(array[16], getX()+330, getY());
        getWorld().addObject(array[17], getX()+360, getY());
        getWorld().addObject(array[18], getX()+390, getY());
        getWorld().addObject(array[19], getX()+410, getY());
        getWorld().addObject(array[20], getX()+440, getY());
        getWorld().addObject(array[21], getX()+470, getY());
        getWorld().addObject(array[22], getX()+500, getY());
        getWorld().addObject(array[23], getX()+530, getY());
        
        
    }
}
