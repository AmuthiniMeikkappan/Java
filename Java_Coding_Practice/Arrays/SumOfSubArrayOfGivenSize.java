package Arrays;

public class SumOfSubArrayOfGivenSize {
    public static void main(String[] args) {
        int[] arr = {5,1,2,4,9,3,1,3,3};
        int size = 3;

        sumOfSubArray(arr,size);
    }
    static void sumOfSubArray(int[] arr,int size){

        for(int i=0;i<=arr.length-size;i++){
            int sum=0;
            for(int j=i;j<i+size;j++){
                sum += arr[j];
                System.out.print(arr[j]+" ");
            }
            System.out.println("- "+sum);
        }
    }
}
