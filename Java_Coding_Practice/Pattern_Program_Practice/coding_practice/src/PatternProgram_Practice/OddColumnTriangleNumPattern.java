package PatternProgram_Practice;

import java.util.Scanner;
/*
                ALGORITHM
      1)This pattern contains odd number of columns in a row
      2)First we need to get no.of rows as input
      3)After that we need to create loop for rows and columns
      4)After that we need to initialize a variable "count" inside row loop
      5)The "count" variable is to track the number sequence
      6)for the odd number of column we need to give condition as "multiplying a row with 2 and subtract it with 1"
      7)In the pattern if the column is greater than row the number is decreasing, so we need to create "if else" condition for this
      8)Inside the if condition we need to write if column is lesser than rows then increment the "count" else decrement the "count"

 */

public class OddColumnTriangleNumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int count = 1;
            for(int j=1;j<=(2*i)-1;j++){
                if(j<i){
                    System.out.print(count++ +" ");
                }
                else{
                    System.out.print(count-- + " ");
                }
            }
            System.out.println();
        }
    }
}
