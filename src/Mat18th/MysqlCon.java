package Mat18th;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class MysqlCon {
public static void main(String args[]) throws Exception {  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:2134/testDB","test","test1");  
//here testDB is database name, test is username and test1 is password  
Statement stmt=con.createStatement();  
// creating the table
stmt.execute("CREATE TABLE GradePoints (grade varchar(2) NOT NULL,Point decimal (10,2),PRIMARY KEY (grade))");  

char ch='A';
double point=1.0;
for(int i=1;i<=11;i++){
	if(ch>'F')
		ch='A';
	
	stmt.executeUpdate("Insert into GradePoints values ('"+ch+i+"',"+point+")");
	System.out.println("Insert into GradePoints values ('"+ch+i+"',"+point+")");
	ch++;
	point +=1.5;
	
}

}  
}