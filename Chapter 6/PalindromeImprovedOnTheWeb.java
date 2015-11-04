import java.util.Scanner;
public class PalindromeImprovedOnTheWeb
{
    public static void main(String[] args)
    {
        String word;
        int z;
        int y = 0;
        int i = 0;
        
        char letter;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        word = input.nextLine();
        
        word = word.replaceAll("\\s+", "");
        word = word.toLowerCase();
        
        z = word.length()-1;
        while (i <= z){
        
            if ((letter = word.charAt(i)) == (letter = word.charAt(z-i))){
                y += 1;
            }
            i += 1;
        }
        
        if (y == (z+1)){
            System.out.println("The word IS a palindrome");
        }
        else{
            System.out.println("The word is NOT a palindrome");
        }
    }
}