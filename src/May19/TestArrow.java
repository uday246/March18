package May19;

class Arrow {
	private double velocity;
	private double angle;

	public Arrow() {
		velocity = 20;
		angle = 10;
	}

	public Arrow(double aVelocity, double aAngle) {
		super();
		velocity = aVelocity;
		angle = aAngle;
	}

	public double getVelocity() {
		return velocity;
	}

	public void setVelocity(double aVelocity) {
		velocity = aVelocity;
	}

	public double getAngle() {
		return angle;
	}

	/**
	 * @param aAngle
	 */
	public void setAngle(double aAngle) {
		angle = aAngle;
	}

	public double getRange() {
		return velocity * velocity * (Math.sin(2 * angle) / 9.8);
	}

	public double getHeight() {
		double s = Math.sin(angle) * Math.sin(angle);
		return velocity * velocity * (s) / (2 * 9.8);
	}
}

public class TestArrow {
	public static void main(String[] args) {
		Arrow redArrow = new Arrow(30, 25);
		System.out.println("Height: " + redArrow.getHeight());
	}
}
