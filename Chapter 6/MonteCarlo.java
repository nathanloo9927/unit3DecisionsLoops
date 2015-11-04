import java.util.Random;
public class MonteCarlo
{
    public static void main(String[] args)
    {
        final int TRIES = 10000;
        Random random = new Random();
        
        int hits = 0;
        for (int i = 1; i <= TRIES; i++)
        {
            double r = random.nextDouble();
            double x = -1 + 2 * r;
            r = random.nextDouble();
            double y = -1 + 2 * r;
            if (x * x + y * y <= 1)
            {
                hits++;
            }
        }
        double piEstimate = 4.0 * hits / TRIES;
        System.out.println("Estimate for pi: " + piEstimate);
    }
}