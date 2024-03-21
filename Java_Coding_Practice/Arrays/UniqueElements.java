package Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,4,4,4,23};
        printUniqueElements(arr);
    }
    static void printUniqueElements(int[] arr){
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else if(count==1){
                System.out.print(arr[i]+" ");
            }
            else{
                count=1;
            }
        }
        if(count==1){
            System.out.println(arr[arr.length-1]);
        }
    }
}
