package Arrays;

import java.util.Scanner;
/*
Example:
Input:4
*
* *
* * *
* * * *

Output:10
 */

public class NumberOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int numOfStars = n*(n+1)/2;
        System.out.println(numOfStars);
    }
}
