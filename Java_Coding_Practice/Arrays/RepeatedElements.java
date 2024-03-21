package Arrays;

public class RepeatedElements {
    public static void main(String[] args) {
        int[] arr1 = {3,5,6,8,9};
        int[] arr2 = {2,3,4,6,7,8,8};
        repeatingElements(arr1,arr2);
    }
    static void repeatingElements(int[] a1,int[] a2){
        int i=0,j=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]==a2[j]){
                System.out.print(a1[i]+" ");
                i++;
                j++;
            }
            else if(a1[i]>a2[j]){
                j++;
            }
            else{
                i++;
            }
        }
    }
}
