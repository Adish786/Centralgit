class P
{
public static void m1(int... i)
{
System.out.println("Parent");
 }
}
class C extends P
{
public static void m1(int i)
{
System.out.println("Child");
}
}
class TestOverLod
{
public static void main(String args[])
{
P p=new P();
p.m1(10);
C c=new C();
c.m1(10);
P p1=new C();
p1.m1(10);
}
}