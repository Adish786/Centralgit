abstract class Base
{
Base()
{
System.out.println("Base Constructor called");
}
abstract void fun();
}
class Derived extends Base 
{
Derived()
{
System.out.println("Derived Contructor called");
}
void fun()
{
System.out.println("Derived fun() called");
}
}
class Main
{
public static void main(String args[])
{
Derived d = new Derived();
}
}

















