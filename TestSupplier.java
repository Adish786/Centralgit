import java.util.function.Supplier;
public class TestSupplier
{
public static void main(String args[])
{
Supplier<String> s=()->{String[] s1={"Sunny","Bunny","Chinny","Adish","Ansari","Alisher","Khurshed"};
int x =(int)(Math.random()*6+1);
return s1[x];
};
System.out.println(s.get());
System.out.println(s.get());
System.out.println(s.get());
System.out.println(s.get());
System.out.println(s.get());
System.out.println(s.get());
}
}