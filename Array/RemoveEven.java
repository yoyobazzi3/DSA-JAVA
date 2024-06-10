package Array;

public class RemoveEven {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        
        int[] oddArray = new int[oddCount];
        int index = 0;
        for( int i = 0; i< arr.length; i ++){
            if(arr[i]%2 !=0){
                oddArray[index] = arr[i];
                System.out.print(oddArray[index]+ " ");

                index++;
            }
        }
        
    }

}
