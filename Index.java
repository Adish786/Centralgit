import java.util.*;
class Index
{ 
public static void main(String args[])
{
 String str = "0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0";
    LinkedList<String> list = new LinkedList<String>();
      int firstIndex = list.indexOf(1);
         
        System.out.println(firstIndex);
    System.out.println(list.indexOf(str));
}
}