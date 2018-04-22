/** Insertion sort sorts the final array one item at a time, it is a bit more
efficient than most other simple quadratic algorithms. It is good for lists that
are almost sorted already or for inserting new values into a sorted list. Sorted
and unsorted sections of the list are seperated by a pointer variable. The
complexity is the same as for bubble sort: О(n^2).
**/

class InsertionSort {


    void insertionSort(int array[]){

        int n = array.length;

        for (int i=1; i<n; i++){

            int pointer = array[i];
            int j = i-1;

            //Move elements of arr[0..i-1], that are greater than the pointer,
            // to one position ahead of their current position
            while (j>=0 && array[j] > pointer) {
                array[j+1] = array[j];
                j = j-1;
            }

            array[j+1] = pointer;
        }
    }

    // printing the sorted array
    static void printSorted(int array[]) {
        int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(array[i] + " ");

        System.out.println();
    }


    public static void main(String args[]) {
        // initilising an unsorted array
        int array[] = { 3, 5, 9, 1, 4, 8, 7, 2, 6};

        InsertionSort ob = new InsertionSort();
        ob.insertionSort(array);

        printSorted(array);
    }
}
