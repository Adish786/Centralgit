import java.util.*;

class LinkedListDemo
{
public static void main(String args[])
{
ArrayList arrayList =new ArrayList();
LinkedList linkedList = new LinkedList();
long st=System.nanoTime();
for(int i=1;i<=100000; i++)
{
arrayList.add(i);
}
long end=System.nanoTime();
System.out.println("ArrayList= " +(end-st));

long st1=System.nanoTime();
for(int i=1;i<=100000; i++)
{
linkedList.add(i);
}
long end1=System.nanoTime();
System.out.println("LinkedList= " +(end1-st1));
/////////////////////////////////////////////////////////////////////
long st11=System.nanoTime();
for(int i=1;i<100000; i++)
{
arrayList.get(i);
}
long end11=System.nanoTime();
System.out.println("ArrayList= " +(end11-st11));

long st12=System.nanoTime();
for(int i=1;i<100000; i++)
{
linkedList.get(i);
}
long end12=System.nanoTime();
System.out.println("LinkedList= " +(end12-st12));
}
}