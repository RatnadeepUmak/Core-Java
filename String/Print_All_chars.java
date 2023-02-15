package String;

import java.util.Scanner;

public class Print_All_chars {

    static int printChars(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            // System.out.println(str.charAt(i));
            count++;

        }
        return count;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        String str;
        str = s.nextLine();

        System.out.print(printChars(str));
    }
    
}
