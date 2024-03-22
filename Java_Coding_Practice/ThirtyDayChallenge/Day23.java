package ThirtyDayChallenge;

import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("String before conversion: "+s);

        String res = swapCases(s);
        System.out.println("String after conversion: "+res);
    }
    static String swapCases(String s){
        String res = "";
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                res+=Character.toUpperCase(s.charAt(i));
            }
            else{
                res += Character.toLowerCase(s.charAt(i));
            }
        }
        return res;
    }
}
