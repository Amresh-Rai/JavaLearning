package Revision;
import java .util.*;

// PASCAL TRAINGLE 

public class practiceQ1 {

    static void print(int [][]arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
         System.out.print( arr[i][j]+" ");
     
       }
       System.out.println();
    }
}
    static int[][]pascal(int n){
        int[][]ans=new int [n][];
        for(int i=0;i<n;i++){
        ans[i]=new int [i+1];
        ans [i][0]= ans [i][i]=1;
        for(int j=1;j<i;j++){
            ans[i][j]= ans[i-1][j]+ ans [i-1][j-1];
        }
        }
        return ans ;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n;
        System.out.print("Enter the no.of the element:");
        n=sc.nextInt();
        int ans [][]= pascal(n);
        print(ans);

        
    }
    
}
