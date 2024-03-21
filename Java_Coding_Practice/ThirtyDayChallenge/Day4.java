package ThirtyDayChallenge;
import java.util.Scanner;
/*
Question:
Write a program that takes two integers, n1 and n2, as input and prints the common factors of n1 and n2.

Example:
Input: n1 = 12, n2 = 18
Output: 1, 2, 3, 6
 */
public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        commonFactors(n1,n2);
    }
    static void commonFactors(int n1,int n2){
        int min = n1>n2?n2:n1;
        for(int i=1;i<=min;i++){
            if(n1%i==0 && n2%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
