package Array;
import java.util.Arrays;



public class RotateElementByKthTerm {

    // static void rotateElement(int []arr,int k){
    //     int n=arr.length;
    //       k=k%n;
    //     for(int i=0;i<k;i++){
    //         int last=arr[n-1];
    //         for(int j=n-1;j>0;j--){
    //             arr[j]=arr[j-1];
    //         }
    //         arr[0]= last;
    //     }
    // }


    static void rotate(int[]arr ,int k){
        int n=arr.length;
        k=k%n;
        rev(arr,0,n-1);
        rev(arr,0,k-1);
        rev(arr,k,n-1);
    }

    static void rev(int []arr,int s,int e){
        while(s<e){
            int temp =arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;e--;
        }
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
          int k=3;

          rotate(arr,k);
          System.out.println(Arrays.toString(arr));

    }
    
    
}
