import java.io.File;
import java.io.IOException;
public class FileExample
{
public static void main(String args[]) throws IOException
{
File f1=new File("e:/java Programs/name.txt");
f1.createNewFile();
System.out.println("Is exist: " +f1.exists());
System.out.println("File name : " +f1.getName());
System.out.println("Length of file : " +f1.length());
}
}