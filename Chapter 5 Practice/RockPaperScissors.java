import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Choose rock, scissors, or paper: ");
        String player1 = scan.next().toLowerCase();
        System.out.println("Player 2: Choose rock, scissors, or paper: ");
        String player 2 = scan.next().toLowerCase();
        
        int result = player1.compareTo(player2);
        
        if (player1.equals(player2))
        {
            System.out.println("It's a tie.");
        }
        
        else if (result == -1)
        {
            System.out.println("Player 2 wins.");
        }
        
        else if (result == -4)
        {
            System.out.println("Player 1 wins.");
        }
        
    }
}