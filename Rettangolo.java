
/**
 * Classe Rettangolo
 * 
 * @author Balda 
 * @version 0.0.1
 */
public class Rettangolo extends Quadrilatero
{    
    public Rettangolo(double l1, double l2)
    {
        super(l1, l2, l1, l2);
    }
    
    public double area()
    {
        return super.getL1()*super.getL2();
    }
    
    public double perimetro()
    {
        return super.getL1()*2+super.getL2()*2;
    }
}
