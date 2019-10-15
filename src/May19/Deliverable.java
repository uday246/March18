package May19;

public abstract class Deliverable {

protected int id;

protected int weight;

protected int timestamp;

protected String fromAddress;

protected String toAddress;

public int getId() { return id; }

public int getWeight() { return weight; }

public int getTimestamp() { return timestamp; }

public void setTimestamp(int timestamp) { this.timestamp = timestamp; }

public String getFromAddress() { return fromAddress; }

public String getToAddress() { return toAddress; }

public abstract String getZipCode();

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((fromAddress == null) ? 0 : fromAddress.hashCode());
	result = prime * result + id;
	result = prime * result + timestamp;
	result = prime * result + ((toAddress == null) ? 0 : toAddress.hashCode());
	result = prime * result + weight;
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
	Deliverable other = (Deliverable) obj;
	if (fromAddress == null) {
		if (other.fromAddress != null)
			return false;
	} else if (!fromAddress.equals(other.fromAddress))
		return false;
	if (id != other.id)
		return false;
	if (timestamp != other.timestamp)
		return false;
	if (toAddress == null) {
		if (other.toAddress != null)
			return false;
	} else if (!toAddress.equals(other.toAddress))
		return false;
	if (weight != other.weight)
		return false;
	return true;
}



}