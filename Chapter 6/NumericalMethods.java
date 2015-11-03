import java.util.Scanner;
public class NumericalMethods
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many iterations do you want to run the fibbinachi sequence: ");
        int i = in.nextInt();
        int a = 1;
        int b = 1;
        int s = 3;
        System.out.println(a);
        System.out.println(b);
        if (i <= 0)
        {
            System.out.println("Loser");
        }
        while (s <= i)
        {
            int n = a + b;
            System.out.println(n);
            a = b;
            b = n;
            s++;
        }
    }
}