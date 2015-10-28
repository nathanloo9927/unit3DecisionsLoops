public class NestedLoops
{
    public static void main( String[] args )
    {
        for (int i = 1; i < 3; i++)
        {
            for (int s = 1; s < 5; s++)
            {
                System.out.println(i + " " + s);
            }
        }
        System.out.println(" ");
        int a = 1;
        while (a < 3)
        {
            int b = 1;
            while (b < 5)
            {
                System.out.println(a + " " + b);
                b++;
            }
            a++;
        }
        System.out.println(" ");
        int x = 1;
        do
        {
            int y = 1;
            do
            {
                System.out.println(x + " " + y);
                y++;
            } while (y < 5);
            x++;
        } while (x < 3);
    }
}