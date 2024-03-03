import java.util.Scanner;
public class Fibonacci{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of series:");
		int n = s.nextInt();
		int a=0,b=1,c;
		System.out.println("The fibonacci series of "+n+" numbers is:");
		System.out.print(a+" "+b+" ");
		for(int i=2;i<=n;i++){
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
		