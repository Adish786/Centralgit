import static java.lang.System.out;
public class JavaImportStatic
{
public static void main(String args[])
{
DataObject.staticVar =30;
out.println(DataObject.staticVar); //Static import 
}
}
class DataObject
{
public static Integer staticVar; //static variable
}