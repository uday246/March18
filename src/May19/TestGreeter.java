package May19;

class Greeter {
	private String name;

	public Greeter(String n) {
		name = n;
	}

	public String sayHello() {
		return "Hello, " + name;
	}

	public String sayGoodbye() {
		return "Good Bye, " + name;
	}

	public String refuseHelp() {
		return "I am sorry, " + name + ". I am afraid I can't do that.";
	}
}

public class TestGreeter {
	public static void main(String[] args) {
		Greeter g = new Greeter("Dave");
		System.out.println(g.sayHello());
		System.out.println(g.sayGoodbye());
		System.out.println(g.refuseHelp());
	}
}
