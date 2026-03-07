import java.util.*;
public class SpiralMatrix {

    static void SpiralMatrix(int [][]matrix,int r,int c){
        int toprow=0,bottomrow=r-1,leftcol=0,rightcol=c-1;
          int totalelement=0;
        while(totalelement<r*c){
          
            for(int j=leftcol;j<=rightcol && totalelement<r*c ;j++){
                System.out.print(matrix[toprow][j] + " ");
                totalelement++;
            }
            toprow++;
            for(int i=toprow;i<=bottomrow && totalelement<r*c;i++){
                System.out.print(matrix[i][rightcol] + " ");
                totalelement++;
            }
            rightcol--;
            for(int j=rightcol;j>=leftcol && totalelement<r*c;j--){
                System.out.print(matrix[bottomrow][j] + " ");
                totalelement++;
            }
            bottomrow--;
            for(int i=bottomrow;i>=toprow && totalelement<r*c;i--){
                System.out.print(matrix[i][leftcol] + " ");
                totalelement++;
            }
            leftcol++;

        }

    }

    static void PrintMatrix(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int r;
        int c;
        
        System.out.println("Enter the  no. rows and the columns in the matrix:");
        r=sc.nextInt();
        c=sc.nextInt();

        int [][]matrix=new int[r][c];

        int totalelement=r*c;

        System.out.println("enter the " + totalelement + " element in the matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();           
             }
       }
       System.out.println("the input matrix:");
       PrintMatrix(matrix);

       System.out.println("The spiral Order is :");
       SpiralMatrix(matrix,r,c);

    
    }


    
}
