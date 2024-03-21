package PatternProgram_Practice;

import java.util.Scanner;
/*
                        ALGORITHM
      1)In this pattern we need to print elements in descending order in a row, and also we need to print stars between two elements
      2)First we need to get no.of rows as input
      3)After that we need to declare a variable "count" to get number sequence
      4)We need to create loops for rows and columns
      5)Inside the row loop we need to initialize the "count" variable by "rows*(rows+1)/2"(calculating n natural numbers)
      6)That is to calculate the first element of each row
      7)After that we need to print the count and decrement it to get descending order
      8)To print starts between two elements we need to create one if condition to check whether the element is last or not
 */

public class RightTriangleNumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;

        for (int i = 1; i <= n; i++) {
            //calculate the i natural numbers
            count = i*(i+1)/2;
            for (int j = 1; j <= i; j++) {
                System.out.print(count--);
                //check the element is not a last element
                if(j<i){
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
