/*
                     ALGORITHM
   1)traverse from left and compare adjacent elements and the higher one is placed at right side.
   2)In this way, the largest element is moved to the rightmost end at first.
   3)This process is then continued to find the second largest and place it and so on until the data is sorted.
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,3,5,9,2};

        System.out.println("Array before sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nArray After sorting");
        int[] res = bubbleSorting(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }
    static int[] bubbleSorting(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
