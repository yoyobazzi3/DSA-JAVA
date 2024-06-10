/*
 * prints all the elements in an array
 */

package Array;

public class PrintArray {

    public static void main(String[] args) {
        PrintArray arrUtil = new PrintArray();
        arrUtil.arrDemo();

    }

    public void arrDemo() {
        int[] arr = new int[5];
        arr[0] = 9;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 6;
        arr[4] = 4444;
        System.out.println(arr[arr.length-1]);
        System.out.println(arr.length);
        printArr(arr);
        
    }

    public static void printArr(int arr[]) {
        for( int i = 0; i < arr.length;  i++){
            System.out.print(arr[i] + " ");
        }
    }
}
