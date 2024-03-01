import java.util.Arrays;
import java.util.Scanner;
public class MaxAndMin{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] array = new int[size];
		for(int i =0;i<size;i++){
			array[i] = s.nextInt();
		}
		int max = array[0];
		for(int i = 1;i<size;i++){
			if(array[i]>max){
				max = array[i];
			}
		}
		System.out.println("The maximum value of the array is "+max);
		int min = array[0];
		for(int i = 1;i<size;i++){
			if(array[i]<min){
				min = array[i];
			}
		}
		System.out.println("The minimum value of the array is "+min);
	}
}