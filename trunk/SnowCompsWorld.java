import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
 * @author Diego Alfonso Ambriz Martinez 
 * @version 20-11-2014
 */
public class SnowCompsWorld extends World
{
    public static final int TAM_BLOCK=30;
    
    /**Declaration of instance variables */
    private SimpleTimer clock;
    private Counter msgTimer;
    private Counter mins;
   
    private Player player1;
    private Finn finn1,finn2,finn3;
    private Predator predator1,predator2,predator3;
    
    private Usb usb,usb2;
    private Ipod ipod,ipod2,ipod3;
    private Tablet tablet,tablet2;
    
    private Plattaform1 plattaform1;
    private Plattaform2 plattaform2;
    
    private Plattaform3 plattaform3,plattaform5;
    private Plattaform4 plattaform4,plattaform6;
    
    private Ghost ghost;
    
    private Bonus bonus,bonus2,bonus3,bonus4,bonus5;
    
    private GreenfootSound backgroundMusic = new GreenfootSound("Main Theme Snow-Comps.mp3");
    private GreenfootSound pause=new GreenfootSound("pause.wav");
    
    private int minutes;
    /**
     * Constructor for objects of class SnowCompsWorld.
     * 
     */
    public SnowCompsWorld()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(790, 600, 1);
        
        minutes=2;
   
        clock= new SimpleTimer();
        msgTimer= new Counter("Seconds:");
        mins=new Counter("Minutes:");
        
        mins.setValue(minutes);
        addObject(mins,620,25);
        
        msgTimer.setValue(0);
        addObject(msgTimer,730,25);
        clock.mark();
        
        player1=new Player();
        
        finn1=new Finn();
        finn2=new Finn();
        finn3=new Finn();
        
        predator1=new Predator();
        predator2=new Predator();
        predator3=new Predator();
        
        ghost=new Ghost();
        
        addObject(player1,100,550);
        
        addObject(finn1,270,360);//Usb
        addObject(finn2,440,169);//Ipod
        
        addObject(predator1,525,451);//Usb
        addObject(predator2,360,263);//Ipod
        addObject(predator3,190,75);//Tablet
        
        plattaform1=new Plattaform1();
        plattaform2=new Plattaform2();
        plattaform3=new Plattaform3();
        plattaform4=new Plattaform4();//
        plattaform5=new Plattaform3();
        plattaform6=new Plattaform4();
        
        addObject(plattaform1,15,584);
        addObject(plattaform2,130,490);
        addObject(plattaform3,280,396);
        addObject(plattaform4,130,302);//
        addObject(plattaform5,280,208);
        addObject(plattaform6,130,114);
    }
    
    public void act()
    {
        backgroundMusic.playLoop();
        
        if(minutes<0)
        {
            Greenfoot.stop();
        }
        
        if(msgTimer.getValue()==0)
        {
            msgTimer.setValue(59);
            minutes--;
            mins.setValue(minutes);
        }
        
        if(clock.millisElapsed()>=1000)
        {
            clock.mark();
            msgTimer.add(-1);
        }
        
        if(msgTimer.getValue()==0 && minutes==1)
        {
            addObject(ghost,Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        }
        
        if(msgTimer.getValue()%10==0)
        {
            removeObject(ipod);
        }
        
        if(predator1.isDead()==true)
        {
            int rnd=Greenfoot.getRandomNumber(3);
            
            switch(rnd)
            {
                case 0:
                bonus=new Usb();
                break;
                
                case 1:
                bonus=new Ipod();
                break;
                
                case 2:
                bonus=new Tablet();
                break;
            }
            
            addObject(bonus,predator1.getX(),predator1.getY());
            removeObject(predator1);
            predator1.setDead(false);
        }
        
        if(predator2.isDead()==true)
        {
            int rnd=Greenfoot.getRandomNumber(3);
            
            switch(rnd)
            {
                case 0:
                bonus2=new Usb();
                break;
                
                case 1:
                bonus2=new Ipod();
                break;
                
                case 2:
                bonus2=new Tablet();
                break;
            }
            
            //addObject(bonus,360,263);
            addObject(bonus2,predator2.getX(),predator2.getY());
            removeObject(predator2);
            predator2.setDead(false);
        }
        
        if(predator3.isDead()==true)
        {
            int rnd=Greenfoot.getRandomNumber(3);
            
            switch(rnd)
            {
                case 0:
                bonus3=new Usb();
                break;
                
                case 1:
                bonus3=new Ipod();
                break;
                
                case 2:
                bonus3=new Tablet();
                break;
            }
            
            //addObject(bonus,190,75);
            addObject(bonus3,predator3.getX(),predator3.getY());
            removeObject(predator3);
            predator3.setDead(false);
        }
        
        if(finn1.isDead()==true)
        {
            int rnd=Greenfoot.getRandomNumber(3);
            
            switch(rnd)
            {
                case 0:
                bonus4=new Usb();
                break;
                
                case 1:
                bonus4=new Ipod();
                break;
                
                case 2:
                bonus4=new Tablet();
                break;
            }
            
            //addObject(bonus,190,75);
            addObject(bonus4,finn1.getX(),finn1.getY());
            removeObject(finn1);
            finn1.setDead(false);
        }
        
        if(finn2.isDead()==true)
        {
            int rnd=Greenfoot.getRandomNumber(3);
            
            switch(rnd)
            {
                case 0:
                bonus5=new Usb();
                break;
                
                case 1:
                bonus5=new Ipod();
                break;
                
                case 2:
                bonus5=new Tablet();
                break;
            }
            
            //addObject(bonus,190,75);
            addObject(bonus5,finn2.getX(),finn2.getY());
            removeObject(finn2);
            finn2.setDead(false);
        }
    }
    
    public void stopped()
    {
        pause.play();
        backgroundMusic.stop();
    }
}