package Array;


public class SecondMaxArray {
    public static void main(String[] args) {
        SecondMaxArray secondMaxArray = new SecondMaxArray();
        secondMaxArray.secondLargest();
    }

    public void secondLargest() {
        int[] arr = { 7,7,7,7,7,7,7,7 };
        findSecondLargest(arr);
    }

    public static void findSecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }else
            if(arr[i]<max && arr[i]!= secondMax){
                secondMax = arr[i];
            }

        }
        if(secondMax == Integer.MIN_VALUE){
            System.out.println("There is no second max");
        }
        else{      
              System.out.println(secondMax);
        }
        // System.out.println(max);
        // System.out.println(secondMax);
    
        }
    }
