package Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {3,5,7,9,13};
        int[] arr2 = {1,2,3,4,9,15,17,19};

        int[] res = mergeTwoArray(arr1,arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    static int[] mergeTwoArray(int[] a1,int[] a2){
        int[] arr = new int[a1.length+a2.length];
        int i=0,j=0,k=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]>a2[j]){
                arr[k++] = a2[j++];
            }
            else{
                arr[k++] = a1[i++];
            }
        }
        while(i<a1.length){
            arr[k++] = a1[i++];
        }
        while(j<a2.length){
            arr[k++] = a2[j++];
        }
        return arr;
    }
}
