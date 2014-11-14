import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
 * @author Diego Alfonso Ambriz Martinez 
 * @version 05-11-2014
 */
public class SnowCompsWorld extends World
{
    public static final int TAM_BLOCK=30;
    
    private SimpleTimer clock;
    private Counter msgTimer;
    
    private Finn finn1,finn2,finn3;
    private Predator predator1,predator2,predator3;
    GreenfootSound backgroundMusic = new GreenfootSound("Main Theme Snow-Comps.mp3");
    /**
     * Constructor for objects of class SnowCompsWorld.
     * 
     */
    public SnowCompsWorld()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(790, 600, 1);
        
        clock= new SimpleTimer();
        msgTimer= new Counter("Time:");
        
        msgTimer.setValue(60);
        addObject(msgTimer,730,30);
        clock.mark();
        
        
        Player player1;
        player1=new Player();
        
        
        
        finn1=new Finn();
        finn2=new Finn();
        finn3=new Finn();
        
        predator1=new Predator();
        predator2=new Predator();
        predator3=new Predator();
        
        addObject(player1,100,550);
        
        addObject(finn1,594,405);
        addObject(finn2,594,256);
        addObject(finn3,594,106);
        
        addObject(predator1,190,471);
        addObject(predator2,190,328);
        addObject(predator3,190,179);
        
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
        if(clock.millisElapsed()>=1000)
        {
            clock.mark();
            msgTimer.add(-1);
        }
        
        if(predator1.isDead()==true)
        {
            removeObject(predator1);
        }
        
        if(predator2.isDead()==true)
        {
            removeObject(predator2);
        }
        
        if(predator3.isDead()==true)
        {
            removeObject(predator3);
        }
        
        if(finn1.isDead()==true)
        {
            removeObject(finn1);
        }
        
        if(finn2.isDead()==true)
        {
            removeObject(finn2);
        }
        
        if(finn3.isDead()==true)
        {
            removeObject(finn3);
        }
    } 
}
