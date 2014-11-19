import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plattaform1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plattaform2 extends Actor
{
    /**
     * Act - do whatever the Plattaform1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private Block [] array;
    private BlockTop [] array2;
    private BlockBottom [] array3;
    
    public Plattaform2()
    {
       array= new Block[20];
       array2= new BlockTop[4];
       array3= new BlockBottom[2];
       
       for(int i=0;i<20;i++)
       {
           array[i]=new Block();
       }
       
       for(int j=0;j<4;j++)
       {
           array2[j]=new BlockTop();
       }
       
       for(int k=0;k<2;k++)
       {
           array3[k]=new BlockBottom();
       }
    }
    
    public void act() 
    {
        // Add your action code here.
    }
    
    protected void addedToWorld(World world)
    {
        getWorld().addObject(array2[0],getX(),getY()-60); //BlockTop Left
        getWorld().addObject(array2[1],getX()+30,getY()-60);//BlockTop Right
        
        getWorld().addObject(array2[2],getX(),getY()-30); //BlockTop Left
        getWorld().addObject(array2[3],getX()+30,getY()-30);//BlockTop Right
        
        getWorld().addObject(array3[0],getX(),getY());//BlockBottom Left
        getWorld().addObject(array3[1],getX()+30,getY());//BlockBottom Right
        
        getWorld().addObject(array[0],getX()+60,getY());//Block
        getWorld().addObject(array[1],getX()+90,getY());//Block
        getWorld().addObject(array[2],getX()+120,getY());//Block
        getWorld().addObject(array[3],getX()+150,getY());//Block
        getWorld().addObject(array[4],getX()+180,getY());//Block
        getWorld().addObject(array[5],getX()+210,getY());//Block
        getWorld().addObject(array[6],getX()+240,getY());//Block
        getWorld().addObject(array[7],getX()+270,getY());//Block
        getWorld().addObject(array[8],getX()+300,getY());//Block
        getWorld().addObject(array[9],getX()+330,getY());//Block
        getWorld().addObject(array[10],getX()+360,getY());//Block
        getWorld().addObject(array[11],getX()+390,getY());//Block
        getWorld().addObject(array[12],getX()+420,getY());//Block
        getWorld().addObject(array[13],getX()+450,getY());//Block
        getWorld().addObject(array[14],getX()+480,getY());//Block
        getWorld().addObject(array[15],getX()+510,getY());//Block
        getWorld().addObject(array[16],getX()+540,getY());//Block
    }
}
