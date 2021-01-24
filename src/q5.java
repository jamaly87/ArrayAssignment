/*
Q5
Alhamza Aljamaly
 */
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,0,6,12,8,9,10};
        System.out.println("The Max Value in the Array is: "+ getMax(arr));
        System.out.println("The Min Value in the Array is: "+ getMin(arr));
    }
    public static int getMax(int [] arr1){
        int maxValue=arr1[0];   //I made the first element of the array as a reference point.
        for (int i =1; i<arr1.length; i++){
            if (arr1[i]>maxValue) maxValue=arr1[i];
        }
        return maxValue;
    }
    public static int getMin(int [] arr1){
        int minValue=arr1[0];
        for (int i =1; i<arr1.length; i++){
            if (arr1[i]<minValue) minValue=arr1[i];
        }
        return minValue;
    }
}
