import java.io.*;
//import java.IOException;
import java.util.*;
public class Binary 
{
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
   static void binaryToDecimal(int n)
    {
	   String binaryString="1010";  
	   int decimal=Integer.parseInt(binaryString,2);  
	   System.out.println(decimal);
	   
     }
	public static void main (String[] args) 
	 { 
		// This code are converted the Decimal to Binary Number 
			System.out.println("Enter any Number");	
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
				 decToBinary(n);
				 // end of the code 
				 // this code are converted the Decimal to Hexadecimal Number 
				System.out.println();
		        String hexString = Integer.toHexString(n);
		        System.out.println("decimal to hexadecimal: " + hexString);
		        System.out.println("Enter a Negitev Integer Number");
		        Scanner cs=new Scanner(System.in);
		        int bin=cs.nextInt();
		    System.out.println("Converting integer "+bin+" to Hex Number: "+Integer.toHexString(bin));
		    // End of the Code 
		 // this code are converted HexaDecimal to Decimal Number
		    Scanner scanner = new Scanner(System.in);
		    int num;
		    System.out.println("HexaDecimal to Decimal");
	       Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the number :");
	        num = Integer.parseInt(scan.nextLine(),16);
	        String decimal = Integer.toString(num);
	        System.out.println("Decimal Value is : " + decimal);
	        Binary b=new Binary();
	        // end of the code 
	        
	        
		    
		/*	System.out.print("Enter any hexadecimal number: ");
			String hexnum = scanner.nextLine();
			int num = Integer.parseInt(hexnum,-0|16);
		System.out.println(hexnum);
			System.out.println("Decimal equivalent of given hex number: "+num);
		       */
		       /* for(int i=0;i<=127;i++)
		        {
		        	char ch = (char) i;
		        	System.out.println(i + "= " + ch);
		        }
		        */
               
			} 
	}


