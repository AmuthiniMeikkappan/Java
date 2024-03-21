package PatternProgram_Practice;
import java.util.Scanner;
/*
         ALGORITHMS USED
     1)We need to get the no.of rows as input
     2)We need to create loops to print square
     3)For the number sequence I had created one variable "count"
     4)Inside the row loop we need to assign the row value and to get number sequence we need to increment count inside the column loop
 */

public class SquareNumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //for the number sequence
        int count;
        //loop to iterate rows
        for(int row=1;row<=n;row++){
            //initiate the value
            count = row;
            //loop to iterate columns
            for(int col=1;col<=n;col++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}
