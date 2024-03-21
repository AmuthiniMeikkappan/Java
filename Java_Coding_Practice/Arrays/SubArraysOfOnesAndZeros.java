package Arrays;

public class SubArraysOfOnesAndZeros {
    public static void main(String[] args) {
        int[] arr = {1,3,5,1,0,1,0,1,1,1};

        printAllSubArrays(arr);
    }
    static void printAllSubArrays(int[] arr){
        for(int size=arr.length;size>1;size--){
            for(int i=0;i<=arr.length-size;i++){
                int countOne=0,countZero=0;
                for(int j=i;j<i+size;j++){
                    if(arr[j]==0){
                        countZero++;
                    }
                    else if(arr[j]==1){
                        countOne++;
                    }
                }
                if((countOne+countZero)==size && countOne>0 && countOne==countZero){
                    for(int j=i;j<i+size;j++){
                        System.out.print(arr[j]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
