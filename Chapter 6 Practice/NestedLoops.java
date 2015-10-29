public class NestedLoops
{
    public static void NumberPrinter()
    {
        int num1 = 1;
        int num2 = 1;
        for(int i = 1;i <= 2;i++)
        {
            for(int j = 1;j <= 4;j++)
            {
                System.out.println(i + " " + j);
            }
        }
    }
}