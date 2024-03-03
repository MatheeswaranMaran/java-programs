import java.util.Scanner;
public class OddEvenCount{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter a number:");
		int n = s.nextInt();
		int countodd=0;
		int counteven=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				counteven++;
				System.out.println(i+" is even.");
			}
			else{
				countodd++;
				System.out.println(i+" is odd.");
			}
		}
		System.out.println("The count of odd numbers in "+n+" is "+countodd);
		System.out.println("The count of even numbers in "+n+" is "+counteven);
	}
}
