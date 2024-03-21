package Arrays;

public class WithoutRepeatingElements {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,4,4,4};
        printWithoutRepeating(arr);
    }
    static void printWithoutRepeating(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print(arr[arr.length-1]);
    }
}
