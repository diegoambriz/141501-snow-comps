import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlockTop here.
 * 
 * @author Diego Alfonso Ambriz Martinez 
 * @version 20-11-2014
 */
public class BlockLeft extends Actor
{
    /**
     * Act - do whatever the BlockTop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    /**
     * Constructor de la clase BlockLeft
     */
    public BlockLeft()
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
