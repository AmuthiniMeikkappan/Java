package ThirtyDayChallenge;

import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        findSubString(s);
    }
    static void findSubString(String s){
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                for(int k=i;k<=j;k++){
                    System.out.print(ch[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
