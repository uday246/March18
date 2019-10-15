package May19;

public class Lab8Interfaces {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		ToDoItem[] arr = new ToDoItem[5];
		ToDoItem toDo1 = new ToDoItem("Hospital Project");
		toDo1.setPriority(2);
		ToDoItem toDo2 = new ToDoItem("Meet Pat for lunch");
		toDo2.setPriority(Priority.LOW);
		ToDoItem toDo3 = new ToDoItem("Attend CS1 class");
		toDo3.setPriority(Priority.TOP);
		ToDoItem toDo4 = new ToDoItem("Finish English Paper");
		toDo4.setPriority(Priority.MEDIUM);
		ToDoItem toDo5 = new ToDoItem("Play Games");
		toDo4.setPriority(Priority.TOP);

		arr[0] = toDo1;
		arr[1] = toDo2;
		arr[2] = toDo3;
		arr[3] = toDo4;
		arr[4] = toDo5;
		for (ToDoItem t : arr)
			System.out.println(t);
	}

}

// Priority

/**
 * Interface Priority.... 1 top priority 2 medium priority 3 least priority
 * 
 * @author prof aw
 */
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

// ToDoItem

class ToDoItem implements Priority {

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

}
