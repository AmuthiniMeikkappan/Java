package ThirtyDayChallenge;
import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("String with special characters:"+s);
        String res = removeSpecialCharacters(s);
        System.out.println("Strings without special character:"+res);
    }
    static String removeSpecialCharacters(String s){
        String res = "";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z')){
                res += s.charAt(i);
            }
        }
        return res;
    }
}
