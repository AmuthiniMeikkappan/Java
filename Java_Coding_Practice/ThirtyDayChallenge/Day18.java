package ThirtyDayChallenge;
import java.util.Scanner;
/*Question:Write a program that prints the largest subarray whose sum is equal to k.
Example:Array: [1, 2, 3, 4, 5],Target Sum: 9,Largest Subarray with Sum 9: [2, 3, 4] */
public class Day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        printAllSubArrays(arr, t);
    }
    static void printAllSubArrays(int[] arr, int t) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == t) {
                    System.out.print("[ ");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println("]");
                    return;
                }
            }
        }
    }
}
