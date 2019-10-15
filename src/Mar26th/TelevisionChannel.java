package Mar26th;

public class TelevisionChannel {
	private String name;
	private int number;
	private boolean isCableChannel;

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int aNumber) {
		number = aNumber;
	}

	public boolean isCableChannel() {
		return isCableChannel;
	}

	public void setCableChannel(boolean aIsCableChannel) {
		isCableChannel = aIsCableChannel;
	}

@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isCableChannel ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		return result;
	}

// we are checking the 3 values of the class if both are same or not,if all are equal than only we are returning true
// while writing its good practice to write hashcode also
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TelevisionChannel other = (TelevisionChannel) obj;
		if (isCableChannel != other.isCableChannel)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		TelevisionChannel t1 = new TelevisionChannel();
		t1.setName("A");
		t1.setCableChannel(true);
		t1.setNumber(1);
		
		TelevisionChannel t2 = new TelevisionChannel();
		t2.setName("A");
		t2.setCableChannel(true);
		t2.setNumber(1);
		
		TelevisionChannel t3 = new TelevisionChannel();
		t3.setName("C");
		t3.setCableChannel(true);
		t3.setNumber(2);
		System.out.println("T1 and T2 are equal : "+t1.equals(t2));
		System.out.println("T1 and T3 are equal : "+t1.equals(t3));
		
	}

}
