import java.util.Random;
public class DrunkardsWalk
{
    public static void main( String[] args )
    {
        Random random = new Random();
        System.out.println("The drunkard chooses a random direction of 4 choices. If it is 1, the");
        System.out.println("drunkard moves forward, 2, the drunkard moves left, 3, the drunkard");
        System.out.println("moves backward, 4, the drunkard moves right. Each move is 1 space");
        int x = 0;
        int y = 0;
        for (int i = 1; i <= 100; i++)
        {
            int choice = random.nextInt(4) + 1;
            if (choice == 1)
            {
                y++;
            }
            else if (choice == 2)
            {
                x--;
            }
            else if (choice == 3)
            {
                y--;
            }
            else if (choice == 4)
            {
                x++;
            }
        }
        System.out.println("The drunkard is located at (" + x + ", " + y + ") after 100 moves");
    }
}