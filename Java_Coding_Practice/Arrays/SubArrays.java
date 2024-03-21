package Arrays;

public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {3,5,1,7,2};
        int k = 9;

        printAllSubArrays(arr,k);
    }
    static void printAllSubArrays(int[] a,int k){
        int size = 1;
        while(size<=a.length) {
            for (int i = 0; i <= a.length - size; i++) {
                int sum=0;
                for (int j = i; j < i + size; j++) {
                    sum+=a[j];
                }
                if(sum == k){
                    for(int j=i;j<i+size;j++){
                        System.out.print(a[j]+" ");
                    }
                    System.out.println();
                }
            }

            size++;
        }
    }
}
