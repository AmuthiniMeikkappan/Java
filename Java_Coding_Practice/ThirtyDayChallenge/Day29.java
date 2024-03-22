package ThirtyDayChallenge;

import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();
        System.out.println("Original String: "+s);
        String res = reverseOrder(s);
        System.out.println("Reversed String:"+res);
    }
    static String reverseOrder(String s){
        String[] revS = s.split(" ");
        String res = "";
        for(String str : revS){
            for(int i=str.length()-1;i>=0;i--){
                res += str.charAt(i);
            }
            res += ' ';
        }
        return res;
    }
}
