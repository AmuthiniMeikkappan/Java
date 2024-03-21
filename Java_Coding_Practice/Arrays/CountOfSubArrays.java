package Arrays;

public class CountOfSubArrays {
    public static void main(String[] args) {
        int[] arr = {5,1,2,4,9,3,1,3,3};
        int size = 3;
        int k=7;

        int res = countOfSubArray(arr,size,k);
        System.out.println(res);
    }
    static int countOfSubArray(int[] arr,int size,int k){
        int count=0;
        for(int i=0;i<=arr.length-size;i++){
            int sum=0;
            for(int j=i;j<i+size;j++){
                sum += arr[j];
            }
            if(sum==k){
                count++;
                for(int n=i;n<i+size;n++){
                    System.out.print(arr[n]+" ");
                }
                System.out.println();
            }
        }
        return count;
    }
}
