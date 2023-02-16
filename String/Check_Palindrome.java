package String;

public class Check_Palindrome {

    static boolean checkPalindrome(String str) {
      String rev = "";
      boolean isPalindrome = false;
      for(int i = str.length() - 1; i >= 0; i--){
        rev += str.charAt(i);
      }
      if(str.equals(rev)){
        isPalindrome = true;
      }
      return isPalindrome;

    }

    public static void main(String args[]) {
        String str = "aba";

       boolean isPalindrome = checkPalindrome(str);
       System.out.print(isPalindrome);

    }
}
