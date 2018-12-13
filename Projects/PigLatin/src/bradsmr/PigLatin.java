package bradsmr;
import java.util.Scanner;

public class PigLatin {

    public static String toPigLatin(String str) {
        
        
        StringBuilder sb = new StringBuilder(str);
        CharSequence ch  = "-" + sb.charAt(0) + "ay";
        sb.deleteCharAt(0);
        sb.append(ch);
        return sb.toString();
    }
    
    public static void main(String[] args) {
        
        System.out.print("Enter a string: ");
        
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        
        System.out.println(toPigLatin(str));
    }

}
