package May19;


public class Homework4{
	// compute function is forming the bubble sort on the array
	// and sorting in ascending order
        public static int[] compute(int[] numbers){ 
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-i-1; j++) 
            	// comparing the 2 adjacent elments and swapping which ever is lesser
            	
                if (numbers[j] > numbers[j+1]){  
                    int temp = numbers[j]; 
                    numbers[j] = numbers[j+1]; 
                    numbers[j+1] = temp; 
                } 
            System.out.println();
        }
        return numbers;
    }
    public static void main(String[] args){
        int[] numbers = {4,2,6,8,3};
        System.out.println();
        numbers = compute(numbers);
        for(int i = 0; i < numbers.length; i++)
                System.out.println(numbers[i] + " ");
    }
}