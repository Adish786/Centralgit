import java.util.Arrays;
public class ArraySwap
{
public static void main(String args[])
{
int[] arr = {20,30,40,10,50,90,};
System.out.println("Orignal Number is :" +Arrays.toString(arr));
int x = arr[3];
arr[3] = arr[arr.length-1];
arr[arr.length-1] = x;
System.out.println("New Array After Swaping :" +Arrays.toString(arr));




}




}