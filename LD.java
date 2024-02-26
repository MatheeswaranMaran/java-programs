import java.util.Scanner;
public class LD
{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = a%10;
		System.out.println("The last digit of the number "+a+" is "+b);
	}
}