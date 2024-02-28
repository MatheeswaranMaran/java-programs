import java.util.Scanner;
class CTF{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int count =0;
		for(int i=1;i<=a;i++){
			if(a%i==0){
				count++;
			}
		}
		System.out.println("The count of the factors of the number "+a+" is "+count);
	}
}
		