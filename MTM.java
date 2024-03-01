import java.util.Scanner;
public class MTM {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r1 = s.nextInt();
		int c1 = s.nextInt();
		int r2 = s.nextInt();
		int c2 = s.nextInt();
		int[][] m1 = new int[r1][c1];
		int[][] m2 = new int[r2][c2];
		if(c1!=r2){
			System.out.println("Cannot be multiplied");
		}
		else{
			int[][] m3 = new int[r1][c2];
			for(int i = 0;i<r1;i++){
				for(int j = 0;j<c1;j++){
					m1[i][j] = s.nextInt();
				}
			}
			for(int i = 0;i<r2;i++){
				for(int j = 0;j<c2;j++){
					m2[i][j] = s.nextInt();
				}
			}
			for(int i =0;i<r1;i++){
				for(int j =0;j<c2;j++){
					m3[i][j]=0;
					for(int k = 0;k<r2;k++){
						m3[i][j]+=m1[i][k]*m2[k][i];
					}
				}
			}
			for(int i = 0;i<r1;i++){
				for(int j =0;j<c2;j++){
					System.out.print(m3[i][j]+" ");
				}
				System.out.println("");
			}
		}
	}

}
