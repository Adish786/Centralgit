import java.util.Scanner;
public class Addition {
   public static void main(String[] args) {
	int count=0;
      Scanner s = new Scanner(System.in);
      System.out.print("Enter first number: ");
      int firstNumber = s.nextInt();
      System.out.print("Enter second number: ");
      int secondNumber = s.nextInt();
      int sum = firstNumber +1;
      System.out.println("The result of addition was " + sum);
	count++;
   }
}