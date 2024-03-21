package ThirtyDayChallenge;
import java.util.Scanner;
/*
Question:
Write a program that prints all pairs from an array whose difference is equal to k.
Example:
Array: [9, 5, 6, 1, 2]
Difference: 4
Pairs: (9, 5), (5, 1), (6, 2)
 */
public class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        pairsWithDiffK(arr,k);
    }
    static  void pairsWithDiffK(int[] arr,int k){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int diff = Math.abs(arr[i]-arr[j]);
                if(diff == k){
                    System.out.print("("+arr[i]+", "+arr[j]+") ");
                }
            }
        }
    }
}
