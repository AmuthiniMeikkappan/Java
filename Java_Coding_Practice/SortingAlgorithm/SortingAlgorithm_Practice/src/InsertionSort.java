import java.util.Arrays;
/*
                       ALGORITHM
      1)First we need to split the array into two as left side elements are sorted and right side as unsorted
      2)Here we are taking two loops one loop for unsorted side and another loop for sorted array
      3)We should take first element at unsorted side and compare with the sorted side of the array and insert that into the correct place
      4)To place that on the correct place we need to shift elements to the right
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,3,7,9};
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));
        int[] res =  insertionSort(arr);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(res));
    }
    public static int[] insertionSort(int[] arr){
        //take care of the unsorted side of the array
        for(int i=1;i<arr.length;i++){
            int j =i-1;
            int key = arr[i];
            //take care of the sorted side
            while(j>=0 && arr[j]>key){
                //shifting elements to right side
                arr[j+1] = arr[j];
                j--;
            }
            //placing the element
            arr[j+1] = key;
        }
        return arr;
    }
}
