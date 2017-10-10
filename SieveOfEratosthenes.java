package sieve_of_eratosthenes;

public class SieveOfEratosthenes {
	
	int myNumber;
	boolean[] primes;
	
	public SieveOfEratosthenes(int theNumber) {
		myNumber = theNumber;
		//we're using the index as the number.
		//true means the number is prime
		primes = new boolean[myNumber + 1];
	}
	
	public void start() {
		
		//initialize the array from 0 to n
		for (int i = 0; i < myNumber; i++) {
			primes[i] = true;
		}
		
		for (int p = 2; p * p <= myNumber; p++) {
			//if p is unmarked,
			if (primes[p] == true) {
				//then p is prime.
				//thus, for all multiples of p, mark them as non prime.
				for (int i = p; i * p <= myNumber; i++) {
					//false means the number is not prime
					primes[i * p] = false;
				}
			}
		}
		
		for (int i = 2; i < primes.length; i++) {
			//print out the prime numbers.
			//for loop starts at 2 to handle the 0, 1 case.
			if (primes[i] == true)
				System.out.print(i + " ");
		}
	}
	
	//a driver method to test the program.
	public static void main(String[] args) {
		SieveOfEratosthenes s = new SieveOfEratosthenes(100);
		s.start();
	}
}


