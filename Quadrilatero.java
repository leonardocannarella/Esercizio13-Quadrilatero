
/**
 * Classe astratta Quadrilatero
 * 
 * @author Balda 
 * @version 0.0.1
 */
public abstract class Quadrilatero implements IQuadrilatero
{
    private double l1;
    private double l2;
    private double l3;
    private double l4;
    
    public Quadrilatero(double a, double b, double c, double d)
    {
        l1=a;
        l2=b;
        l3=c;
        l4=d;
    }
    
    public abstract double area();
    
    public double perimetro()
    {
        return l1+l2+l3+l4;
    }
    
    public double getL1()
    {
        return l1;
    }
    
    public double getL2()
    {
        return l2;
    }
    
    public double getL3()
    {
        return l3;
    }
    
    public double getL4()
    {
        return l4;
    }
    
    public String toString()
    {
        return "Lato 1: "+getL1()+
        "\nLato 2: "+getL2()+
        "\nLato 3: "+getL3()+
        "\nLato 4: "+getL4();
    }
}
