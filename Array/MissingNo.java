package Array;

public class MissingNo {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,9,10};
        int n=10;
        int TotalSum= n*(n+1)/2;

        int ActualSum=0;
        for(int i=0;i<arr.length;i++){
            ActualSum += arr[i];
        }

        int missingNo= TotalSum-ActualSum;
        System.out.println(missingNo);
    }
    
}
