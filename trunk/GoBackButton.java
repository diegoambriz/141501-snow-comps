import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoBackButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoBackButton extends Button
{
    /**
     * Act - do whatever the GoBackButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.act();
    }
    
    public void buttonPressed()
    {
        //GoBackButton goBackButton=new GoBackButton();
        SnowCompsWorld world=(SnowCompsWorld)super.getWorld();
        world.cleanWorld();
        //world.setBackground("");
        //world.addObject(goBackButton, 720, 540);
        world.prepare(0);
    }
}
