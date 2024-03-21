package ThirtyDayChallenge;
import java.util.Scanner;

/*
Question:
Write a program that takes an integer n as input and checks whether it is a prime number or not.

Example:
Input: 7
Output: Prime
 */
public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = isPrime(n);
        System.out.println(res);
    }
    static String isPrime(int n){
        if(n==1){
            return "Not Prime";
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0) {
                return "Not Prime";
            }
        }
        return "Prime";
    }
}
