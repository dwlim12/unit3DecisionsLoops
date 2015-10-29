public class CountingMatches
{
    public static int countSpaces( String str )
    {
        int spaces = 0;
        
        for( int i = 0;
             i < str.length();
             i++ )
        {
            char ch = str.charAt( i );
            if( ch == ' ' )
            {
                spaces++;
            }
        }
        return spaces;
    }
}