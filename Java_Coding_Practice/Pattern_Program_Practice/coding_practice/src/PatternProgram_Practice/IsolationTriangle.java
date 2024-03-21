package PatternProgram_Practice;
import java.util.Scanner;
/*
                 ALGORITHM
     1)1We need to get no.of rows as input
     2)After that we need to create a loop to print right triangle
     3)In the column loop we need to give a condition(even number subtract by 1 is an odd number)
     4)We need to apply this condition, and then we will get an odd count triangle
     5)Here we need to add extra loop for the space
     6)There we need to apply a condition(subtract "i" row to the total number of rows "n")
 */

public class IsolationTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       //loop to iterate rows
        for(int i=1;i<=n;i++){
            //loop to add space
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //loop to print elements and iterate column
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
