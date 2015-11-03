import java.util.*;
public class Diamond
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length of a diamond: ");
        int sideLength = in.nextInt();
        for (int row = 0; row < sideLength; row++)
        {
            for (int spaces = 0; spaces < sideLength - row - 1; spaces ++)
            {
                System.out.print(" ");
            }
            for (int stars = 0; stars < row * 2 + 1; stars++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int row = sideLength - 2; row >= 0; row--)
        {
            for (int spaces = 0; spaces < sideLength - row - 1; spaces ++)
            {
                System.out.print(" ");
            }
            for (int stars = 0; stars < row * 2 + 1; stars++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}