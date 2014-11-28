import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Letrero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Advice extends Actor
{
    private String unMensaje;//variable en donde se guardara un mensaje
    
    public Advice(String unaCadena)
    {
        unMensaje=unaCadena;
        super.setImage(new GreenfootImage(""+unMensaje,25,java.awt.Color.WHITE,null));
    }

    public String muestraLetrero(String unaCadena)
    {
        unMensaje=unaCadena;
        super.setImage(new GreenfootImage(""+unMensaje,25,java.awt.Color.WHITE,null));
        return unMensaje;
    }
}
  

