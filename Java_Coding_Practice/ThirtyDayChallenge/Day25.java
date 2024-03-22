package ThirtyDayChallenge;

import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.next();
        System.out.println("Enter the character to find the index:");
        char ch = sc.next().charAt(0);

        int res = findIndex(s,ch);
        System.out.println("Index: "+res);
    }
    static int findIndex(String s, char c){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                return i;
            }
        }
        return -1;
    }
}
