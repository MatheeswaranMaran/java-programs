import java.util.Scanner;
public class FirstNEven{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter a number:");
		int n = s.nextInt();
		System.out.println("The even numbers between 1 and "+n+" is:");
		for(int i=1;i<=n;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}
