package ThirtyDayChallenge;
import java.util.Scanner;
/*
Question:
Write a program that takes an integer n as input and prints all the factors of n.

Example:
Input: 12
Output: 1, 2, 3, 4, 6, 12
 */
public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factor(n);
    }
    static void factor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
