class Student {
}

class ResidentStudent extends Student {

	public void setPremiumRate(double pr) {
	}

}
class NonResidentStudent extends Student {

	public void setDiscountRate(double dr) {
	}

}
public class TestInstanceOf {
	public static void main(String[] args) {
		Student s1 = new Student();

		Student s2 = new ResidentStudent();

		Student s3 = new NonResidentStudent();
		System.out.println(s1);
		System.out.println(s2);
		if (s3 instanceof ResidentStudent)
			((ResidentStudent) s3).setPremiumRate(1.25);

	}
}
