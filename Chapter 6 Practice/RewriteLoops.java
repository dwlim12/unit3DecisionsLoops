public class RewriteLoops
{
    public static void whileLoops()
    {
        int s = 0;
        int i = 1;
        while(i <= 10)
        {
            s += i;
            i ++;
            System.out.println(s);
        }
        
        int n = in.nextInt();
        double x = 0;
        double s = 1;
        while(s > 0.01)
        {
            s = 1.0 / (1+ n * n);
            n++;
            x = x + s;
        }
    }
}