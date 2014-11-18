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
    private Ipod ipod2; 
    
    private int posX;
    private int posY;
    private boolean predatorDead;
    GreenfootSound backgroundMusic = new GreenfootSound("Main Theme Snow-Comps.mp3");
    
    private SimpleTimer ipodTimer;
    
    /**
     * Constructor for objects of class SnowCompsWorld.
     * 
     */
    public SnowCompsWorld()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(790, 600, 1);
        
        predatorDead=false;
        
        clock= new SimpleTimer();
        msgTimer= new Counter("Time:");
        
        msgTimer.setValue(59);
        addObject(msgTimer,730,30);
        clock.mark();
        
        
        Player player1;
        player1=new Player();
        
        ipod2=new Ipod();
        
        finn1=new Finn();
        finn2=new Finn();
        finn3=new Finn();
        
        predator1=new Predator();
        predator2=new Predator();
        predator3=new Predator();
        
        addObject(player1,100,550);
        
        addObject(finn1,270,405);
        addObject(finn2,440,256);
        addObject(finn3,594,106);
        
        addObject(predator1,440,471);
        addObject(predator2,360,328);
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
        
        posX=predator1.getX();
        posY=predator1.getY();
        
        //ipod2=new Ipod();
        ipodTimer=new SimpleTimer();
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
            addObject(ipod2,posX,posY);
            removeObject(predator1);
           
            predator1.setDead(false);
            predatorDead=true;
            
        }
        
        if(predatorDead==true)
        {
            ipodTimer.mark();
        }
        
        if(ipodTimer.millisElapsed()>=5000 && predatorDead==true)
        {
            removeObject(ipod2);
        }
        
        if(ipod2.GetIpod()==true)
        {
            removeObject(ipod2);
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
