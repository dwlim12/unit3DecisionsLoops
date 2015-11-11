import java.util.Scanner;

public class Substring
{
    public static void printSubstrings()
    {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word1 = user_input.next();
        int i = 0;
        int x = 1;
        while(i < word1.length()){
        do{
            System.out.println(word1.substring(i,x-i));
            i++;
        }
        while(x+i < word1.length());
        {
            x++;
        }
    }
    }
    }

Solution:    
for (int length = 1; length <= word.length(); length++)
{
    for (int pos = 0; pos <= word.length() - length; pos++)
    {
        System.out.println(word.substring(pos, pos + length));
    }