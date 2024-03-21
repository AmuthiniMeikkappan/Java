package ThirtyDayChallenge;
import java.util.Scanner;
/*
Write a program that calculates the sum of all elements present in an array.

Example:
Array: [1, 2, 3, 4, 5]
Sum: 15
 */
public class Day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = sumAll(arr);
        System.out.println(res);
    }
    static int sumAll(int[] arr){
        int sum = 0;
        for(int i:arr){
            sum += i;
        }
        return sum;
    }
}
