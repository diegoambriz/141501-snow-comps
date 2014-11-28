import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Button
{
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.act();
    }
    
    public void buttonPressed()
    {
        this.checkLevel();
    }
    
    public void checkLevel()
    {
        SnowCompsWorld world=(SnowCompsWorld)getWorld();
        
        if(world!=null && world.getLevel()==0)
        {
            world.cleanWorld();
            world.prepare(1);
        }
    }
}
