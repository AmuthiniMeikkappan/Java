package ThirtyDayChallenge;
import java.util.Scanner;
/*
Question:
Write a program that prints the largest repeating element in a sorted array.
Example:
Input:
Array: [1, 1, 1, 2, 3, 3, 5, 5, 5]
Output:
5
 */
public class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = largeRepeatingElement(arr);
        System.out.println(res);
    }
    static int largeRepeatingElement(int[] arr){
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]==arr[i-1]){
                return arr[i];
            }
        }
        return -1;
    }
}
