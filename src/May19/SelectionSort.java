package May19;
/*Selection sort works by taking the small element from the array and moving to the beginign of the array

5,4,3,2,1
find small [0-4] and move to beginning so here small is 1 so swap it with 5
1,4,3,2,5

find small [1-4] and move to beginning so here small is 2 so swap it with 4
1,2,3,4,5

find small [2-4] and move to beginning so here small is 3 so swap it with 3
1,2,3,4,5


find small [3-4] and move to beginning so here small is 4 so swap it with 4
1,2,3,4,5



Program:


*/
public class SelectionSort {
    /* Selection Sort function */
    public static void sort(int arr[]){
        int N = arr.length;
        int i, j, pos, temp;
        for (i = 0; i < N - 1; i++) {
            pos = i;
            for (j = i + 1; j < N; j++) {
                if (arr[j] < arr[pos]) {
                    pos = j;
                }
            }
            /* Swap arr[i] and arr[pos] */
            temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
    }

    /* Main method */
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        sort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

}