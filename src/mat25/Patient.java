package mat25;

public class Patient {
	private String id;
	private int age;
	private BloodData bloodData;
	public Patient(){
		id="0";
		age=0;
		bloodData=new BloodData("O", "+");
	}
	
	public Patient(String aId, int aAge, BloodData aBloodData) {
		super();
		id = aId;
		age = aAge;
		bloodData = aBloodData;
	}

	public String getId() {
		return id;
	}
	public void setId(String aId) {
		id = aId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int aAge) {
		age = aAge;
	}
	public BloodData getBloodData() {
		return bloodData;
	}
	public void setBloodData(BloodData aBloodData) {
		bloodData = aBloodData;
	}
	
}
class BloodData{
	private String bloodType;
	private String rhFactor;
	public BloodData(String aBloodType, String aRhFactor) {
		super();
		bloodType = aBloodType;
		rhFactor = aRhFactor;
	}
	
}