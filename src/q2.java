/*
Q2
Alhamza Aljamaly
 */
import java.util.Scanner;
import java.util.Arrays;
public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int [10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter an integer number for the Array");
            array[i] = scanner.nextInt();
        }
        System.out.println("Does the value exist in the array? " + checkNumber(array,7));
    }
    //A method that returns a boolean to indicate whether a specfic number is available in our array
    public static boolean checkNumber (int [] arr, int value){
        for (int num:arr){
            if (num==value) return true;
        }
        return false;
    }
}