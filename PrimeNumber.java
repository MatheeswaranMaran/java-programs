public class PrimeNumber {
	public static void main(String[] args) {
		int n,j;
		n=100;
		for(j=1;j<=n;j++){
			if(isPrime(j)){
				System.out.println(j+" is Prime");
			}
			else{
				System.out.println(j+" is not Prime");
			}
		}
	}
	static boolean isPrime(int n){
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}