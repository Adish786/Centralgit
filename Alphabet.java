import java.util.*;
public class Alphabet {
    public static void main(String[] args) {
        //char c = 'A';
	System.out.println("Enter a Word");
        Scanner sc = new Scanner(System.in);
	char c = sc.nextInt(char)	
        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";
        
        System.out.println(output);
    }
}