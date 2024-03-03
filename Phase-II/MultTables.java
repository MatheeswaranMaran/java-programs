import java.util.Scanner;
public class MultTables{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for which the tables is required: ");
		int n = s.nextInt();
		for(int i = 1;i<=20;i++){
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}