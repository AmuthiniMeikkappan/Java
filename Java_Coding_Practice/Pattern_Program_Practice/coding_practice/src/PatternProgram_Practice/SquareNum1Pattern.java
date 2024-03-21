package PatternProgram_Practice;

import java.util.Scanner;
/*
                     ALGORITHM
        1)This pattern is that in the odd rows we need to attach elements at the last for even rows we need to attach elements at first
        2)First we need to get no.of rows as input
        3)After that we need to create loops for rows and columns
        4)After creating row loop we need to create if condition to check whether the row is even
        5)If even it should print the number (row+1) before the column loop
        6)If odd it should print the number(row+1) after the column loop
 */


public class SquareNum1Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       //row loop
        for(int i=1;i<=n;i++){
            //check the row is even
            if(i%2 == 0){
                System.out.print(i+1);
            }
            //column loop
            for(int j=1;j<=n;j++){
                System.out.print(i);
            }
            //check the row is odd
            if(i%2 != 0){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
