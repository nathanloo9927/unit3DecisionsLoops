import java.util.Random;
public class MontyHall
{
    public static void main( String[] args )
    {
        Random random = new Random();
        Integer strategy1 = 0;
        Integer strategy2 = 0;
        Integer lost = 0;
        int i = 1;
        while (i <= 1000)
        {
            int car = random.nextInt(3) + 1;
            int guess = random.nextInt(3) + 1;
            int hint = random.nextInt(3) + 1;
            while (hint == guess || hint == car)
            {
                hint = random.nextInt(3) + 1;
            }
            int new_guess = random.nextInt(3) + 1;
            while (new_guess == hint)
            {
                new_guess = random.nextInt(3) + 1;
            }
            if (new_guess == car)
            {
                if (new_guess == guess)
                {
                    strategy2++;
                }
                else
                {
                    strategy1++;
                }
            }
            else
            {
                lost++;
            }
            i++;
        }
        String a = strategy1.toString();
        String b = strategy2.toString();
        String losses = lost.toString();
        System.out.println("Wins with changing the guess: " + a);
        System.out.println("Wins with sticking to the original guess: " + b);
        System.out.println("Losses: " + losses);
    }
}