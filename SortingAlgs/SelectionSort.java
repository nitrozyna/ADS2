/**
Selection sort divides the input list into two parts: the sublist of items already
sorted and the sublist of items remaining to be sorted. The algorithm finds the
smallest element in the unsorted sublist, swapping it with the leftmost unsorted
element, and moving the sublist boundaries one element to the right. It has O(n2)
time complexity, making it inefficient on large lists, and generally performs
worse than the similar insertion sort.
**/


class SelectionSort {

    void selectionSort(int array[]) {
        int n = array.length;

        // moving boundary of unsorted subarray one by one 
        for (int i = 0; i < n-1; i++) {

            // Finding the minimum element in unsorted array
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[min])
                    min = j;
            }
            // Swapping the found minimum element with the first element
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    // Printing the sorted array
    void printSorted(int array[]){

        int n = array.length;

        for (int i=0; i<n; ++i)
            System.out.print(array[i]+" ");
        System.out.println();
    }


    public static void main(String args[]){

        SelectionSort ob = new SelectionSort();

        int array[] = { 3, 5, 9, 1, 4, 8, 7, 2, 6};

        ob.selectionSort(array);
        ob.printSorted(array);
    }
}
