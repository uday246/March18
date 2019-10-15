package Mar27th;

public class Mult
{
        public static void main(String [] args)
        {       // CHANGE NOTHING IN MAIN
                System.out.println(  mult( Integer.parseInt(args[0]), Integer.parseInt(args[1]) )  );
                
        }
        static int mult( int b, int a )
        {
        	
        	 if (a < b)
                 return mult(a, b);
             // repeat a times and sum b
             else if (b != 0)
                 return (a + mult(a, b - 1));
        	 
             else
                 return 0;
        }
}
