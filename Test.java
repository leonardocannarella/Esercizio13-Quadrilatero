
/**
 * Test
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 29/11/2019)
 */
public class Test
{
    public static void main (String[] args)
    {
        Quadrato q;
        Rettangolo r;
        q= new Quadrato(5.6);
        r= new Rettangolo(7,2.7);
        
        System.out.println("Area quadrato: "+q.area());
        System.out.println("Perimetro quadrato: "+q.perimetro()+"\n");
        
        System.out.println("Area rettangolo: "+r.area());
        System.out.println("Perimetro rettangolo: "+r.perimetro());
    }
}
