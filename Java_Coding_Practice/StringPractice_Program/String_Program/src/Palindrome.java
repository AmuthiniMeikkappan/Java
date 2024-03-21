import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String res = isPalindrome(str);
        System.out.println(str.equals(res)?"Palindrome":"Not Palindrome");
    }
    public static String isPalindrome(String s){
        String rev = "";

        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        return rev;
    }
}
