/*
Q7
Alhamza Aljamaly
 */
import java.util.Arrays;

public class q7 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("The Input Array is ---->"+ Arrays.toString(array));
        rightRotate(array);

    }

    public static void rightRotate(int [] arr){
        int [] newArr = new int [arr.length];  //initialize a copy array
        for (int i=0; i< arr.length-1;i++){
            newArr[i+1]=arr[i]; //the second index of the new array equal to the first index of input array
        }
        newArr[0]=arr[arr.length-1]; //the first index in newArr equals to the last in the input array
        System.out.println("The new Array after right rotation -->"+ Arrays.toString(newArr));
    }

}
