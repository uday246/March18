package Mar20th;

class Temparature {
	private double temp;
	private char scale;
	public Temparature(double aTemp, char aC) {
		super();
		temp = aTemp;
		scale = aC;
	}
	public Temparature() {
		super();
		temp = 0;
		scale = 'C';
	}
	
	public double getTemp() {
		return temp;
	}
	public void setTemp(double aTemp) {
		temp = aTemp;
	}
	public char getScale() {
		return scale;
	}
	public void setScale(char aScale) {
		scale = aScale;
	}
	public double getDegreesC(){
		return 5 * (temp-32)/9.0;
	}
	public double getDegreesF(){
		return 9.0 * (temp/5.0)+32;
	}
	public int equals(Temparature t){
		if(this.temp>t.temp)
			return -1;
		if(this.temp==t.temp)
			return 0;
	return 1;
	}
	public String toString(){
		temp+=0.05;
		String t = temp+"";
		t = t.substring(0, t.indexOf(".")+2);
		return t+" "+scale;
	}
}
public class TestTemparature{
	public static void main(String[] args) {
		Temparature t = new Temparature(32,'F');
		System.out.println(t.getDegreesC());
		System.out.println(t.getDegreesF());
		
	}
}