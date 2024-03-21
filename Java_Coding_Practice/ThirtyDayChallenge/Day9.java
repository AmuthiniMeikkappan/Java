package ThirtyDayChallenge;
import java.util.Scanner;
/*
Question:
Write a program that finds the largest element present in an array.

Example:
Array: [5, 10, 3, 8, 15]
Largest Element: 15
 */
public class Day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = maxElement(arr);
        System.out.println(res);
    }
    static int maxElement(int[] arr){
        int max = arr[0];
        for(int i:arr){
            if(i>max){
                max = i;
            }
        }
        return max;
    }
}
