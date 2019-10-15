
import javax.swing.*;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class TwoDimArray

{

private double numbers[][];

public TwoDimArray()

{

loadArray();

}

public void loadArray()

{

/*

//loadArray() method loads the users defined filename

//@return returns the file's contents

*/

String fileName = "";

try

{

fileName = JOptionPane.showInputDialog("Enter full file path name:");

}

catch(Exception e)

{

JOptionPane.showMessageDialog(null, "File cannot be open" + fileName + "to read");

return;

}

try

{

Scanner in = new Scanner(new File(fileName));

int row, col;

row = in.nextInt();

col = in.nextInt();

numbers = new double[row][col];

for(int i = 0; i < row;i++)

{

for (int j = 0;j < col; ++j)

{

numbers[i][j] = in.nextDouble();

}

}

in.close();

}

catch(FileNotFoundException e)

{

JOptionPane.showMessageDialog(null, "file cannot be opened" + fileName +"to read");

}

}

public double displayMaxValue()

{

	double high = Integer.MIN_VALUE;

for(int i = 0;i < numbers.length; i++)

{

for(int j = 0;j < numbers[0].length; ++j)

{

if (numbers[i][j] > high)

{

high = numbers[i][j];

}

}

}

return high;

}

public double displayMinValue()

{

	double low = Integer.MAX_VALUE;

for(int i = 0;i < numbers.length; i++)

{

for(int j = 0;j < numbers[0].length; ++j)

{

if(numbers[i][j] < low)

{

low = numbers[i][j];

}

}

}

return low;

}

public static int displayTotal(double[][] array)

{

int total = 0;

for(int row = 0;row < array.length;row++)

{

for(int col = 0;col < array[row].length;col++)

{

total += array[row][col];

}

}

return total;

}

public double displayAverage()

{

return displayTotal(numbers) / grabElementCounter(numbers);

}

public static int grabElementCounter(double[][] array)

{

int count = 0;

for(int row = 0;row < array.length; row++)

{

count += array[row].length;

}

return count;

}

public int displayRowTotal(int row)

{

int total = 0;

for(int col = 0; col < numbers[row].length; col++)

{

total += numbers[row][col];

}

return total;

}

public double displayColumnTotal(int col)

{

	double total = 0;

for(int row = 0;row < numbers.length; row++)

{

total += numbers[row][col];

}

return total;

}

public double getHighestValue(int row)

{

	double high = numbers[row][0];

for (int col = 1; col < numbers[row].length; col++)

{

if(numbers[row][col] > high)

{

high = numbers[row][col];

}

}

return high;

}

public double getLowestValue(int row)

{

double low = numbers[row][0];

for (int col = 1; col < numbers[row].length; col++)

{

if(numbers[row][col] < low)

{

low = numbers[row][col];

}

}

return low;

}



public static void main(String[] args)

{

TwoDimArray twoDimArray = new TwoDimArray();

System.out.println("Average: "+twoDimArray.displayAverage());

System.out.println("Min value: "+twoDimArray.displayMinValue());

System.out.println("Max value :"+twoDimArray.displayMaxValue());

System.out.println("First Row Total: "+twoDimArray.displayRowTotal(0));

System.out.println("First Column Total: "+twoDimArray.displayColumnTotal(0));

System.out.println("The lowest value in the first row is: "+twoDimArray.getLowestValue(0));

System.out.println("The highest value in the first row is: "+twoDimArray.getHighestValue(0));

} //end main function

} 