package Arrays;

import java.util.Arrays;

public class MergeThreeArrays {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4};
        int[] arr2 = {5,6,7,8};
        int[] arr3 = {9,10,11,12,13};

        int[] res = mergerArray(arr1,arr2,arr3);
        System.out.println(Arrays.toString(res));

    }
    static int[] mergerArray(int[] a1,int[] a2,int[] a3){
        int[] arr = new int[a1.length+a2.length+a3.length];
        int i=0,k=0;
        while(k<arr.length){
            if(i<a1.length){
                arr[k++] = a1[i];
            }
            if(i<a2.length){
                arr[k++] = a2[i];
            }
            if(i<a3.length){
                arr[k++] = a3[i];
            }
            i++;
        }
        return arr;
    }
}
