public class DivBy2And3{
	public static void main(String[] args){
		System.out.println("The numbers divisible by 2 and 3 between 1 and 100 is:");
		for(int i=1;i<=100;i++){
			if(i%6==0){
				System.out.print(i+" ");
			}
		}
	}
}
