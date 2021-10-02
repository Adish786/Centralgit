class parent
{
parent()
{
System.out.println( "parent Class");
} 
}
public class child extends parent
{
child()
{
System.out.println( "child Class");
}
public static void main(String args[])
{
child obj = new child();
}
}