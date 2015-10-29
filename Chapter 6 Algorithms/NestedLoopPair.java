public class NestedLoopPair
{
    public static void forLoop()
    {
        for (int num1 = 1; num1 <= 2; num1++)
        {
            for (int num2 = 1; num2 <= 4; num2++)
            {
                System.out.println(num1 + " " + num2);
            }
        }
    }
    
    public static void whileLoop()
    {
        int num3 = 1;
        int num4 = 1;
        while (num3 <= 2)
        {
            while (num4 <= 4)
            {
                System.out.println(num3 + " " + num4);
                num4++;
            }
            num3++;
            num4 =1;
            
        }
    }
    
    public static void doLoops()
    {
        int x = 1;
        int i = 1;
        do
        {
            i = 1;
            do
            {
                System.out.println(x + " "+i);
                i++;
            }
            while(i < 5);
            x++;
        }
        while(x < 3);
    }
}
        