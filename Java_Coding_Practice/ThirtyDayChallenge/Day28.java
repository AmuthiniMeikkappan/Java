package ThirtyDayChallenge;

import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        boolean res = isEqualOrNot(s1,s2);
        System.out.println(res?"Equal":"Not Equal");
    }
    static boolean isEqualOrNot(String s1,String s2){
        int count=0,i=0,j=0;
        if(s1.length() != s2.length()){
            return false;
        }
        while(i<s1.length()){
            if(s1.charAt(i)!= s2.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
