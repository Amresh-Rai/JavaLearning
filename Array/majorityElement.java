package Array;

public class majorityElement {

    static int findMajority(int []arr){
        int count=0; 
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                ans=arr[i];
                count=1;
            }
            else{
                if(arr[i]==ans){
                    count++;

                }
                else{
                    count--;
                }
            }
        }
         count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ans){
                count++;
            }
        }
        if (count>arr.length/2){
            return ans;
        }

        return -1;
    }
    public static void main(String[] args) {
        int []arr={1,1,1,1,2,3,5};
        int result=findMajority(arr);
        System.out.println(result);
    }
    
}
