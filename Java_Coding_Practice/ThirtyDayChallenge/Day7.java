package ThirtyDayChallenge;
import java.util.Scanner;
/*
Question:
Write a program that takes an integer n as input and checks if it is a palindrome number.

Example:
Input: 12321
Output: Palindrome
 */
public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = isPalindrome(num);
        System.out.println(res?"Palindrome":"Not Palindrome");
    }
    static boolean isPalindrome(int n){
        int sum=0;
        int temp = n;
        while(temp>0){
            int rem = temp%10;
            sum = sum*10+rem;
            temp /= 10;
        }
        if(sum == n){
            return true;
        }
        return false;
    }
}
