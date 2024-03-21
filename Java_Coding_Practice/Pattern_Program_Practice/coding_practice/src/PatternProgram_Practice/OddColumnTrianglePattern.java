package PatternProgram_Practice;

import java.util.Scanner;
/*
                ALGORITHM
     1)We need to get no.of rows as input
     2)After that we need to create a loop to print right triangle
     3)In the column loop we need to give a condition(even number subtract by 1 is an odd number)
     4)We need to apply this condition, and then we will get an odd count triangle
 */

public class OddColumnTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            //loop to print column elements
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
