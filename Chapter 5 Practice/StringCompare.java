public class StringCompare
{
    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        String word1a = word1.substring(0,3);
        
        int result1 = word1.compareTo("aaa");
        int result2 = word1.compareTo(word2);
        int result3 = word2.compareTo(word1a);
        
        if (result1 > 0)
        {
            System.out.println("Word 1 is greater than aaa.");
        }
        
        if (result2 == 0)
        {
            System.out.println("Word 1 is equal to word 2.");
        }
        
        if (result2 < 0)
        {
            System.out.println("Word 1 is less than word 2.");
        }
        
        if (result3 == 0)
        {
            System.out.println("Word 1 has the same 3 letter prefix as word 2.");
        }
    }
}