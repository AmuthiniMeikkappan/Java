import java.util.Scanner;

public class ReversingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println("String before reversing:");
        System.out.println(str);

        String res = revString(str);
        System.out.println("String after reversing:");
        System.out.println(res);
    }
    public static String revString(String s){
        String rev = "";

        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        return rev;
    }
}
