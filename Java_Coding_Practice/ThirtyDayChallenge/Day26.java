package ThirtyDayChallenge;

import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter the character to find the index:");
        char ch = sc.next().charAt(0);

        int res = findIndex(s,ch);
        System.out.println("Index: "+res);
    }
    static int findIndex(String s, char ch){
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }
}
