package Array;
import java.util.Arrays;

public class RemoveElement {
    static int removeElement(int []nums,int val){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
         
        }
         return k;
    }
    public static void main(String[] args) {
        int []nums= {1,2,3,4,5,4,3,5};
        int val=4;
        int arr= removeElement(nums, val);
        System.out.println(Arrays.toString(Arrays.copyOf(nums,arr)));
        
    }
    
}
