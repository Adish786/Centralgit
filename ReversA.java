class ReversArray
{
public static void main(String args[])
{
int[] nums = {1,2,3,4};
ReverseArray reverseArray = new ReverseArray();
int[] reverseArray = reverseArray.reverseArray(nums);
for(int i=0;i<reverseArray.length;i++)
{
System.out.println(reverseArray[i]+ " ");
}
}
}