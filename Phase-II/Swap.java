import java.util.Scanner;
public class Swap{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(a+" "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a+" "+b);
	}
}