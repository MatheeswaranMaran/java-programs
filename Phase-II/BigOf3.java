import java.util.Scanner;
public class BigOf3{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter A:");
		int a = s.nextInt();
		System.out.println("Enter B:");
		int b = s.nextInt();
		System.out.println("Enter C:");
		int c = s.nextInt();
		if(a>b){
			if(a>c){
				System.out.println(a+" is the greatest number.");
			}
			else{
				System.out.println(c+" is the greatest number.");
			}
		}
		else{
			if(b>c){
				System.out.println(b+" is the greatest number.");
			}
			else{
				System.out.println(c+" is the greatest number.");
			}
		}
	}
}
