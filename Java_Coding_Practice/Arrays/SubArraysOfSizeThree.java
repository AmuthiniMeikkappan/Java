package Arrays;

public class SubArraysOfSizeThree {
    public static void main(String[] args) {
        int[] arr = {5,1,2,4,9,3,1,3,3};
        int size = 3;

        subArray(arr,size);
    }
    static void subArray(int[] arr,int size){

        for(int i=0;i<=arr.length-size;i++){
            for(int j=i;j<i+size;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
