package ie.gmit.sw;

public class Primes {
	public static void main(String[] args) {
		//is_prime(7);
		Primes p = new Primes();
		System.out.println(p.isPrime(1111));
	}
	boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
}
