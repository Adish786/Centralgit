import java.util.*;
class Demo 
		{
		    Scanner scan;
		    int num;
		     void getVal()
		      {
		        System.out.println("HexaDecimal to Decimal");
		        scan = new Scanner(System.in);
		        System.out.println("Enter the number :");
		        num = Integer.parseInt(scan.nextLine(), 16);
		      }
		    void convert()
		     {
		        String decimal = Integer.toString(num);
		        System.out.println("Decimal Value is : " + decimal);
		     }
		}
		class DemoInt
		{
		       public static void main(String args[])
		         {
			Demo obj = new Demo();
			obj.getVal();
			obj.convert();
		         }
		}
