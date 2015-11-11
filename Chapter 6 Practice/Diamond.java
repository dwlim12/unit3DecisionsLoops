import java.util.Scanner;

public class Diamond
{
    public static void WriteDiamond()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length of the diamond: ");
        int side_length = in.nextInt();
        for(int i = 1; i <= side_length; i++)
        {
            for(int j = 1; j <= (side_length - i); j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= (side_length - (side_length-i)); k++)
            {
                System.out.print("*");
            }
            for(int k = 1; k <= (side_length - (side_length-i+1)); k++)
            {
                System.out.print("*");
            }
            for(int l = 1; l <= (side_length - i); l++)
            {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        
         for(int i = (side_length - 1); i >= 1; i--)
        {
            for(int j = 1; j <= (side_length - i); j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= (side_length - (side_length-i)); k++)
            {
                System.out.print("*");
            }
            for(int k = 1; k <= (side_length - (side_length-i+1)); k++)
            {
                System.out.print("*");
            }
            for(int l = 1; l <= (side_length - i); l++)
            {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}