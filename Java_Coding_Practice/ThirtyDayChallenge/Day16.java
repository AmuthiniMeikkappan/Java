package ThirtyDayChallenge;
import java.util.Scanner;
/*
Question:
Write a program that prints all the subarrays of an array.
Example:
Array: [1, 2, 3]
Subarrays:[1],[1, 2],[1, 2, 3],[2],[2, 3],[3]
 */
public class Day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        printAllSubArrays(arr);
    }
    static void printAllSubArrays(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("[ ");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println("]");
            }
        }
    }
}
