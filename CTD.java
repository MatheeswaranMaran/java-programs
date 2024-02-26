import java.util.Scanner;
public class CTD{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number to count the digits:");
		long number = s.nextLong();
		long n = number;
		int count = 0;
		while(n>0){
			n /= 10;
			count++;
		}
		System.out.println("The digit count of the number "+number+" is "+count);
	}
}