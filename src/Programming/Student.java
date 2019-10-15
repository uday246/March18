package Programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

    private int SID;
    private String FirstName, LastName, Street, City, State;
    private int Zip;
    private String EMail;
    private double GPA;

    public Student() {

    }

    public Student(int SID, String firstName, String lastName, String street, String city, String state, int zip, String EMail, double GPA) {
        this.SID = SID;
        FirstName = firstName;
        LastName = lastName;
        Street = street;
        City = city;
        State = state;
        Zip = zip;
        this.EMail = EMail;
        this.GPA = GPA;
    }

    public void display() {
        System.out.println("ID: " + SID);
        System.out.println("Name: " + FirstName + " " + LastName);
        System.out.println("Street: " + Street);
        System.out.println("City: " + City);
        System.out.println("State: " + State);
        System.out.println("Zip: " + Zip);
        System.out.println("Email: " + EMail);
        System.out.println("GPA: " + GPA);
    }

    public static void main(String[] args) {
        Student  s1 = new Student(4,"Frank", "Jones", "123 Main", "Atlanta", "GA", 30133, "fj@yahoo.com", 3.2);
        s1.display();
    }
public void insertDB(int SID, String FirstName, String LastName, String Street, String City, String State, int Zip, String EMail, double GPA){
	// fillin the object
	this.SID = SID;
	this.FirstName = FirstName;
	this.LastName = LastName ;
	this.Street = Street;
	this.City= City;
	this.State = State;
	this.Zip = Zip;
	this.EMail = EMail;
	this.GPA = GPA;
	// forming the query with the given values
	StringBuffer query = new StringBuffer("insert into student values(");
	query.append(SID);
	query.append(",");
	query.append("'"+FirstName+"'");
	query.append(",");
	query.append("'"+LastName+"'");
	query.append(",");
	query.append("'"+Street+"'");
	query.append(",");
	query.append("'"+City+"'");
	query.append(",");
	query.append("'"+State+"'");
	query.append(",");
	query.append(Zip);
	query.append(",");
	query.append("'"+EMail+"'");
	query.append(",");
	query.append(GPA+")");
	Connection con = null;
	try {
		// change the URL according to the connection
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","user","password");
	} catch (SQLException e) {
		System.out.println("Problem in Connecting Db");
		e.printStackTrace();
	}
	Statement st = null;
	try {
	st = con.createStatement();
	} catch (SQLException e) {
		System.out.println("Problem in creating statement");
		e.printStackTrace();
	}
	
	try {
		st.executeUpdate(new String(query));
	} catch (SQLException e) {
		System.out.println("Problem while inserting data");
		e.printStackTrace();
	}
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((City == null) ? 0 : City.hashCode());
	result = prime * result + ((EMail == null) ? 0 : EMail.hashCode());
	result = prime * result + ((FirstName == null) ? 0 : FirstName.hashCode());
	long temp;
	temp = Double.doubleToLongBits(GPA);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((LastName == null) ? 0 : LastName.hashCode());
	result = prime * result + SID;
	result = prime * result + ((State == null) ? 0 : State.hashCode());
	result = prime * result + ((Street == null) ? 0 : Street.hashCode());
	result = prime * result + Zip;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (City == null) {
		if (other.City != null)
			return false;
	} else if (!City.equals(other.City))
		return false;
	if (EMail == null) {
		if (other.EMail != null)
			return false;
	} else if (!EMail.equals(other.EMail))
		return false;
	if (FirstName == null) {
		if (other.FirstName != null)
			return false;
	} else if (!FirstName.equals(other.FirstName))
		return false;
	if (Double.doubleToLongBits(GPA) != Double.doubleToLongBits(other.GPA))
		return false;
	if (LastName == null) {
		if (other.LastName != null)
			return false;
	} else if (!LastName.equals(other.LastName))
		return false;
	if (SID != other.SID)
		return false;
	if (State == null) {
		if (other.State != null)
			return false;
	} else if (!State.equals(other.State))
		return false;
	if (Street == null) {
		if (other.Street != null)
			return false;
	} else if (!Street.equals(other.Street))
		return false;
	if (Zip != other.Zip)
		return false;
	return true;
}
}
