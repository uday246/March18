package May19;

public class HW2Prob2 {
    public static void main(String args[]) {
            int n=2000;
            long startTime = System.currentTimeMillis();
            
            long sum=0;
            // INSERT YOUR CODE HERE
            for (int i = 0; i < n; i++)
            	sum++;
                            
            long endTime = System.currentTimeMillis();
            System.out.println("It took " + (endTime - startTime) + " milliseconds, and the loop body was executed " + sum + " times.");
    }
}