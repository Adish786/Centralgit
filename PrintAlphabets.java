import java.util.*;
public class PrintAlphabets 
{
	public static void main(String args[])
	{
		char ch;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Uppercase alphabets:");
		for(ch='A';ch<='Z';ch++)
			ch = sc.next().charAt(0);
			System.out.print(ch + " ");
		System.out.println(""); 
		System.out.println("Lowercase alphabets:");
		for(ch='a';ch<='z';ch++)
			ch = sc.next().charAt(0);
			System.out.print(ch + " ");		
	}
}