package bradsmr;
import java.util.Scanner;

public class main {
    
    public static String reverseString(String str) {
        String reverse = "";        
        for(int i=str.length()-1; i>=0; i--)
            reverse = reverse + str.charAt(i);
        
        return reverse;
    }
    
    public static void main(String[] args) {
        
        System.out.print("Enter a string to be reversed.\n> ");
        
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        
        System.out.println(reverseString(str));
    }
}
