package Mat16th;

public class MthdSubStatistics {
	public static void main(String[] args) {
		int userNum1;
		int userNum2;
		int avgResult;
		userNum1 = getUserNum();
		userNum2 = getUserNum();
		avgResult = computeAvg(userNum1,userNum2);
		System.out.println("Avg: "+avgResult);

	}
	// methods calculating and returns avg of 2 numbers
	private static int computeAvg(int aUserNum1, int aUserNum2) {
		System.out.println("FIXME: Finish computeAvg()");
		return (aUserNum1+aUserNum2)/2;
	}

	private static int getUserNum() {
		System.out.println("FIXME: Finish getUserNum()");
		return -1;
	}
	
}
