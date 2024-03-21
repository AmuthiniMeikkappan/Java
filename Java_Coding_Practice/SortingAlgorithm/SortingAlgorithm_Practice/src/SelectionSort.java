import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,7,5,9};
        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(arr));

        int[] res = selecSort(arr);
        System.out.println("Arrays after sorting");
        System.out.println(Arrays.toString(res));
    }
    public static int[] selecSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
        return arr;
    }
}
