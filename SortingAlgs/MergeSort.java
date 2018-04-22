/** Merge sort is an efficient, general-purpose, comparison-based sorting
algorithm. It uses a divide and conquer approach.

Two basic concepts:
1. Divide the unsorted list into n sublists, each containing 1 element
(a list of 1 element is considered sorted).

2. Repeatedly merge sublists to produce new sorted sublists until there is only
1 sublist remaining. This will be the sorted list.

In terms of moves, merge sort's worst case, average case and typical best
case complexity is O(n log n).
**/

public class MergeSort {

    private int[] array;
    private int[] tempMergArr;
    private int length;



    public void sort(int input[]) {
        this.array = input;
        this.length = input.length;
        this.tempMergArr = new int[length];
        // taking indices of the first and last element
        mergeSort(0, length - 1);
    }

    private void mergeSort(int lowerIndex, int higherIndex) {

        // checking if it is possible to divide the array
        if (lowerIndex < higherIndex) {

            // dividing a given array into two parts
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

            // Recursive call (keeping dividing) to sort the left side of the array
            mergeSort(lowerIndex, middle);

            // Recursive call (keeping dividing) to sort the right side of the array
            mergeSort(middle + 1, higherIndex);

            // Merging both sides after each recursive call
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    // merging sorted parts of the given array
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex) {

            // comparison of two integers from the array and swapping if one
            // is bigger than the other
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }

    public static void main(String a[]){

        // initialising an array to be sorted
        int[] inputArr = { 3, 5, 9, 1, 4, 8, 7, 2, 6};
        MergeSort ms = new MergeSort();

        ms.sort(inputArr);

        // printing the resulting sorted array
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
