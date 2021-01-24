/*
Q1
Alhamza Aljamaly
 */
import java.util.Scanner;
import java.util.Arrays;
public class q1 {
    public static void main(String[] args) {
        //Use Scanner class to take user input to create an array
        Scanner scanner = new Scanner(System.in);
        int[] array = new int [10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter an integer number for the Array");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }

}
