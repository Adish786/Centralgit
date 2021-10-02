class Base 
{
static int i =10; // 1
static
{
m1();
System.out.println("Base Static Class");
}
public static void main(String args[])
{
m1();
System.out.println("Base of Main Class");
}
public static void m1()
{
System.out.println(j);
}
static int j = 20;
}
class Derived extends Base
{
static int x=100;
static 
{
m2();
System.out.println("Derived File Static Based");
}
public static void main(String args[])
{
m2();
System.out.println("Derived Main");
}
public static void m2()
{
System.out.println(y);
}
static
{
System.out.println("Derived Second Static Block");
}
static int y=200;
}