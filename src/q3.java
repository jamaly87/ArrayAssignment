/*
Q3
Alhamza Aljamaly
 */
import java.util.Arrays;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter an integer number (" + counter + " of 20) for the Array");
            counter++;
            array[i] = scanner.nextInt();
        }
        System.out.println("Your Array is now complete ----> "+ Arrays.toString(array));
        System.out.println("========================================================");
        System.out.println("The number of Positive integers = " + checkPositive(array));
        System.out.println("The number of Negative integers = " + checkNegative(array));
        System.out.println("The number of Zero Integers = "+ checkZero(array));
        System.out.println("The number of Odd Integers = "+checkOddNumbers(array));
        System.out.println("The number of Even Integers = "+checkEvenNumbers(array));
    }
/*
Below I will create five methods to test the different cases provided in the assignment's prompt
I know there is a shorter code to solve this problem statement but I felt that writing methods will be
a good opportunity to practice and make the code more readable.
 */

    public static int checkPositive(int[] arr) {
        int numCounter = 0;
        for (int num : arr) {
            if (num > 0) numCounter++;
        }
        return numCounter;
    }

    public static int checkNegative(int[] arr) {
        int numCounter = 0;
        for (int num : arr) {
            if (num < 0) numCounter++;
        }
        return numCounter;

    }
    public static int checkZero(int [] arr){
        int numCounter = 0;
        for (int num : arr) {
            if (num == 0) numCounter++;
        }
        return numCounter;
    }
    public static int checkOddNumbers(int [] arr){
        int numCounter = 0;
        for (int num : arr) {
            if (num%2!=0) numCounter++;
        }
        return numCounter;
    }
    public static int checkEvenNumbers(int [] arr){
        int numCounter = 0;
        for (int num : arr) {
            if (num%2 == 0) numCounter++;
        }
        return numCounter;
    }

}