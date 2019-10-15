import java.util.Scanner;

//---------------------------------------------------------------

public class Examination2Part2

//---------------------------------------------------------------

{

   public static void main(String args[])

   {

      Scanner IN = new Scanner(System.in);

      System.out.print("Cause constructor error? ");

      while ( IN.hasNextBoolean() )

      {

         boolean option = IN.nextBoolean();

         try

         {

            Date date = new Date("date",3,5,(option ? -2019 : 2019),'.');

           

            date.Input();

            date.Output(); System.out.printf("%n");

         // explicit reference to @Override-d toString() method inherited from Object

            System.out.println(date.toString());

            date = null;

         }

         catch ( DateException exception )

         {

         // implicit reference to @Override-d toString() method inherited from Object

            System.out.println("\n" + exception.date + " " + exception.getMessage());

         }

         finally

         {

            System.out.print("\nCause constructor error? ");

         }

      }

}

}

//---------------------------------------------------------------

class DateException extends Exception

//---------------------------------------------------------------

{

   Student provides missing code to define instance variables (as needed)

      and to define the DateException class constructor. No other class

      methods are required!

}

//---------------------------------------------------------------

class Date extends Object

//---------------------------------------------------------------

{

   private String name;

   private int MM;

   private int DD;

   private int YYYY;

   private char separator;

   //----------------------------------------------------

   public Date(String name,char separator)

   //----------------------------------------------------

   {

      this.name = name;

      MM = 12; DD = 25; this.YYYY = 1;

      this.separator = separator;

   }

   //----------------------------------------------------

   public Date(String name,int MM,int DD,int YYYY,char separator) throws DateException

   //----------------------------------------------------

   {

      this.name = name;

      this.MM = MM; this.DD = DD; this.YYYY = YYYY;

      this.separator = separator;

      Student provides missing code to throw a DateException object when MM, DD, YYYY combination

         of values are *NOT* valid. Hint Use IsValid().

   }

   //----------------------------------------------------

   public void finalize()

   //----------------------------------------------------

   {

      System.out.print("finalize()-ing of date "); Output();

   }

   //-------------------------------------------------

   public void Input() throws DateException

   //-------------------------------------------------

   {

      Scanner IN = new Scanner(System.in);

      System.out.print(name + "   MM? ");   SetMM(IN.nextInt());

      System.out.print(name + "   DD? ");   SetDD(IN.nextInt());

      System.out.print(name + " YYYY? "); SetYYYY(IN.nextInt());

   }

   //----------------------------------------------------

   public void Output()

   //----------------------------------------------------

   {

      System.out.printf("%s = %2d%c%2d%c%4d",name,MM,separator,DD,separator,YYYY);

   }

   //-------------------------------------------------

   public void SetMM(int MM) throws DateException

   //-------------------------------------------------

   {

      Student provides missing code to throw a DateException object when MM

         value is *NOT* valid. Hint Use the private method IsValid().

   }

   //-------------------------------------------------

   public void SetDD(int DD) throws DateException

   //-------------------------------------------------

   {

      Student provides missing code to throw a DateException object when DD

         value is *NOT* valid. Hint Use the private method IsValid().

   }

   //-------------------------------------------------

   public void SetYYYY(int YYYY) throws DateException

   //-------------------------------------------------

   {

      Student provides missing code to throw a DateException object when YYYY

         value is *NOT* valid. Hint Use the private method IsValid().

   }

   //-------------------------------------------------

   public String GetName()

   //-------------------------------------------------

   {

      return( name );

   }

   //-------------------------------------------------

   public int GetMM()

   //-------------------------------------------------

   {

      return( MM );

   }

   //-------------------------------------------------

   public int GetDD()

   //-------------------------------------------------

   {

      return( DD );

   }

   //-------------------------------------------------

   public int GetYYYY()

   //-------------------------------------------------

   {

      return( YYYY );

   }

   //-------------------------------------------------

   public int GetSeparator()

   //-------------------------------------------------

   {

      return( separator );

   }

   //-------------------------------------------------

   @Override

   public String toString()

   //-------------------------------------------------

   {

      Student provides missing code to define toString() method that creates

         a String representation of the Date object referenced by this.

         *Hint* The method Output() formats a Date in a toString()-kinda way.

   }

   //-------------------------------------------------

   private boolean IsLeapYear(final int YYYY)

   //-------------------------------------------------

   {

      return( ((YYYY%4 == 0) && (YYYY%4 == 100)) || (YYYY%400 == 0) );

   }

   //-------------------------------------------------

   private boolean IsValid()

   //-------------------------------------------------

   {

   // 1 <= YYYY

   // 1 <= MM <= 12

   // 1 <= DD <= UB, where UB must be taken from the following table of UBs

   // MM 1 2   3   4   5   6   7   8   9 10 11 12

   // UB 31 2X 31 30 31 30 31 31 30 31 30 31

   //       2X = 29 when YYYY is a leap year; otherwise 2X = 28

      Student provides missing code to enforce the preceding validation rules.

   }

}

