package ie.gmit.sw;

public class Primes {
	public static void main(String[] args) {
		//is_prime(7);
		Primes p = new Primes();
		System.out.println(p.isPrime(137));
	}
	//checks whether an int prime or not
	boolean isPrime(int n) {
	    for(int i=2; i < n; i++) {
	    	System.out.println(i);
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	//in this method we multiple 2 x i 
//	boolean isPrime(int n) {
//	    for(int i = 2; 2*i < n; i++) {
//	    	System.out.println(i);
//	        if(n % i == 0)
//	            return false;
//	    }
//	    return true;
//	}
}
