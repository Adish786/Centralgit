class DataObject
{
public static Integer staticVar;
public Integer nonStaticVar;
}
public class javaStatic
{
public static void main(String args[])
{
DataObject objOne = new DataObject();
objOne.staticVar=10;
objOne.nonStaticVar =20;
DataObject objTwo = new DataObject();
System.out.println(objTwo.staticVar);  //10
System.out.println(objTwo.nonStaticVar); // null
DataObject.staticVar = 30; //Direct Access
System.out.println(objOne.staticVar); //30
System.out.println(objOne.staticVar); //30
}
}