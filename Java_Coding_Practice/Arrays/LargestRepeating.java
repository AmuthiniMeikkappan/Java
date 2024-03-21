package Arrays;

public class LargestRepeating {
    public static void main(String[] args) {
        int[] arr = {2,3,3,3,4,5,6,7,7,8,9};
        int res = printLargestRepeating(arr);
        System.out.println(res);
    }
    static int printLargestRepeating(int[] arr){
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]==arr[i-1]){
                return arr[i];
            }
        }
        return -1;
    }
}
