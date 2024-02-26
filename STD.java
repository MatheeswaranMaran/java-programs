import java.util.Scanner;
public class STD{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number to sum the digits:");
		long number = s.nextLong();
		long n = number;
		long sum = 0;
		long a;
		while(n>0){
			a = n%10;
			sum += a;
			n /= 10;
		}
		System.out.println("The sum of the digits of the number "+number+" is "+sum);
	}
}