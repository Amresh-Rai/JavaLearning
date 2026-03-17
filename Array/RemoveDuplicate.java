package Array;
import java.util.Arrays;


public class RemoveDuplicate {
    static int removeDuplicate(int []arr){
        Arrays.sort(arr);
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,1,2,3,4,1,2,3,4};

        int len=removeDuplicate(arr);
        System.out.println(Arrays.toString(Arrays.copyOf(arr,len)));
    }

    
    
}
