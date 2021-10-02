import java.util.*;
class VectorDemo
{
public static void main(String ss[])
{
Vector v=new Vector();
System.out.println(v.capacity());
System.out.println(v.size());
v.add(10);
v.add(10);
v.add(10);
v.addElement(10.8);
v.addElement(10.8);
Vector v1 =new Vector(3);
System.out.println(v1.capacity());
System.out.println(v1.size());

v.add(10);

v.add(10);
v.add(10);
v.add(10);

}
}