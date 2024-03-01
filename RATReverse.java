import java.util.Scanner;
public class RATReverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j;
		for(i=1;i<=n;i++){
			for(j=n;j>=i;j--){
				System.out.print('*');
			}
			System.out.println();
		}


	}

}
