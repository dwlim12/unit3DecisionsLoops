import java.util.Random;
import java.util.Scanner;

public class MontyHall
{
    public static void DoorPicker()
    {
        Random random_door = new Random();
        Scanner in = new Scanner(System.in);
        for(int i = 1; i <= 1000; i++)
        {
        int rdoor = (random_door.nextInt(3) + 1);
        int user_door = (random_door.nextInt(3) + 1);
        int next_door = (random_door.nextInt(3) + 1);
        while(user_door == rdoor)
        {
            user_door = (random_door.nextInt(3) + 1);
        }
        while(next_door == user_door || next_door == rdoor)
        {
            next_door = (random_door.nextInt(3) + 1);
        }
        int last_door = (random_door.nextInt(3) + 1);
        while(last_door == next_door || last_door == user_door)
        {
            last_door = (random_door.nextInt(3) + 1);
        }
        user_door = last_door;
        int win_count = 0;
        int lose_count = 0;
        if (user_door == rdoor)
        {
            win_count += 1;
        }
        else
        {
            lose_count += 1;
        }
    }
        int ratio = (win_count / lose_count) * 100;
        System.out.println(ratio + "%");
    }
}