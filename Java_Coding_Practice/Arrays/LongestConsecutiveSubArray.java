package Arrays;

import java.util.Scanner;

public class LongestConsecutiveSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        findLongestConsecutiveSubArray(arr);
    }
    static void findLongestConsecutiveSubArray(int[] arr){
        int count=1,max=0,ei=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==1){
                count++;
            }
            else{
                if(count>max){
                    max = count;
                    ei = i;
                }
                count=1;
            }
        }
        if(count > max){
            max = count;
            ei = arr.length-1;
        }
       // System.out.println("max = "+max+" ei = "+ei);
        int si = ei-max+1;

        for(int i=si;i<=ei;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
