package Mar26th;

class TestFunctions {
	double sphereArea(double radius){
		return (4 * 3.14 * (radius*radius));
	}
	double sphereVolume(double radius){

		return (4/3)*3.14*radius*radius*radius;
	}

	void busSong(String msg){
		if(msg.equals("wheels")){
			System.out.println("The wheels on the bus go round and round, round and round, round and round. The wheels on the bus go round and round, all through the town");
		}
		if(msg.equals("wipers")){
			System.out.println("The wipers on the bus go Swish, swish, swish; Swish, swish, swish; Swish, swish, swish. The wipers on the bus go Swish, swish, swish, all through the town");
		}
		if(msg.equals("horn")){
			System.out.println("The horn on the bus goes Beep, beep, beep; Beep, beep, beep; Beep, beep, beep. The horn on the bus goes Beep, beep, beep, all through the town");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Area : "+new TestFunctions().sphereArea(5));
		System.out.println("Volume: "+new TestFunctions().sphereVolume(5));
		new TestFunctions().busSong("horn");
		
	}
}

