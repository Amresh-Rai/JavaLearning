package Array;
import java .util.*;

public class prifixSum {

    static int[] prefixSumArray(int []arr){
        int n=arr.length;
        
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;


    }


    static void PrintArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the no.of lement in the array:");
        n=sc.nextInt();

        int[] arr=new int [n];
        System.out.println("Enter the lement in the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array given my the user is :");
        PrintArray(arr);
        System.out.println();
        
        System.out.println("The prefix sum array is :");
        int []pref=prefixSumArray(arr);
        PrintArray(pref);
    }
    
}
