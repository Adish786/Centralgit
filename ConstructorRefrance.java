class Sample
{
Sample()
{
System.out.println("Sample class Constructor Execution...");
}
}
interface Interf
{
public Sample get();
}
class ConstructorRefrance
{
public static void main(String args[])
{
Interf i = Sample::new;
Sample sq = i.get();
}
}