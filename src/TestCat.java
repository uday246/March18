import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
class Cat {
	private String color;
	private String breed;
	private double weight;
	private Date birthday;

	public Cat() {

	}

	public Cat(String aColor, String aBreed, double aWeight, Date aBirthday) {
		super();
		color = aColor;
		breed = aBreed;
		weight = aWeight;
		birthday = aBirthday;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String aColor) {
		color = aColor;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String aBreed) {
		breed = aBreed;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double aWeight) {
		weight = aWeight;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date aBirthday) {
		birthday = aBirthday;
	}

	public int getAgeInYears() {
		LocalDate today = LocalDate.now();                          //Today's date
		LocalDate b = LocalDate.of(birthday.getYear(), birthday.getMonth(), birthday.getDay());  //Birth date
		Period period = Period.between(b, today);
		return period.getYears();
	}
}

public class TestCat {
	public static void main(String[] args) {
		Date d = new Date(1994,3,23);
		Cat c = new Cat("Black","Local",20,d);
		System.out.println(c.getAgeInYears());
	}
}
