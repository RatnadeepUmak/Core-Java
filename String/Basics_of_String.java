package String;

public class Basics_of_String {
    public static void main(String args[]){
        char ch[] = {'C','a','d','k'};
        String str1 = "Coding";
        String str2 = " is Fun";
        String str3 = "Coding";

       System.out.println(str1.contains("ding"));
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str3));
        str1 = str1 + str2; // str1 += str2;
        System.out.println(str1);
        // System.out.println(str.length());
        // System.out.println(str.charAt(2));

        
        
    }
    
}
