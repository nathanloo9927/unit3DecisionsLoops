import java.util.*;
public class Substrings
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = in.next();
        
        for (int length = 1; length <= word.length(); length++)
        {
            for (int pos = 0; pos <= word.length() - length; pos++)
            {
                System.out.println(word.substring(pos, pos + length));
            }
        }
    }
}