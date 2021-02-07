import java.util.ArrayList;
import java.util.Arrays;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return isSortedRec(list, 0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        if(i >= list.size() -1) return true;
        if(list.get(i) > list.get(i + 1))   return false;
        return isSortedRec(list, i+1);
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        // YOUR CODE HERE
        return hasCountCopiesRec(arr, x, count, 0, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i, int curr) {
        if(i == arr.length) return curr==count;
        if(arr[i] == x) return hasCountCopiesRec(arr, x, count, i+1, curr+1);
        else            return hasCountCopiesRec(arr, x, count, i + 1, curr);
    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        // YOUR CODE HERE
        Arrays.sort(arr);
        return binarySearchRec(arr, num, 0, arr.length - 1);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int low, int high) {        

        //System.out.println(low + " " + high);
        if(low > high) return false;
        if(low == high) return arr[low] == num;
        int mid = (low + high)/2;
        if(arr[mid] < num)  return binarySearchRec(arr, num, mid + 1, high);
        else if(arr[mid] == num) return true;
        else                return binarySearchRec(arr, num, low, mid);
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
