import java.util.Scanner;
class SumOfNNumbers{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		System.out.println("The sum of first "+n+" numbers is "+sum);
	}
}