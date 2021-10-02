import java.time.*;
import java.util.*;

class LeapYear
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Year Number");
int n = sc.nextInt();
Year y = Year.of(n);
if(y.isLeap())
{
System.out.printf("% d Year is Leap Year " , n);
}
else
{
System.out.printf("% d Year is Not Leap Year " , n);
}
}
}