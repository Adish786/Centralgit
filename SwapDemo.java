public class SwapDemo
{
public static void main(String args[])
{
int a =20;
int b =30;
	System.out.println("Before Swap : = " +a+ "  tb " +b);
	//Swap Number Using 3rd Variable
/*	int temp =a;
	a=b;
	b=temp;
	System.out.println("After Swap :" +a+  "  tb " +b);
					*/
//Swap Number without using 3rd Variable
a=a+b; //=50
b=a-b; //=20
a=a-b; // = 30
	System.out.println("After Swap : = " +a+  "  tb " +b);
}
}