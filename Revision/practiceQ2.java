package Revision;
import java .util.*;

public class practiceQ2 {
    static void print(int [][] matrix){
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
       }
    }

    static void findTranspose(int[][]matrix,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=temp;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int r;
        int c;
        System.out.print("Enter the rows and column in the matrixes:");
        r=sc.nextInt();
        c=sc.nextInt();

        int [][] matrix=new int [r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();               
            }
        }

        System.out.println("the matrix taken by the user:");
        print(matrix);

        System.out.println("the matrix after the transpose:");
        findTranspose(matrix, r, c);
        print(matrix);

        
    }
    
}
