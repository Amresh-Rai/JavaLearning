import java.util.*;

public class RotateBy180 {

   static void PrintTranspose(int [][]matrix,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
    }
    static void ReverseRow(int []matrix){
       int i=0;
       int j=matrix.length-1;
           while(i<j){
              int temp=matrix[i];
                  matrix[i]=matrix[j];
                  matrix[j]=temp;
                   i++;
                   j--;
       
            }
    }  
   
    static void ReverseRowOrder(int [][]matrix,int r){
        int i=0;
        int j= matrix.length-1;
        while(i<j){
            int[]temp = matrix[i];
            matrix[i]=matrix[j];
            matrix[j]= temp;
            i++;
            j--;
        }
    }
    static void PrintMatrix(int[][]matrix,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println( );
        }
    }
  
    static void RotateMatrix(int [][]matrix,int r){

        PrintTranspose(matrix,r,r);

        for(int i=0;i<r;i++){
            ReverseRow(matrix[i]);

        }

            ReverseRowOrder(matrix,r);
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int r;
        int c;

        System.out.print("Enter the no.of rows and no. column for the matrix:");
        r=sc.nextInt();
        c=sc.nextInt();

        int [][]matrix =new int[r][c];
        
        int totalelement = r*c;

        System.out.println("Enter the" + totalelement + "in the matrix:");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        RotateMatrix(matrix,r);
        //PrintTranspose(matrix,r,c);
        PrintMatrix(matrix,r,c);
       // RotateMatrix(matrix,r);
        
    
}
}