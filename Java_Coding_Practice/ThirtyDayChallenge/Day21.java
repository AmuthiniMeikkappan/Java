package ThirtyDayChallenge;

import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String:");
        String s = sc.nextLine();

        int res = findCountVowels(s);
        System.out.println("Number of Vowels: "+res);
    }
    static int findCountVowels(String s){
        int count=0;
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
}
