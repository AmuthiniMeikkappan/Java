package ThirtyDayChallenge;
import java.util.Scanner;

/*
Question:
Write a program to find the Highest Common Factor (HCF) of two numbers.

Example:
Numbers: 24, 36
HCF: 12
 */
public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int hcf = HCF(n1,n2);
        System.out.println(hcf);
    }
    static int HCF(int n1, int n2){
        int min = n1>n2?n1:n2;
        for(int i=min;i>=1;i--){
            if(n1%i==0 && n2%i==0){
                return i;
            }
        }
        return -1;
    }

}
