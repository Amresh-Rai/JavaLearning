package Array;
import java.util.*;

public class SecondLargestInArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int n;

        System.out.print("enter the number of element in teh array:");
        n=sc.nextInt();

        if(n<2){
            System.out.println("the Second largestlement does not exist in tha array");
            return;
        }
        int []arr =new int [n];

        System.out.print("enter the element at arr[0]:");
        arr[0]=sc.nextInt();
        System.out.print("enter the element at arr[1]:");
        arr[1]=sc.nextInt();


        int max;
        int smax;
           
        if(arr[0]>arr[1]){
            max =arr[0];
            smax=arr[1];
        }
        else{
            max=arr[1];
            smax=arr[0];
        }

        System.out.println("enter the element in the array:");
        for(int i=2;i<n;i++){
            arr[i]=sc.nextInt();
      
        
        if(arr[i]>max){
            smax=max;
            max=arr[i];
        }
        else if (arr[i]>smax && arr[i]<max);
          }

        if(smax==max){
            System.out.println("there is no second ax exist in te array!!");
        }
        else{
            System.out.println("the second largest element in the array is :" + smax);
        }

        
    }
    
}
