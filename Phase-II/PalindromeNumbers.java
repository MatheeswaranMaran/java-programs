import java.util.Scanner;
public class PalindromeNumbers{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number to check whether the given is Palindrome or Not:");
		int n = s.nextInt();
		int org=n;
		int a,sum=0;
		while(org>0){
			a=org%10;
			sum=sum*10+a;
			org=org/10;
		}
		if(sum==n){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}