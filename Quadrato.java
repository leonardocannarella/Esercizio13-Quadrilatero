
/**
 * Classe Quadrato
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 29/11/2019)
 */
public class Quadrato extends Quadrilatero
{
    
    public Quadrato(double l)
    {
        super(l, l , l, l);
    }
    
    public double area()
    {
        return super.getL1()*super.getL1();
    }
    
    public double getLato()
    {
        return super.getL1();
    }
}
