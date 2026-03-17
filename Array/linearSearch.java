package Array;

public class linearSearch {            
    static int LinearSearch(int[] arr, int target) {
        boolean found = false;   // 🔥 flag

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;    // element mil gaya
                return i;
            }
        }

        if (found == false) {   // agar nahi mila
            return -1;
        }

        return -1; // safety (optional)
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 5;

        int result = LinearSearch(arr, target);

        if(result != -1){
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}