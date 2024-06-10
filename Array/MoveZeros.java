package Array;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,0,3,4,0,4,4,4,0};

        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            // when i is not 0 and zero is zero then we want to swap
            if(arr[i]!=0 && arr[zero] == 0){
                // swap
                int temp = arr[i];
                arr[i] = arr[zero];
                arr[zero] = temp;
            }
            //We want to get to the zero 
            if(arr[zero] != 0){
                zero++;
            }
        }


        for(int a : arr ){
            System.out.print(a+ " ");
        }
    }

   
    
}
