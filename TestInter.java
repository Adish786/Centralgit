interface Interf
{
public int squareIt(int n);
}
class TestInter 
{
public static void main(String args[])
{
Interf i = n -> n*n;
System.out.println(i.squareIt(5));
}
}