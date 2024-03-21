package ThirtyDayChallenge;
import java.util.Scanner;
/*
Question:
Write a program that takes two integers, n1 and n2, as input and prints the first y common multiples of n1 and n2.

Example:
Input: n1 = 3, n2 = 5, y = 4
Output: 15, 30, 45, 60
 */
public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int y = sc.nextInt();

        commonFactors(n1,n2,y);
    }
    static void commonFactors(int n1,int n2,int y){
        int count=0;
        int i=2;
        while(count<y){
           if(i%n1 == 0 && i%n2==0){
               System.out.print(i+" ");
               count++;
           }
           i++;
        }
    }
}
