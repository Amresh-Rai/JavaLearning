import java.util.Arrays;
public class TransposeArray {
    public static void main(String[] args) {
        int[][]arr={
            {1,2,3},
            {4,5,6}
        };
        System.out.println("The Arrays before Transpose:" );
        System.out.println(Arrays.deepToString(arr));
      int r= arr.length;
      int c= arr[0].length;

      int[][]transpose= new int[c][r];

      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            transpose[j][i]=arr[i][j];
        }
      }
      System.out.println("the Array After Transpose:");
      System.out.println(Arrays.deepToString(transpose));

        
    }
    
}
