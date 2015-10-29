import java.util.Scanner;

public class MaxAndMin
{
    public static double maximum()
    {
        Scanner scan = new Scanner( System.in );
        System.out.println( "Enter a series of number or any character to stop. " );
        double largest = scan.nextDouble();
        
        while( scan.hasNextDouble())
        {
            double input = scan.nextDouble();
            if( input > largest )
            {
                largest = input;
            }
        }
        
        return largest;
    }
    
    public static double minimum()
    {
        Scanner scan = new Scanner( System.in );
        System.out.println( "Enter a series of number or any character to stop. " );
        double smallest = scan.nextDouble();
        
        while( scan.hasNextDouble())
        {
            double input = scan.nextDouble();
            if( input < smallest )
            {
                smallest = input;
            }
        }
        
        return smallest;
    }
}
        