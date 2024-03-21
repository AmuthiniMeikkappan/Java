package Arrays;

public class LargestSubArray {
    public static void main(String[] args) {
        int[] arr = {3,0,1,2,1,0,2,1,0,3,3};
        int k = 6;

        printLargestSubArray(arr,k);
    }
    static void printLargestSubArray(int[] arr,int k){
        for(int size= arr.length;size>=1;size--){
            for(int i=0;i<=arr.length-size;i++){
                int sum=0;
                for(int j=i;j<i+size;j++){
                    sum += arr[j];
                }
                if(sum==k){
                    for(int j=i;j<i+size;j++){
                        System.out.print(arr[j]+" ");
                    }
                    return;
                }
            }
        }
    }
}
