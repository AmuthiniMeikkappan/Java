package ThirtyDayChallenge;
import java.util.Scanner;
/*
Question:
Write a program that takes an integer `n` as input and performs the following actions:
- If `n` is a multiple of 3, print 'TAP'.
- If `n` is a multiple of 5, print 'ACAD'.
- If `n` is a multiple of both 3 and 5, print 'FULLSTACK'.
- Otherwise, print the number itself.
Example:
Input: 5
Output: ACAD
 */
public class Day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = findMultiple(n);
        System.out.println(res);
    }
    static String findMultiple(int n){
        if(n%3==0 && n%5==0){
            return "FULLSTACK";
        }
        if(n%3==0){
           return "TAP";
        }
        if(n%5==0){
            return "ACAD";
        }
        return Integer.toString(n);
    }
}
