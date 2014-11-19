import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plattaform2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plattaform3 extends Actor
{
    /**
     * Act - do whatever the Plattaform2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Block [] array;
    private BlockTop [] array2;
    private BlockBottom [] array3;
    
    public Plattaform3()
    {
       array= new Block[20];
       array2= new BlockTop[4];
       array3= new BlockBottom [2];
       
       for(int i=0;i<20;i++)
       {
           array[i]=new Block();
       }
       
       for(int i=0;i<4;i++)
       {
           array2[i]=new BlockTop();
       }
       
       for(int i=0;i<2;i++)
       {
           array3[i]=new BlockBottom();
       }
    }
    
    public void act() 
    {
        // Add your action code here.
    }
    
    protected void addedToWorld(World world)
    {
       getWorld().addObject(array[0],getX(),getY());//Block
       getWorld().addObject(array[1],getX()+30,getY());//Block
       getWorld().addObject(array[2],getX()+60,getY());//Block
       getWorld().addObject(array[3],getX()+90,getY());//Block
       getWorld().addObject(array[4],getX()+120,getY());//Block
       getWorld().addObject(array[5],getX()+150,getY());//Block
       getWorld().addObject(array[6],getX()+180,getY());//Block
       getWorld().addObject(array[7],getX()+210,getY());//Block
       getWorld().addObject(array[8],getX()+240,getY());//Block
       getWorld().addObject(array[9],getX()+270,getY());//Block
       getWorld().addObject(array[10],getX()+300,getY());//Block
       getWorld().addObject(array[11],getX()+330,getY());//Block
       
       getWorld().addObject(array3[0],getX()+360,getY());//BlockBottom
       getWorld().addObject(array3[1],getX()+390,getY());//BlockBottom
       
       getWorld().addObject(array2[0],getX()+360,getY()-30);//BlockTop
       getWorld().addObject(array2[1],getX()+390,getY()-30);//BlockTop
       
       getWorld().addObject(array2[2],getX()+360,getY()-60);//BlockTop
       getWorld().addObject(array2[3],getX()+390,getY()-60);//BlockTop
    }  
}
