package PatternProgram_Practice;

import java.util.Scanner;
/*
                    ALGORITHM
       1)We need to get no.of rows as input
       2)Here we need to print Alphabets, so we initialize one character variable "ch" with assigning value 'A' to it
       3)After that we need to create a loop for rows
       4)In the output the even rows are in descending order and the odd rows are in ascending order
       5)For that we need to create "if else condition"
       6)inside the if and else condition we need to create a loop to print elements
       7)For the even rows we need to initialize one variable "chRev" to find the first element of the row
       8)After that we need to decrement the value to get descending order and for the sequence we need to increment the "ch" value also
       9)For the odd rows we need to simply increment the "ch" value to get ascending order
 */

public class AlphabeticRightTriangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';

        for(int i=1;i<=n;i++){
            //even rows
            if(i%2 == 0){
                //to get a first element of the row
                char chRev = (char)(ch+i-1);
                for (int j = 1; j <= i ; j++) {
                    System.out.print(chRev--+" ");
                    //to maintain the sequence of character
                    ch++;
                }
            }
            //odd rows
            else{
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch++ +" ");
                }

            }
            System.out.println();
        }
    }
}
