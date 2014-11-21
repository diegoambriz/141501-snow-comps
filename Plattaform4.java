import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plattaform1 here.
 * 
 * @author Diego Alfonso Ambriz Martinez 
 * @version 20-11-2014
 */



public class Plattaform4 extends Actor
{
    /**
     * Act - do whatever the Plattaform1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    /**Declaration of instance variables */
    private Block [] array;
    private BlockLeft [] array2;
    private BlockRight [] array3;
    private BlockBottom [] array4;
    
    public Plattaform4()
    {
       array = new Block[20];
       array2 = new BlockLeft[2];
       array3 = new BlockRight[2];
       array4 = new BlockBottom[2];
       
       for(int i=0;i<20;i++)
       {
           array[i]=new Block();
       }
       
       for(int j=0;j<2;j++)
       {
           array2[j]=new BlockLeft();
       }
       
       for(int k=0;k<2;k++)
       {
           array3[k]=new BlockRight();
       }
       
       for(int l=0;l<2;l++)
       {
           array4[l]=new BlockBottom();
       }
    }
    
    public void act() 
    {
        
    }
    
    protected void addedToWorld(World world)
    {
        getWorld().addObject(array3[0],getX(),getY()-60); //BlockTop Left
        getWorld().addObject(array2[0],getX()+30,getY()-60);//BlockLeft Right
        
        getWorld().addObject(array3[1],getX(),getY()-30); //BlockTop Left
        getWorld().addObject(array2[1],getX()+30,getY()-30);//BlockLeft Right
        
        getWorld().addObject(array4[0],getX(),getY());//BlockBottom Left
        getWorld().addObject(array4[1],getX()+30,getY());//BlockBottom Right
        
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
    }
}