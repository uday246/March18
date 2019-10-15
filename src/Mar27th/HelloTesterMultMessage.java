package Mar27th;

class HelloObjectMultMessage {
	public void morningWish() {
		System.out.println("Hello Good morning");
	}

	public void eveningWish() {
		System.out.println("Hello Good evening");
	}

}

public class HelloTesterMultMessage {
public static void main(String[] args) {
	HelloObjectMultMessage h = new  HelloObjectMultMessage();
	h.morningWish();
	h.eveningWish();
}
}
