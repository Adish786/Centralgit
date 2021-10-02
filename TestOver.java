class P
{
public void property()
{
System.out.println("Cash+Land+Gold");

}
public void marry()
{
System.out.println("Psddsfdfdf");
}
}
class C extends P
{
public void marry()
{
System.out.println("Pinkey Singh");
}
}
class TestOver
{
public static void main(String args[])
{
P p =new P();
p.marry(); // parent method calling
C c = new C(); //child mathod calling 
c.marry();
P p1 = new C();
p1.marry();  //child method calling
}

}








