import java.io.File;
import java.util.Scanner;

public class Project5

{

	public static void main(String[] args) throws Exception

	{

		final int ARRAY_MAX = 30;

		// "args" is the list of tokens you put after "java Project3" on command
		// line

		if (args.length == 0) // i.e If you did not type anything after "java
								// Project4" on command line

		{

			System.out.println("FATAL ERROR: Must type a filename on cmd line\n" +

					"Like this -> C:\\Users\\tim\\Desktop>java Project4 P4input.txt");

			System.exit(0); // ABORT program. Make user try again with a
							// filename this time.

		}

		Scanner infile = new Scanner(new File(args[0]));

		int[] array = new int[ARRAY_MAX];

		int count = 0;

		while (infile.hasNextInt())

			array[count++] = infile.nextInt(); // POST increment NOT pre. Do you
												// see why?

		System.out.println("array capacity: " + array.length + "\narray count: " + count);

		System.out.println(" 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18");

		printArray(array, count, "numbers from " + args[0] + ": "); // ECHO ALL
																	// (count)
																	// ELEMENTS
																	// ON ONE
																	// LINE

		insertNumberAtIndex(array, count, 17, 13); // add the number 17 to the
													// array at index [13]

		++count;

		printArray(array, count, "after insert of 17 at [13]: ");

		insertNumberAtIndex(array, count, 55, 6); // add the number 17 to the
													// array at index [13]

		++count;

		printArray(array, count, "after insert of 55 at [6]: ");

		removeNumberAtIndex(array, count, 9); // remove the number at [9]

		--count;

		printArray(array, count, "after removal at index [9]: ");

		removeNumberAtIndex(array, count, 3); // remove the number at [3]

		--count;

		printArray(array, count, "after removal at index [3]: ");

	} // END main

	// GIVEN AS IS: DO MOT MODIFY Or DELETE

private static void printArray( int[] a, int cnt, String caption )

{

System.out.print( caption );

for (int i=0 ; i<a.length;i++)

System.out.format( "%3d ", a[i] );

System.out.println();

}

	// #############################################################################################

	// YOU MUST WRITE THE DEFINITIONS OF THE METHODS BELOW

	// #############################################################################################

	// insertNumberAtIndex - adds a number to the array at specified slot #

	// opens up ahole for it by shifting everything at and above [atIndex] up
	// one slot

	private static void insertNumberAtIndex(int a[], int count, int newNumber, int atIndex)

	{

		for (int i = count; i > atIndex; --i)

			a[i] = a[i - 1];

		a[atIndex] = newNumber;

	}

	// removeNumberAtIndex - removes the number at [atIndex] by shifing elements
	// above it down one

	private static void removeNumberAtIndex(int arr[], int count, int atIndex)

	{

		removeAt(arr, count, 2);

		--count;

	}
// this is used to remove the element from the array at specific location, we will left shif the all elements from the specifi location
	private static void removeAt(int[] aArr, int aCount, int aI) {
		int i=aI;
			for(;i<aCount-1;i++)
				aArr[i] = aArr[i+1];
		aArr[i] = 0;
	}

} // END OF Project5