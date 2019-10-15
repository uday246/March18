package May19;

public class quizzes {
	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 2, 2, 4, 4, 9, 10 };

		System.out.println(mostFrequent(array));

	}

	public static int mostFrequent(int[] array) {

		int maxValue = 0, maxCount = 0;

		for (int i = 0; i < array.length; ++i) {
			int count = 0;
			for (int j = 0; j < array.length; ++j) {
				if (array[j] == array[i])
					++count;
			}
			if (count > maxCount) {
				maxCount = count;
				maxValue = array[i];
			}
		}

		return maxValue;
	}
}