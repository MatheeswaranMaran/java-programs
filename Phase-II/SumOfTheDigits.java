import java.util.Scanner;
public class SumOfTheDigits{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter A:");
		int a = s.nextInt();
		int sum=0,n;
		int org = a;
		while(org>0){
			n=org%10;
			sum+=n;
			org=org/10;
		}
		System.out.println(sum+" is the sum of digits in "+a);
	}
}
