package Array;
import java.util.Arrays;

public class ReverseArray {
    static void revArray(int[]arr){
        int s= 0;
        int e= arr.length-1;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        revArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
