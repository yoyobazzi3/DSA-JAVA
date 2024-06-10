package Array;

public class MinValueArr {
    public static void main(String[] args) {
        MinValueArr minValueArr = new MinValueArr();
        minValueArr.minValue();

    }

    public void minValue() {
        int[] arr = { 544, 23, 4, 5, 345, 435, 3, 2, 34, 325, 4354, 32, 34, 23, 4, 25, 32, 54, 5, 2, 5, 32, 45,
                242523 };
        // int[] arr = {};
        getMinValue(arr);
    }

    public static void getMinValue(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int lowest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (lowest > arr[i]) {
                lowest = arr[i];
            }
        }
        System.out.println(lowest);

    }
}
