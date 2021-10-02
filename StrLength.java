//find lenght of String withouth using java string lenghth() method

import java.util.Scanner;

class StrLength
{
public static void main(String args[])
{

System.out.println("Enter the String ");
Scanner sc = new Scanner(System.in);
String s=sc.nextLine();
int i=0;
for(char c:s.toCharArray())
{
i++;
}
System.out.println("The Length of String is " +i);
}
}