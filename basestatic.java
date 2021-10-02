class basestatic
{
static int i=10;
static
{
m1();
System.out.println(i); // Direct Read
}
public static void m1()
{
System.out.println(i); // Indirect Read
}

}