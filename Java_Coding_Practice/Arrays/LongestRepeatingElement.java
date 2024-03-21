package Arrays;

public class LongestRepeatingElement {
    public static void main(String[] args) {
        int[] arr ={1,1,2,2,2,2,2,3,3,4,4,4,4,5};

        int res = findLongestRepeatingElement(arr);
        System.out.println(res);
    }
    static int findLongestRepeatingElement(int[] arr){
        int count=1,max=0,maxIndex=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
               // System.out.println(arr[i]+" - "+count);
                if(count>max){
                    max = count;
                    maxIndex = i;
                }
                count = 1;
            }
        }
        if(count>max){
            //System.out.print(arr[arr.length-1]+" - "+count);
            max = count;
            maxIndex = arr.length-1;
        }
        return arr[maxIndex];
    }
}
