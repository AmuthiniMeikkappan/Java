package PatternProgram_Practice;
import java.util.Scanner;
/*
            ALGORITHM
      1)We need to get no.of rows as input
      2)I had created a loop to print Inverted Right Triangle
      3)Before that we need to declare a variable "count" to print the number sequence
      4)We need to use "if condition" to get hallow in the triangle
      5)We need to increment the "count" value for the number sequence
 */

public class InvertedRightAngleTriangleNumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;
        for(int i=0;i<n;i++){
            count = i+1;
            for(int j=1;j<=n-i;j++){
                //Condition to get hallow in the triangle
                if(j==1 || j==n-i || i==0){
                    System.out.print(count +" ");
                }
                else{
                    System.out.print("  ");
                }
                count++;
            }
            System.out.println();
        }
    }
}
