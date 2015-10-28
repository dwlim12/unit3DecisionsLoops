import java.util.Scanner;

public class CompareAdjacentValues
{
    public static final double EPSILON = 1e-12;
    public static void checkForDuplicates()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a series of numbers or a character to quit.");
        
        double input = scan.nextDouble();
        
        while(scan.hasNextDouble())
        {
            double previousInput = input;
            input = scan.nextDouble();
            
            if(Math.abs(input-previousInput) < EPSILON)
            {
                System.out.println("Duplicate Input!");
            }
        }
    }
}