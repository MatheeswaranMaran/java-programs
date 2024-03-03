public class First100Even{
	public static void main(String[] args){
		int count=0,n=1;
		while(count<100){
			if(n%2==0){
				System.out.print(n+" ");
				count++;
			}
			n++;
		}
	}
}
