import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector v = new Vector(10);
		v.addElement(1);
		v.addElement(20);
		System.out.println("Size : " + v.size());
		v.addElement(26);
		v.addElement(64);
		v.addElement(16);
		v.addElement(61);
		v.addElement(87);
		v.addElement(36);
		System.out.println("Size : " + v.size());
		System.out.println(v);
	}
}
