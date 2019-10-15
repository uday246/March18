package mat25;

public class ModifyArray {

/* Display array values */
public void displayValues(int [] arrayVals) {
int i;

for (i = 0; i < arrayVals.length; ++i) {
System.out.print(arrayVals[i] + " ");
}
System.out.println("");
}

/* Your solution goes here */
private void swapArrayEnds(int[] aSortedArray) {
	int a=aSortedArray[aSortedArray.length-1];
	aSortedArray[aSortedArray.length-1]=aSortedArray[0];
	aSortedArray[0]=a;
	
}
public static void main (String [] args) {
int numElem = 4;
int[] sortedArray = new int[numElem];
ModifyArray numInverter = new ModifyArray();

// Add values to the array
sortedArray[0] = 10;
sortedArray[1] = 20;
sortedArray[2] = 30;
sortedArray[3] = 40;

numInverter.swapArrayEnds(sortedArray);
numInverter.displayValues(sortedArray);
}


}
