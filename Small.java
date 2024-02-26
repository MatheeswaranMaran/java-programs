import java.util.Scanner;
public class Small
{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int sm = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
		System.out.println("The smallest number among three numbers is "+sm);
	}
}