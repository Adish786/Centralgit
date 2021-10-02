//import java.util.*;

class A extends Thread
{
public void run()
{
for(int i=0;i<=10;i++)
System.out.println("i="+i+"Thread A");
}
}

class B extends Thread
{
public void run()
{
for(int i=0;i<=10;i++)
System.out.println("i="+i+"Thread B");
}
}
public class ThreadDemo2
{
public static void main(String args[])
{
A o1=new A();
B o2=new B();
o1.start();
o2.start();
}
} 