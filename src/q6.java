/*
Q6
Alhamza Aljamaly
 */
import java.util.*;
public class q6 {
    public static void main(String[] args) {
        int [] inputArray={1,2,1};
        if (Arrays.equals(inputArray, reverseArray(inputArray))) {
            System.out.println("The Arrays are equal from front to back");
        }
        else {
            System.out.println("The Arrays are not equal from front to back");
        }
    }
    public static int[] reverseArray(int[] arr) {
        int[] newArr = new int[arr.length];
        int n = arr.length;
        int i=0;
        while (n>0){
            newArr[i]=arr[n-1];
            i++;
            n--;
        }
        return newArr;
    }
}
