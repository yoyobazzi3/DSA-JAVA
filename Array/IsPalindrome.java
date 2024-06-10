package Array;
import java.util.*;
public class IsPalindrome {
    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));

        System.out.println(isPalindrome.palindrome(str));
        sc.close();
    }

  public static String reverse(String str){
    String reverseString = "";
    for(int i = str.length()-1; i>=0; i-- ){
        reverseString = reverseString+ str.charAt(i);
    }

    return reverseString;
  }

  public boolean palindrome(String str){
    if(str.equals(reverse(str))){
        return true;
    }
    return false;
  }
  
}
