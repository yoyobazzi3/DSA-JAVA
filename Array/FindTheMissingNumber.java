package Array;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,1,8,6,3,7};
        int n = arr.length+1;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum+ arr[i];
        }
        System.out.println(sum);
        int m = (n*(n+1))/2;
        System.out.println(m);
        int missingNumber = m-sum;
        System.out.println("The missing number is: "+ missingNumber);
        
    }
}
// The missing number is: 5
