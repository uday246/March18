
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class City {
	private String name;
	private int population;

	public City(String aName, int aPopulation) {
		super();
		name = aName;
		population = aPopulation;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int aPopulation) {
		population = aPopulation;
	}

}

public class CityDBTesting {
	
	public static Statement getStatement() {
		Connection dbConnection = null;

		try {
			// change the connection url accordinly
			dbConnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "uesrid", "password");
		} catch (Exception e) {
			System.out.println("Problem in Creating Connection ");
			return null;
		}
		Statement statement = null;
		try {
			// creating statment
			statement = dbConnection.createStatement();
		} catch (Exception e) {
			System.out.println("Problem in Creating Statment");
			return null;
		}
		return statement;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		boolean flag = true;
		List<City> list = null;
		while (flag) {
			System.out.println("1 Sort the list of cities by population, in ascending order");
			System.out.println("2 Sort the list of cities by population, in descending order");

			System.out.println("3 Sort the list of cities by name");

			System.out.println("4 Get the total population of all the cities");

			System.out.println("5 Get the average population of all the cities");

			System.out.println("6 Get the highest population");

			System.out.println("7 Get the lowest population");
			System.out.println("8 Quit");

			ch = sc.nextInt();
			switch (ch) {
			case 1:
				list = getTheCitiesByAscendingOrder();
				System.out.println(list);
				break;
			case 2:
				list = getTheCitiesByDescendingOrder();
				System.out.println(list);
				break;
			case 3:
				list = getTheCitiesSortByName();
				System.out.println(list);
				break;
			case 4:
				int total = getToalPopulation();
				System.out.println(total);
				break;
			case 5:
				double avg = getAvgPopulation();
				System.out.println(avg);
				break;
			case 6:
				int high = getHighestPopulation();
				System.out.println(high);
				break;

			case 7:
				int low = getLowestPopulation();
				System.out.println(low);
				break;
			case 8:
				flag = false;
				break;

			}
			sc.close();
		}
	}

	private static int getLowestPopulation() throws Exception {
		Statement st = getStatement();
		 
        ResultSet rs = null;
			rs = st.executeQuery("  SELECT MIN(POPULATION) from CITY ");
			int res=0;
        while (rs.next()) {
            res= rs.getInt(1);
 
        }
		return res;
	}

	private static int getHighestPopulation() throws Exception  {
		 Statement st = getStatement();
		 
        ResultSet rs = null;
			rs = st.executeQuery("  SELECT MAX(POPULATION) from CITY ");
			int res=0;
        while (rs.next()) {
            res= rs.getInt(1);
 
        }
		return res;
	}

	private static double getAvgPopulation() throws Exception  {
		Statement st = getStatement();
		 
        ResultSet rs = null;
			rs = st.executeQuery("  SELECT AVG(POPULATION) from CITY ");
			double res=0;
        while (rs.next()) {
            res= rs.getDouble(1);
 
        }
		return res;
	}

	private static int getToalPopulation() throws Exception {
		Statement st = getStatement();
		 
        ResultSet rs = null;
			rs = st.executeQuery("  SELECT SUM(POPULATION) from CITY ");
			int res=0;
        while (rs.next()) {
            res= rs.getInt(1);
 
        }
		return res;
	}

	private static List<City> getTheCitiesSortByName() throws Exception {
		Statement st = getStatement();
		 List<City> list = new ArrayList<City>();
        ResultSet rs = null;
			rs = st.executeQuery("  SELECT * from CITY order by NAME");
        while (rs.next()) {
        	list.add(new City(rs.getString(1),rs.getInt(2)));
        }
		
		return list;
	}

	private static List<City> getTheCitiesByDescendingOrder() throws Exception {
		Statement st = getStatement();
		 List<City> list = new ArrayList<City>();
       ResultSet rs = null;
			rs = st.executeQuery("  SELECT * from CITY order by POPULATION DESC");
       while (rs.next()) {
       	list.add(new City(rs.getString(1),rs.getInt(2)));
       }
		
		return list;
	}

	private static List<City> getTheCitiesByAscendingOrder() throws Exception{

		Statement st = getStatement();
		 List<City> list = new ArrayList<City>();
      ResultSet rs = null;
			rs = st.executeQuery("  SELECT * from CITY order by POPULATION");
      while (rs.next()) {
      	list.add(new City(rs.getString(1),rs.getInt(2)));
      }
		
		return list;
	}
}
