import java.util.Scanner;
public class CountTheDigits{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter A:");
		int a = s.nextInt();
		int count=0;
		int n = a;
		while(n>0){
			n/=10;
			count++;
		}
		System.out.println(count+" is the number of digits in "+a);
	}
}
