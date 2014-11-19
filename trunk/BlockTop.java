import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlockTop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlockTop extends Actor
{
    /**
     * Act - do whatever the BlockTop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BlockTop()
    {
        dibujar();
    }
    
    public void act() 
    {
        // Add your action code here.
    }
    
    public void dibujar()
    {
        GreenfootImage imagen;
        imagen=new GreenfootImage("block.png");
        this.setImage(imagen);
    }
}
