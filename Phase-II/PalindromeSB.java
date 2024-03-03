import java.util.Scanner;
public class PalindromeSB{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		String str = s.next();
		StringBuilder sb = new StringBuilder(str);
		String rev = sb.reverse().toString();
		if(str.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}