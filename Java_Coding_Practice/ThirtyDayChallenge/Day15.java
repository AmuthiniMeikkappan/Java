package ThirtyDayChallenge;
import java.util.Scanner;
/*  Write a program that prints the unique elements in a sorted array.
    Example:Sorted Array: [1, 2, 2, 3, 4, 5, 5, 5]
    Unique Elements: 1, 3, 4       */
public class Day15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        uniqueElements(arr);
    }
    static void uniqueElements(int[] arr){
        int count=1;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else if(count==1){
                System.out.print(arr[i]+" ");
            }
            else{
                count=1;
            }
        }
        if(count==1){
            System.out.print(arr[arr.length-1]);
        }
    }
}
