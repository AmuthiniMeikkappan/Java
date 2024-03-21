package ThirtyDayChallenge;

import java.util.Scanner;

/*
Question:
Write a program that prints all the pairs in an array.

Example:
Array: [1, 2, 3, 4, 5]
Pairs: (1, 2), (1, 3), (1, 4), (1, 5), (2, 3), (2, 4), (2, 5), (3, 4), (3, 5), (4, 5)
 */
public class Day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        printAllPairs(arr);
    }
    static void printAllPairs(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}
