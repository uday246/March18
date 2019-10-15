package Mat16th;

public class MersennePrime
{
  public static boolean isPrime(int N)
  {
    for (int i = 2;i<=Math.sqrt(N);i++)
    {
      if (N%i == 0)
        return false;
    }
    return true;
  }
  
  public static void main (String[] args)
  {
   System.out.println("K" +"\t"+ "2^K-1");    
    for (int i =2;i<=42;i++)
    {
      if (isPrime(i) && isPrime((int) (Math.pow(2, i)-1)))
      {
          System.out.println( "K = "+i+" : "+(int) (Math.pow(2, i)-1));
      }
    }
  }
}

