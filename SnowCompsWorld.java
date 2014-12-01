import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/** 
 * @author Diego Alfonso Ambriz Martinez 
 * @version 27-11-2014
 */

/**
 * Clase del escenario
 */
public class SnowCompsWorld extends World
{
    /**
     * Declaracion de variables de instancia
     */
    private Player player1;
    
    private GreenfootSound backgroundMusic;
    private GreenfootSound pause;
    private GreenfootSound play;
    private int level;
    
    /**
     * Constructor de la clase SnowCompsWorld
     */
    public SnowCompsWorld()
    {
        super(790,600,1);
        
        player1=new Player();
        level=0;
        
        backgroundMusic=new GreenfootSound("Main Theme Snow-Comps.mp3");
        pause=new GreenfootSound("pause.wav");
        play=new GreenfootSound("play.mp3");
        
        prepare(0);
    }
    
    /**
     * Metodo actuar de la clase SnowCompsWorld
     */
    public void act()
    {
        
    }
    
    /**
     * Metodo para agregar los objetos de cada nivel del juego
     */
    public void prepare(int aLevel)
    {
        switch(aLevel)
        {
            case 0:
            menu();
            break;
            
            case 1:
            play.play();
            Greenfoot.delay(30);
            backgroundMusic.playLoop();
            level1();
            break;
            
            case 2:
            level2();
            break;
            
            case 3:
            level3();
            break;
        }
    }
    
    /**
     * Metodo para visualizar en pantalla el menu principal
     */
    public void menu()
    {
        setBackground("menu.png");
        
        PlayButton playButton=new PlayButton();
        ScoreButton scoreButton=new ScoreButton();
        HelpButton helpButton=new HelpButton();
        CreditsButton creditsButton=new CreditsButton();
        
        addObject(player1,100,550);
        
        addObject(playButton, getWidth()/2, 300);
        addObject(scoreButton, getWidth()/2, 370);
        addObject(helpButton, getWidth()/2, 440);
        addObject(creditsButton, getWidth()/2, 510);
    }
   
    /**
     * Nivel 1 del juego el cual incluye pocos enemigos,se agrega el escenario correspondiente al nivel
     */
    public void level1()
    {
        setBackground("background16.jpg");
        level=1;
        Plattaform1 plattaform1=new Plattaform1();
        Plattaform5 plattaform2,plattaform3,plattaform4,plattaform5,plattaform6;
        
        Predator predator1,predator2,predator3;
        Finn finn1,finn2;
        Ghost ghost;
        
        ghost=new Ghost();
        
        predator1=new Predator();
        predator2=new Predator();
        predator3=new Predator();
        
        finn1=new Finn();
        finn2=new Finn();
        
        plattaform2=new Plattaform5();
        plattaform3=new Plattaform5();
        plattaform4=new Plattaform5();
        plattaform5=new Plattaform5();
        plattaform6=new Plattaform5();
        
        
        addObject(plattaform1,15,584);
        
        addObject(plattaform2,130,490);
        addObject(plattaform3,130,396);
        addObject(plattaform4,130,302);
        addObject(plattaform5,130,208);
        addObject(plattaform6,130,114);
        
        addObject(player1,100,550);
        addObject(predator1,525,451);
        addObject(predator2,525,263);
        addObject(predator3,525,75);
        
        addObject(finn1,270,360);
        addObject(finn2,440,169);
        
        addObject(ghost,Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
    }
    
    /**
     * Nivel 2 del juego,se agrega el escenario correspondiente al nivel,asi como los enemigos del nivel
     */
    public void level2()
    {
        setBackground("background15.jpg");
        level=2;
        Plattaform1 plattaform10;
        Plattaform2 plattaform11;
        
        Plattaform3 plattaform12,plattaform13;
        Plattaform4 plattaform14,plattaform15;
        
        Predator predator4,predator5,predator6;
        Finn finn4,finn5,finn6;
        
        predator4=new Predator();
        predator5=new Predator();
        predator6=new Predator();
        
        finn4=new Finn();
        finn5=new Finn();
        finn6=new Finn();
        
        Ghost ghost;
        
        ghost=new Ghost();
        
        plattaform10=new Plattaform1();
        plattaform11=new Plattaform2();
        plattaform12=new Plattaform3();
        plattaform13=new Plattaform3();
        plattaform14=new Plattaform4();
        plattaform15=new Plattaform4();
        
        addObject(player1,100,550);
        
        addObject(plattaform10,15,584);
        addObject(plattaform11,130,490);
        addObject(plattaform12,280,396);
        addObject(plattaform14,130,302);//
        addObject(plattaform13,280,208);
        addObject(plattaform15,130,114);
        
        addObject(player1,100,550);
        addObject(predator4,525,451);
        addObject(predator5,525,263);
        addObject(predator6,525,75);
        
        addObject(finn4,270,360);
        addObject(finn5,440,169);
        
        addObject(ghost,Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
    }
    
    /**
     * Nivel 3 del juego,se agrega el escenario correspondiente al nivel,asi como los enemigos del nivel
     */
    public void level3()
    {
        setBackground("background8.jpg");
        level=3;
        Plattaform1 plattaform30=new Plattaform1();
        
        Plattaform6 plattaform31=new Plattaform6();
        Plattaform6 plattaform32=new Plattaform6();
        Plattaform6 plattaform33=new Plattaform6();
        
        Plattaform7 plattaform34=new Plattaform7();
        
        Plattaform6 plattaform35=new Plattaform6();
        Plattaform6 plattaform36=new Plattaform6();
        
        Plattaform7 plattaform37=new Plattaform7();
        
        Plattaform6 plattaform38=new Plattaform6();
        Plattaform6 plattaform39=new Plattaform6();
        Plattaform6 plattaform40=new Plattaform6();
        
        Predator predator1,predator2,predator3,predator4,predator5,predator6,predator7;
        Finn finn1,finn2,finn3,finn4,finn5,finn6,finn7;
        Ghost ghost;
        
        predator1=new Predator();
        predator2=new Predator();
        predator3=new Predator();
        predator4=new Predator();
        predator5=new Predator();
        predator6=new Predator();
        predator7=new Predator();
        
        finn1=new Finn();
        finn2=new Finn();
        finn3=new Finn();
        finn4=new Finn();
        finn5=new Finn();
        finn6=new Finn();
        finn7=new Finn();
        
        
        
        ghost=new Ghost();
        
        addObject(player1,50,550);
        
        addObject(plattaform30,15,584);
        
        addObject(plattaform31,15,490);
        addObject(plattaform32,308,490);
        addObject(plattaform33,600,490);
        
        addObject(plattaform34,120,396);
        
        addObject(plattaform35,75,302);
        addObject(plattaform36,525,302);
        
        addObject(plattaform37,120,208);
        
        addObject(plattaform38,15,114);
        addObject(plattaform39,308,114);
        addObject(plattaform40,600,114);
        
        addObject(finn1,368,451);
        addObject(predator1,75,451);
        addObject(predator2,660,451);
        
        addObject(finn2,150,360);
        addObject(finn3,680,360);
        addObject(predator3,450,360);
        
        addObject(predator4,135,263);
        addObject(finn4,600,263);
        
        addObject(finn5,390,169);
        addObject(predator5,150,169);
        addObject(predator6,600,169);
        
        addObject(predator7,350,75);
        addObject(finn6,105,75);
        addObject(finn7,630,75);
        
        addObject(ghost,Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
    }
    
    /**
     * Elimina todos los objetos en el mundo
     */
    public void cleanWorld()
    {
        int num,i=0;
        num=getObjects(null).size(); //Obtiene numero de objetos en el mundo
        Actor elimina;
        while(i<num)
        {
            elimina= (Actor) getObjects(null).get(0);
            removeObject(elimina);
            i++;
        }
    }
   
    /**
     * Regresa el nivel actual
     */
    public int getLevel()
    {
        return level;
    }
    
    /**
     * Establece un nivel del juego de acuerdo a un parametro
     */
    public void setLevel(int aLevel)
    {
        level=aLevel;
    }
    
    /**
     * Reproduce la musica principal del juego
     */
    public void started()
    {
        if(level>0)
        {
            backgroundMusic.playLoop();
        }
    }
    
    /**
     * Detiene la musica del juego
     */
    public void stopped()
    {
        pause.play();
        backgroundMusic.stop();
    }
    
    /**
     * Detiene la musica de fondo del juego
     */
    public void stopMusic()
    {
        backgroundMusic.stop();
    }
    
    /**
     * Visualiza los records en pantalla
     */
    public void records()
    {
        
        java.util.List records=UserInfo.getTop(7);
        Record usuario;
        UserInfo info;
        if(records!=null)
        {
            for(int i=0; i<records.size(); i++)
            {
                info=(UserInfo)records.get(i);
                usuario=new Record((i+1)+".- "+info.getUserName(),info.getScore());
                usuario.addToWorld(50+35*i,this);
            }

            Advice let;
            if(UserInfo.getMyInfo().getRank()>0)
            {
                let=new Advice("Your Position:"+UserInfo.getMyInfo().getRank());
            }
            
            else
            {
                let=new Advice("You aren't in the Records List");
                
            }
            
            this.addObject(let,20+(let.getImage().getWidth()/2),380);
        }
        else
        {
            Advice letr=new Advice("Whitout Scores...");
            this.addObject(letr,350,250);
        }
    }
    
    /**
     * Actauliza el score del jugador
     */
    public void updateScore()
    {
        if(UserInfo.isStorageAvailable())
        {
            UserInfo info=UserInfo.getMyInfo();
            if(player1.getScore()>player1.getScore())
            {
                info.setScore(player1.getScore());
            }
            info.store();
        }
    }
}