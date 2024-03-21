package Arrays;

import java.util.Scanner;

public class ConsecutiveSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        findConsecutiveSubArrays(arr);
    }
    static void findConsecutiveSubArrays(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==1){
                System.out.print(arr[i]+" ");
            }
            else{
                System.out.println(arr[i]);
            }
        }
        System.out.println(arr[arr.length-1]);
    }
}
