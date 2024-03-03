import java.util.Scanner;
public class MultiplyTwoMatrices{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows of Matrix 1:");
		int r1 = s.nextInt();
		System.out.println("Enter the number of columns of Matrix 1:");
		int c1 = s.nextInt();
		System.out.println("Enter the number of rows of Matrix 2:");
		int r2 = s.nextInt();
		System.out.println("Enter the number of columns of Matrix 2:");
		int c2 = s.nextInt();
		int[][] m1 = new int[r1][c1];
		int[][] m2 = new int[r2][c2];
		int[][] mul= new int[r1][c2];
		if(c1!=r2){
			System.out.println("The given matrices cannot be multiplied");
		}
		else{
			System.out.println("Enter the Elements of the Matrix 1:");
			for(int i =0;i<r1;i++){
				for(int j=0;j<c1;j++){
					m1[i][j] = s.nextInt();
				}
			}
			System.out.println("Enter the Elements of the Matrix 2:");
			for(int i =0;i<r2;i++){
				for(int j=0;j<c2;j++){
					m2[i][j] = s.nextInt();
				}
			}
			System.out.println("The Product of Matrices A and B is ");
			for(int i = 0;i<r1;i++){
				for(int j = 0;j<c2;j++){
					for(int k = 0;k<r2;k++){
						mul[i][j]+=m1[i][k]*m2[k][j];
					}
					System.out.print(mul[i][j]+" ");
				}
				System.out.println("");
			}
		}
	}
}
		