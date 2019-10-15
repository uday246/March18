package May19;

public class Test {
	  public static void main(String[] args) {
		// so here we are creating Apple with default so weight is 1
	    Apple a = new Apple();
		// so here it will print Apple 1
	    System.out.println(a);
	    System.out.println("---------------");
		// Here we are creating with weight as 7
	    GoldenDelicious g = new GoldenDelicious(7);
			// so here it will print GoldenDelicious 7
	    System.out.println(g);
	    System.out.println("---------------");
		// Here we are creating with weight as 8
	    Apple c = new GoldenDelicious(8);
			// so here it will print GoldenDelicious 8
		
	    System.out.println(c);
	  }
	}

	// Here we have apple class with 1 instance variable called weight
	class Apple {
	  double weight;
	  
	  // default constructor assigning weight as 1
	  public Apple() {
	    this(1);
	    System.out.println("Apple no-arg constructor");
	  }
	 // Param constructor which takes weight as argument and assigning it weight
	  public Apple(double weight) {
	    this.weight = weight;
	    System.out.println("Apple constructor with weight");
	  }
	  
	  @Override 
	  public String toString() {
	    return "Apple: " + weight;
	  }
	}

	// we have child class GoldenDelicious for the Apple
	class GoldenDelicious extends Apple {
	// Default constructor which is making weight as 5 by default
	  public GoldenDelicious() {
	    this(5);
	    System.out.println("GoldenDelicious non-arg constructor");
	  }
	   // Param constructor which takes weight as argument and assigning it weight using super
	  public GoldenDelicious(double weight) {
	    super(weight);
	    this.weight = weight;
	    System.out.println("GoldenDelicious constructor with weight");
	  }
	  
	  @Override 
	  public String toString() {
	    return "GoldenDelicious: " + weight;
	  }
	}