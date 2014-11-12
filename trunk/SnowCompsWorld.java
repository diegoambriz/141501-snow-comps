import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
 * @author Diego Alfonso Ambriz Martinez 
 * @version 05-11-2014
 */
public class SnowCompsWorld extends World
{
    public static final int TAM_BLOCK=30;
    GreenfootSound backgroundMusic = new GreenfootSound("Main Theme Snow-Comps.mp3");
    /**
     * Constructor for objects of class SnowCompsWorld.
     * 
     */
    public SnowCompsWorld()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(790, 600, 1);
        
        Player player1;
        player1=new Player();
        
        addObject(player1,100,550);
        
        Plattaform1 plattaform1;
        Plattaform2 plattaform2;
        Plattaform3 plattaform3;
        Plattaform4 plattaform4;
        
        Plattaform3 plattaform5;
        Plattaform4 plattaform6;
        Plattaform3 plattaform7;
        
        plattaform1=new Plattaform1();
        plattaform2=new Plattaform2();
        plattaform3=new Plattaform3();
        plattaform4=new Plattaform4();//
        plattaform5=new Plattaform3();
        plattaform6=new Plattaform4();
        plattaform7=new Plattaform3();
        
        addObject(plattaform1,15,584);
        addObject(plattaform2,130,510);
        addObject(plattaform3,300,440);
        addObject(plattaform4,130,367);//
        addObject(plattaform5,300,291);
        addObject(plattaform6,130,218);
        addObject(plattaform7,300,145);
    }
    
    public void act()
    {
        backgroundMusic.playLoop();
    } 
}
