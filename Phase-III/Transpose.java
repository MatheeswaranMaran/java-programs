import java.util.Scanner;
class Transpose {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = s.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The Transposed Matrix of the given Matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}