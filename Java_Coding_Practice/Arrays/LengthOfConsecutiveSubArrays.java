package Arrays;

import java.util.Scanner;

public class LengthOfConsecutiveSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        findLengthOfConsecutiveSubArrays(arr);
    }
    static void findLengthOfConsecutiveSubArrays(int[] arr){
        int count=1;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i] == 1){
                count++;
            }
            else{
                System.out.println(count);
                count=1;
            }
        }
        System.out.println(count);
    }
}
