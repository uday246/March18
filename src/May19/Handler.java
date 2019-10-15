package May19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Handler {

   public static void main(String args[]) {

   try {

   Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

   String username = "root";

   String password = "";

   Connection con = DriverManager.getConnection("jdbc:derby:sampleDB;create=true");

   Statement stmt = con.createStatement();

   long id = System.currentTimeMillis();

   String firstName = "Rita";

   String lastName = "Red";

   String q1 = "insert into person values('" + id + "', '" + firstName + "', '" + lastName + "')";

   long id1 = System.currentTimeMillis();

   String firstName1 = "Oscar";

   String lastName1 = "Orange";

   String q2 = "insert into person values('" + id1 + "', '" + firstName1 + "', '" + lastName1 + "')";

   long id2 = System.currentTimeMillis();

   String firstName2 = "Yet ";

   String lastName2 = "";

   String q3 = "insert into person values('" + id2 + "', '" + firstName2 + "', '" + lastName2 + "')";

   stmt.execute(q1);

   stmt.execute(q2);

   stmt.execute(q3);

   String newfirstName = "Sita";

   String q4 = "UPDATE person set FIRST_NAME = '" + newfirstName + "' WHERE FIRST_NAME = '" + firstName + "'";

   stmt.execute(q4);

   String q5 = "Delete from person WHERE FIRST_NAME = '" + newfirstName + "'";

   stmt.execute(q5);

   ResultSet rs = stmt.executeQuery("select * from person");

   System.out.println("Id\t\t\tFirst_Name\t\tLast_Name");

   while (rs.next())

   System.out.format("\n%s %15s %25s", rs.getLong(1), rs.getString(2), rs.getString(3));

   System.out.println();

   con.close();

   } catch (Exception e) {

   System.out.println(e);

   }

   }

}