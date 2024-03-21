package PatternProgram_Practice;

import java.util.Scanner;
/*
                     ALGORITHM
          1)This pattern is to print the alphabets in right triangle pattern
          2)First we need to get no.of rows as input
          3)We need to initialize a character variable "ch" by assigning the value 'A' to it
          4)We need to create loops for rows and columns to print right triangle pattern
          4)After printing "ch", we need to increment it for each row

 */

public class AlphabeticRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }
}
