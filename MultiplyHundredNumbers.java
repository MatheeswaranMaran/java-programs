import java.util.Scanner;
public class MultiplyHundredNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit of the product of n numbers:");
		int limit = s.nextInt();
		long pro =1;
		int i=1;
		while(i<limit){
			pro = pro * i;
			i++;
		}
		System.out.println("The product of the first "+limit+" natural numbers is "+pro);
	}
}