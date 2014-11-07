import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Block()
    {
        dibujar();
    }
        
    public void act() 
    {

    }
    
    public void dibujar()
    {
        GreenfootImage imagen;
        imagen=new GreenfootImage(SnowCompsWorld.TAM_BLOCK, SnowCompsWorld.TAM_BLOCK);
        imagen.setColor(java.awt.Color.white);
        imagen.fill();
        this.setImage(imagen);
    }  
}
