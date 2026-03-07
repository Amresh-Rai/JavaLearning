//package TwoDArrays;

// agar humne koi array initialize kra aur uusko aagar koi value nhi de rhe hai to uusme by default value zero padi hoti hai 

import java.util.Scanner;
import java.util.Arrays;

public class inputArray {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int r;
        int c;

        System.out.print("Enter the no.of Rows:");
        r=sc.nextInt();

        System.out.print("Enter the no of columns:");
        c=sc.nextInt();

        int [][] matrix= new int[r][c];

        System.out.println("Enter the element in the array:");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //  for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         System.out.print(matrix[i][j]);        
        //    }
        //    System.out.println( );
        //     }

          System.out.println(Arrays.deepToString(matrix));
    }
}
