package ie.gmit.sw;

import java.util.Arrays;

public class PrimesSieve {

	// will contain true or false values for the first 10,000 integers
	boolean[] primes = new boolean[10000];
	
	public void fillSieve() {
	    Arrays.fill(primes,true);        // assume all integers are prime.
	    primes[0] = primes[1] = false;       // we know 0 and 1 are not prime.
	    for (int i=2;i<primes.length;i++) {
	        //if the number is prime,
	        //then go through all its multiples and make their values false.
	        if(primes[i]) {
	            for (int j=2;i*j<primes.length;j++) {
	                primes[i*j]=false;
	            }
	        }
	    }
	}
	public boolean isSievePrime(int n) {
	    return primes[n]; //simple, huh?
	}
}
