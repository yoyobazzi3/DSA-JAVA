package Array;

public class ReverseArray {
    public static void main(String[] args) {
       ReverseArray reverse = new ReverseArray();
        reverse.arr();
    }

    public void arr(){
        int[] arr = {1,2,3,4,5,6,7,8,9};

        reverseArr(arr);
    }

    public static void reverseArr(int[] arr){
        int[] reverse = new int[arr.length];
        int index = 0;
        for(int i = arr.length-1; i>= 0; i--){
            reverse[index] = arr[i];
            System.out.print(reverse[index]+ " ");
        }
    }
}
