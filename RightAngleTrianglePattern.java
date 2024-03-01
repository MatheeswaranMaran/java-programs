import java.util.Scanner;
public class RightAngleTrianglePattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int n = s.nextInt();
		int i,j;
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
}