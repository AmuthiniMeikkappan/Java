package PatternProgram_Practice;
import java.util.Scanner;
/*
            ALGORITHMS USED
     1)We should calculate the "n" natural number to place it on the top of the triangle
     2)After calculating the number we should create loops to print triangle
     3)In the o/p we are decreasing the number from right to left
     4)For that we need to subtract count by row only when row is greater than 1
     5)I have taken a temporary variable "num" to hold the count value
     6)To increase the count from left to right, we need to increment the "num" value after each iteration
 */
public class RightAngelTriangleDecNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //calculate the n natural number
        int count=n*(n+1)/2;

        //this loop is to iterate to the rows
        for(int row = 1;row <= n; row++){
            if(row>1){
                count -= row;
            }
            int num = count;
            //this loop is for the column iteration
            //the column should less than or equal to row to print right angle triangle
            for(int col = 1;col <= row; col++){
                System.out.printf("%02d ",num++);
            }
            System.out.println();
        }
    }
}
