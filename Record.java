import greenfoot.*;
/**
 * Write a description of class RecordUser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Record  
{
    private Advice nombre;
    private Advice puntos;

    public Record(String name, int score)
    {
        nombre=new Advice(name);
        String cad=""+score;
        puntos=new Advice(cad);
    }
   
    public void addToWorld(int Y, World mundo)
    {
        mundo.addObject(nombre,110+(nombre.getImage().getWidth()/2),Y);
        mundo.addObject(puntos,420+(puntos.getImage().getWidth()/2),Y);
    } 
}
