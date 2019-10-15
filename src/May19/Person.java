package May19;

public class Person {
	private String name;
	private int age;

	Person() {
		name = "anonymous";
		age = 18;
	}

	Person(String s) {
		name = s;
		age = 18;
	}

	Person(String s, int a) {
		setName(s);
		setAge(a);
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		if (a >= 0 && a <= 100)
			age = a;
		else
			age = 18;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public static void main(String[] args) {
		System.out.println(a(5));
	}
	private static int a(int n) {
		if(n==0)
			return 1;
		else
			return 3 * a(n-1);
	}
}




class Doctor extends Person{
	private String specialty;
	Doctor(){
		setSpecialty("Family Doctor");
	}
	Doctor(String s){
		super(s);
		setSpecialty("Family Doctor");
	}
	Doctor(String s,String sp){
		super(s);
		setSpecialty(sp);
	}
	
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String aSpecialty) {
		specialty = aSpecialty;
	}
	@Override
	public String toString() {
		return "Doctor [specialty=" + specialty + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((specialty == null) ? 0 : specialty.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (specialty == null) {
			if (other.specialty != null)
				return false;
		} else if (!specialty.equals(other.specialty))
			return false;
		return true;
	}
	
	
}