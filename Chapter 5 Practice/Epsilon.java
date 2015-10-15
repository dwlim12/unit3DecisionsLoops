import java.util.Scanner;

public class Epsilon
{
    public final static double EPSILON = 1e-14;
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a floating point number: ");
        double i = in.nextDouble();
        
        String adj = "";
        if (Math.abs(i) < 1.0)
        {
            adj = "small";
        }
        
        if (Math.abs(i) > 1000000)
        {
            adj = "large";
        }
        
        if (Math.abs(i) < EPSILON)
        {
            System.out.println("It's a zero");
        }
        else if (i > 0)
        {
            System.out.println("It's a " + adj + " positive number.");
        }
        else
        {
            System.out.println("it's a " + adj + " negative number.");
        }
    }
}
