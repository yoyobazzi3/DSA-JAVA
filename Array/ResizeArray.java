package Array;

// import java.util.Scanner;
public class ResizeArray {
    public static void main(String[] args) {
        ResizeArray resizeArray = new ResizeArray();
       int[] arr = {1,2,3,4,5};
       System.out.println(arr.length);
        // we hace to assign the new arr to the bigger one
       arr = resizeArray.biggerArray(arr, arr.length*2);
        System.out.println(arr.length);
        // print the arr
        printArr(arr);
    }

    public int[] biggerArray(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for(int i = 0; i< arr.length; i++){
            temp[i] = arr[i];
        }
        return temp;

        
    }
    public static void printArr(int[] arr){
        for(int n : arr){
            System.out.print(n+" ");
        }
    }
   
}
