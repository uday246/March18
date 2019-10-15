import java.util.Scanner;

class Payroll{
	private int employeeId[]={56558845,4520125,7895122,8777541,8451277,1302850,7589489};
	private int hours[]=new int[7];
	private double payRate[]=new double[7];
	private double wages[]=new double[7];
	public int[] getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int[] aEmployeeId) {
		employeeId = aEmployeeId;
	}
	public int[] getHours() {
		return hours;
	}
	public void setHours(int[] aHours) {
		hours = aHours;
	}
	public double[] getPayRate() {
		return payRate;
	}
	public void setPayRate(double[] aPayRate) {
		payRate = aPayRate;
	}
	public double[] getWages() {
		return wages;
	}
	public void setWages(double[] aWages) {
		wages = aWages;
	}
	public double getGrossPayById(int id){
		for(int i=0;i<employeeId.length;i++){
			if(employeeId[i]==id)
				return wages[i];
		}
		return -1;
	}
}
public class TestPayroll {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	Payroll p = new Payroll();
	for(int i=0;i<p.getEmployeeId().length;i++){
		System.out.println("Enter hours and pay rate for employee : "+p.getEmployeeId()[i]);
		p.getHours()[i]=sc.nextInt();
		p.getPayRate()[i]=sc.nextDouble();
		p.getWages()[i]=p.getHours()[i]*p.getPayRate()[i];
	}
	System.out.println("Enter emp id to get wages");
	int id=sc.nextInt();
	System.out.println("Gross pay for employee : "+id+" is : "+p.getGrossPayById(id));
}
}
