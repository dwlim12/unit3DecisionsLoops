import java.util.Scanner;

public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      double xcenter1 = 0;
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      double xcenter2 = 40;
      double ycenter2 = 0;
      
      if (radius1 < 20 && radius2 < 20)
      {
          System.out.println("The circles are disjoint.");
        }
      if (radius1 > 20 && radius2 > 20)
      {
          System.out.println("The circles are overlapping.");
        }
      if (radius1 >= (40 + radius2) || radius2 >= (radius1 + 20))
      {
          System.out.println("One of the circles is mutually contained in the other.");
        }
   }
}