/** Bubble Sort - simple sorting algorithm that repeatedly steps through the
list to be sorted, compares each pair of adjacent items and swaps them if they
are in the wrong order. Has a worst-case and average complexity of О(n^2).
Therefore it is not the most practical out of all the sorting algotirhm.*/


public class BubbleSort {

  public static void bubbleSort(int[] array){

    int n = array.length;
    boolean swapped = true;

    // iteratig over each number until it is sorted, then it acts as an end point
    for (int i = n-1;i>0 && swapped;i--){
      swapped = false;

      // going through each number before the end point and comparing it to the
      // right neighbour, if the neighbour is smaller, the number is compared to
      // the next right neighbour "bubbling" through until the end point if
      // it is the largest.
      for (int j=0;j<i;j++){

        if (array[j] > array[j+1]){
          swap(j,j+1,array);
          swapped = true;
          }
        }
      }
      // after every element is in the right place, printing the entire array
      printSorted(array);
    }

  // swapping method
  public static void swap(int i, int j, int[] array){
    int temp;
    temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  // pretty printing the result
  public static void printSorted(int[] input){

    for (int i = 0; i < input.length; i++){

      // adding a new line character after the last sorted number
      if (i == input.length -1){
        System.out.println(input[i] + "\n");
      }

      else {
      System.out.print(input[i] + ", ");
      }

    }
  }

  // calling bubble sort on the unsorted array
  public static void main(String[] args) {
    int[] input = { 3, 5, 9, 1, 4, 8, 7, 2, 6};
    bubbleSort(input);
  }

}
