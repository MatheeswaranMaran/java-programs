import java.util.Scanner;
public class SLD
{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int c = a/10;
		int b = c%10;
		System.out.println("The second last digit of the number "+a+" is "+b);
	}
}