import java.util.Scanner;
public class AscendingDescending{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter N:");
		int n = s.nextInt();
		System.out.println("The ascending order of first "+n+" numbers is: ");
		for(int i=1;i<=n;i++){
			System.out.print(i+" ");
		}
		System.out.println("\nThe descending order of first "+n+" numbers is: ");
		for(int i=n;i>=1;i--){
			System.out.print(i+" ");
		}
	}
}
