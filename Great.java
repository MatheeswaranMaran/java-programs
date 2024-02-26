import java.util.Scanner;
public class Great
{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int g = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println("The greatest number among three numbers is "+g);
	}
}