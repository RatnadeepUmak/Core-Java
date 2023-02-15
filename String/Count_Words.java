package String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Count_Words {

    static int countWords(String str){
        if(str == null || str.isEmpty()){
            return 0;
        }
        StringTokenizer tokens = new StringTokenizer(str);
        return tokens.countTokens();
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        String str;
        str = s.nextLine();

        System.out.print(countWords(str));
    }
    
}
