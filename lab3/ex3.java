package lab3;
import java.util.*;

public class ex3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
       StringBuffer sb=new StringBuffer(s);
       sb.reverse();
       System.out.println(sb+"|"+s);
       
		
	}

}
