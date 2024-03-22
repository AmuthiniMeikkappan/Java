package ThirtyDayChallenge;

import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        findOccurrences(s);
    }
    static void findOccurrences(String s){
        int[] arr = new int[123];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            arr[c]++;
        }
        for(int i=97;i<123;i++){
            if(arr[i]>0){
                System.out.println((char)i+"-"+arr[i]);
            }
        }
    }
}
