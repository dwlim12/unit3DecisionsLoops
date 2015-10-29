public class RewriteLoop1
{
    public static void loop1()
    {
        int s = 0;
        int i = 1;
        
        while (i <= 10)
        {
            s += i;
            System.out.println(s);
            i += 1;
            System.out.print("  " + i);
        }
    }
}