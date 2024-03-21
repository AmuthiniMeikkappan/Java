package ThirtyDayChallenge;

import java.util.Scanner;

/*
Question:
Write a program that checks if a given string is a palindrome or not.

Example:
String: "racecar"
Output: Palindrome
 */
public class Day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome?"Palindrome":"Not Palindrome");
    }
    static boolean isPalindrome(String s){
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        if(s.equals(rev)){
            return true;
        }
        return false;
    }
}
