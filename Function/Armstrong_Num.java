package Function;
import java.util.*;
public class Armstrong_Num {
    static boolean armStrong(int n){
        int t1 = n;
		int len = 0;
		
		
		while(t1 != 0) {
			len = len + 1;
			t1 = t1 / 10;
		}
		int t2 = n;
		int rem;
		int ans = 0;
		while(t2 != 0) {
			int mul = 1;
			rem = t2 % 10;
			for(int i = 1; i <= len; i++) {
				mul = mul * rem;
			}
			ans = ans + mul;
			t2 = t2 / 10;
		}
		if(n == ans) {
			return true;
		}else {
			return false;
		}
        
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(armStrong(n));
    }
}
