class DataObject
{
  public Integer nonStaticVar;
    public static Integer staticVar;    //static variable
     
    public static Integer getStaticVar(){
        return staticVar;
    }
}
public class javaStaticMethod
{
 public static void main(String[] args) 
    {
        DataObject.staticVar = 30;  //Direct Access
         
        Integer value1 = DataObject.getStaticVar(); //access with class reference
 
        DataObject objOne = new DataObject();
        Integer value2 = objOne.getStaticVar();     //access with instance reference
         
        System.out.println(value1);
        System.out.println(value2);
    }
}