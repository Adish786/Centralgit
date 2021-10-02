import java.sql.*;
public class JDBCDemo
{
public static void main(String[] args)throws Exception
{
class.forName("oracle.jdbc.OracleDriver");
Connection con = DeriverManager.getConnection("")
Statement st = con.createStatement();
ResultSet rs=st.executeQuery("select*from gold_dimonds");
while(rs.next())
{
System.out.println(rs.getString("item")+"....."+rs.getInt(quantity));
}
con.close();


}



}