/*
Q8
Alhamza Aljamaly
 */

import java.util.Arrays;
public class q8 {
    public static void main(String[] args) {
        int [] arr = {2,3,1,45,15};
        int temp; //variable used in the swapping process to hold the value of the minimum value
        for (int i=0; i<arr.length-1;i++){
            int minIndex=i; //variable to hold the minimum value index
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[minIndex])
                    minIndex=j;
                temp=arr[minIndex];  //the process below is used to swap the min value with the compared value
                arr[minIndex]=arr[i];
                arr[i]=temp;
                }
            }
        System.out.println("The sorted array is ===> " + Arrays.toString(arr));
        }

    }

