/*
Q4
Alhamza Aljamaly
 */
import java.util.Arrays;
public class q4 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("The original Array is: "+ Arrays.toString(arr));
        reverseArray(arr, arr.length);

    }
    /* This is a method that takes an array and its length
    as an input then returns the array in a reversed order
    * */
    public static void reverseArray(int [] arr1, int n){
       int [] arr2= new int [n];
       int k=n;
        for (int i=0; i<n; i++){
            arr2[k-1]=arr1[i];
            k--;
        }
        System.out.println("The Reversed Array is: "+ Arrays.toString(arr2));
    }
}
