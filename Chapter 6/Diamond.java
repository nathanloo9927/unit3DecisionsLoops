import java.util.Scanner;
public class Diamond
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length of a diamond: ");
        int side = in.nextInt();
        int rows = side*2-1;
        int extra = 0;
        
        for (int a = 1; a <= side; a++)
        {
            //System.out.println("*" * a + extra);
            extra++;
        }
        
    }
}