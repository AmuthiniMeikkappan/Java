package ThirtyDayChallenge;

import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("Before:"+s);

        String res = findVowels(s);
        System.out.println("After:"+res);
    }
    static String findVowels(String s){
        String res = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'
            ||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                res +="#";
            }
            res += s.charAt(i);
        }
        return res;
    }
}
