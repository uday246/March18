package mar18;

class Person {
	private String name;
	private String address;
	private int phone;

	public Person() {

	}

	public Person(String aName, String aAddress, int aPhone) {
		super();
		name = aName;
		address = aAddress;
		phone = aPhone;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String aAddress) {
		address = aAddress;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int aPhone) {
		phone = aPhone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

}

class Customer extends Person {
	private int customerNumber;
	private boolean mailingList;

	public Customer() {

	}

	public Customer(String aName, String aAddress, int aPhone, int aCustomerNumber, boolean aMailingList) {
		super(aName, aAddress, aPhone);
		customerNumber = aCustomerNumber;
		mailingList = aMailingList;
	}

	public Customer(int aCustomerNumber, boolean aMailingList) {
		super();
		customerNumber = aCustomerNumber;
		mailingList = aMailingList;
	}

	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", mailingList=" + mailingList + ", toString()="
				+ super.toString() + "]";
	}

}

public class TestCustomer {
	public static void main(String[] args) {
		Customer c = new Customer("Uday", "Hyd", 123, 14, true);
		System.out.println(c);
	}
}
