package PatternProgram_Practice;

import java.util.Scanner;
/*
                ALGORITHM
   1)We need to get a no.of rows as input
   2)After that we need to create loops for rows and columns
   3)Here we need to divide the pattern into two segments like the upper right triangle and lower right triangle
   5)To get upper right triangle pattern we need to create loops for rows and columns
   6)Do the same for lower but the lower triangle is inverted, so we need to create a loop for inverted right triangle
 */

public class IsolationTrianglePattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       //Loop to print upper right triangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        //Loop for lower or inverted right triangle
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
