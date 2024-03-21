package ThirtyDayChallenge;

import java.util.Scanner;

/*
Question:
Write a program that reverses a given string.
Example:
Input: ""hello""
Output: ""olleh""
 */
public class Day19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String revStr = reverseString(str);
        System.out.println(revStr);
    }
    static String reverseString(String str){
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        return rev;
    }
}
