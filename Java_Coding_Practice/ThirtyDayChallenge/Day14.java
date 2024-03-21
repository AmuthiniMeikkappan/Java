package ThirtyDayChallenge;
import java.util.Scanner;
/*Question:Write a program that prints the occurrences of all elements in a sorted array.
Example:Array: [1, 1, 1, 2, 3, 3, 5, 5, 5, 6]
Occurrences:1 - 3,2 - 1,3 - 2,5 - 3,6 - 1
 */
public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        findAllOccurrences(arr);
    }
    static void findAllOccurrences(int[] arr){
        for(int i=0;i<arr.length;){
            int count=0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
              else{
                  break;
               }
            }
            System.out.println(arr[i]+" - "+count);
            i += count;
        }
    }
}
