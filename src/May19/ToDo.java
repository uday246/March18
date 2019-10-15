package May19;
interface Priority {
	static final int TOP = 1;
	static final int MEDIUM = 2;
	static final int LOW = 3;

	/**
	 * Sets the object's priority level.
	 */
	public void setPriority(int value);

	/**
	 * Returns the object's priority level.
	 */
	public int getPriority();
}

class ToDoItem implements Priority, Comparable<ToDoItem> {

	String description;
	private int priority;

	/**
	 * Sets up this task with a medium priority level.
	 *
	 * @param taskName
	 */
	public ToDoItem(String taskName) {
		description = taskName;
		priority = MEDIUM;
	}

	/**
	 * Mutator: setDescription
	 *
	 */
	public void setDescription(String inDescription) {
		description = inDescription;
	}

	/**
	 * Returns this ToDo item's description
	 *
	 * @return
	 */
	String getDescription() {
		return description;
	}

	/**
	 * Sets this ToDo item priority level.
	 */
	public void setPriority(int value) {
		priority = value;
	}

	/**
	 * Returns this ToDo item priority level.
	 */
	public int getPriority() {
		return priority;
	}

	@Override
	public String toString() {
		return description + ": " + priority;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
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
		ToDoItem other = (ToDoItem) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}

	@Override
	public int compareTo(ToDoItem i) {
		return -1 * new Integer(this.getPriority()).compareTo(i.getPriority());
	}

}
