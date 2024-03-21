package ThirtyDayChallenge;
import java.util.Scanner;
/*
Question:
Write a program that counts the occurrences of an element in an array.
Example:Array: [1, 2, 3, 2, 2, 4, 5]
Element to Count: 2
Occurrences: 3
 */
public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Element to Count: ");
        int k = sc.nextInt();
        int res = countOccurrences(arr,k);
        System.out.println("Occurrences: "+res);
    }
    static int countOccurrences(int[] arr,int k){
        int count=0;
        for(int i:arr){
            if(i==k){
                count++;
            }
        }
        return count;
    }
}
