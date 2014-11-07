import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
 * @author Diego Alfonso Ambriz Martinez 
 * @version 05-11-2014
 */
public class SnowCompsWorld extends World
{
    public static final int TAM_BLOCK=30;
    /**
     * Constructor for objects of class SnowCompsWorld.
     * 
     */
    public SnowCompsWorld()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
        Player player1;
        player1=new Player();
        
        addObject(player1,100,580);
        
        Plattaform1 plattaform;
        plattaform=new Plattaform1();
        
        Plattaform1 plattaform3;
        plattaform3=new Plattaform1();
        
        Plattaform2 plattaform2;
        plattaform2=new Plattaform2();
        
        Plattaform2 plattaform4;
        plattaform4=new Plattaform2();
        
        //addObject(plattaform,100,450);
        addObject(plattaform,130,530);
        addObject(plattaform2,130,380);
        addObject(plattaform3,130,230);
        addObject(plattaform4,130,80);
    }
}
