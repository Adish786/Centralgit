import java.util.*;
public class Complement {
public static void main(String[] args) {
System.out.println("Enter any Number");	
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
decToBinary(n);
System.out.println();
String hexString = Integer.toHexString(n);
System.out.println("decimal to hexadecimal: " + hexString); 
Scanner sc=new Scanner(System.in);
System.out.println("Enter any numberr in Binary format:");
String bin = sc.nextLine(); 
OneAndTwosComplement(bin); 
} 
 static char flip(char c) 
{ return (c == '0') ? '1' : '0'; } 
static void OneAndTwosComplement(String bin) 
{ 
int n = bin.length(); 
int i; 
String ones = "", twos = ""; 
ones = twos = ""; 
for (i = 0; i < n; i++) 
{ ones += flip(bin.charAt(i)); } 
twos = ones; 
for (i = n - 1; i >= 0; i--) 
{ 
if (ones.charAt(i) == '1') 
{ twos = twos.substring(0, i) + '0' + twos.substring(i + 1); } 
else
{ twos = twos.substring(0, i) + '1' + twos.substring(i + 1); 
break; 
} 
} 
if (i == -1) 
{ 
twos = '1' + twos; 
} 
System.out.println("1's complement: " + ones);
System.out.println("2's complement: " + twos); 
static void decToBinary(int n) 
	{
	  int[] binaryNum = new int[1000];  
	  int i = 0; 
	   while (n > 0) 
	    { 
	      binaryNum[i] = n % 2; 
	      n = n / 2; 
	      i++; 
		} 
	  for (int j = i - 1; j >= 0; j--) 
	    System.out.print("" +binaryNum[j]); 
	 }
} 
}
