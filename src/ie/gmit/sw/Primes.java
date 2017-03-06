package ie.gmit.sw;

public class Primes {
	public static void main(String[] args) {
		//is_prime(7);
		Primes p = new Primes();
		System.out.println(p.isPrime(1997812117));
		
		PrimesSieve ps = new PrimesSieve();
		ps.isSievePrime(111);
	}
	//checks whether an int prime or not
//	boolean isPrime(int n) {
//	    for(int i=2; i < n; i++) {
//	    	System.out.println(i);
//	        if(n%i==0)
//	            return false;
//	    }
//	    return true;
//	}
	//in this method we multiple 2 x i, by doing this we reduce the number of 
	//comparisions by half 
//	boolean isPrime(int n) {
//	    for(int i = 2; 2*i < n; i++) {
//	    	System.out.println(i);
//	        if(n % i == 0)
//	            return false;
//	    }
//	    return true;
//	}
	
	boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i = 3; i*i <= n; i+=2) {
	    	System.out.println(i);
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	
}
