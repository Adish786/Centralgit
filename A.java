class A
{
public static void main(string args[])
{
public void ma()
{
System.out.println("I am from A");
}
class B extends A
{
public void ma()
{
System.out.println(" I am from B");
}
A obj = new A();
obj.ma();
B obj1 = new B();
obj1.ma();
A obj2 = new B();
obj2.ma();
B obj3 = new A();
obj3.ma();
}

}
}







