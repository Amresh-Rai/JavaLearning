package Array;
import java.util.*;

public class MoveAllZeros {

    static void MoveZeros(int[]arr,int n){
        int j=0;
       for(int i=0;i<n;i++){
        if(arr[i]!=0){
            arr[j]=arr[i];
            j++;
        }
        }
        while(j<n){
            arr[j]=0;
            j++;
        }
       
    }

    static void PrintArray(int []arr,int n){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n;

        System.out.print("Enter the no.of element inthe array:");
        n=sc.nextInt();

        int []arr=new int [n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("the Orignal Array :");
        PrintArray(arr,n);


        System.out.println("the Array after MOving Alll the Zeros At the End :");
        MoveZeros(arr,n);
        PrintArray(arr,n);
        
    }
    
}
