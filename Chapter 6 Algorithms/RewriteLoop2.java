public class RewriteLoop2
{
    public static void loop2()
    {
        double x = 0;
        double s = 1;
        while ( s> 0.01 )
        {
            s = 1.0/(1 + n*n);
            n++;
            x = x + s;
        }
    }
}