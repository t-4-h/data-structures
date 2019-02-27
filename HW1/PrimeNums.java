
public class PrimeNums {



public static void main(String args[]) {
	
//STEP 1	
int count = 0;
long start = System.nanoTime();
for(int number = 2; number <= 10000; number++){
	
	if(isPrime(number)){
    count = count + 1;
    }
    
}
      System.out.println("STEP 1");
      System.out.println("Primes Found = " +count);
      System.out.println("Seconds taken = " +(System.nanoTime() - start) / 1000000000.0);
      System.out.println();
     
//STEP 2
count = 0;
start = System.nanoTime();
for(int number = 2; number <= 20000; number++){

	if(isPrime(number)){
	count = count + 1;
	}

}
  System.out.println("STEP 2");
  System.out.println("Primes Found = " +count);
  System.out.println("Seconds taken = " +(System.nanoTime() - start) / 1000000000.0);
  System.out.println();

//STEP 3
count = 0;
start = System.nanoTime();
for(int number = 2; number <= 30000; number++){

	if(isPrime(number)){
	count = count + 1;
	}

}
  System.out.println("STEP 3");
  System.out.println("Primes Found = " +count);
  System.out.println("Seconds taken = " +(System.nanoTime() - start) / 1000000000.0);
  System.out.println();

//STEP 4
count = 0;
start = System.nanoTime();
for(int number = 2; number <= 40000; number++){

	if(isPrime(number)){
	count = count + 1;
	}

}
  System.out.println("STEP 4");
  System.out.println("Primes Found = " +count);
  System.out.println("Seconds taken = " +(System.nanoTime() - start) / 1000000000.0);
  System.out.println();

//STEP 5
count = 0;
start = System.nanoTime();
for(int number = 2; number <= 50000; number++){

	if(isPrime(number)){
	count = count + 1;
	}

}
  System.out.println("STEP 5");
  System.out.println("Primes Found = " +count);
  System.out.println("Seconds taken = " +(System.nanoTime() - start) / 1000000000.0);
  System.out.println();

//STEP 6
count = 0;
start = System.nanoTime();
for(int number = 2; number <= 60000; number++){

	if(isPrime(number)){
	count = count + 1;
	}

}
  System.out.println("STEP 6");
  System.out.println("Primes Found = " +count);
  System.out.println("Seconds taken = " +(System.nanoTime() - start) / 1000000000.0);
  System.out.println();

//STEP 7
count = 0;
start = System.nanoTime();
for(int number = 2; number <= 70000; number++){

	if(isPrime(number)){
	count = count + 1;
	}

}
  System.out.println("STEP 7");
  System.out.println("Primes Found = " +count);
  System.out.println("Seconds taken = " +(System.nanoTime() - start) / 1000000000.0);
  System.out.println();

//STEP 8
count = 0;
start = System.nanoTime();
for(int number = 2; number <= 80000; number++){

	if(isPrime(number)){
	count = count + 1;
	}

}
  System.out.println("STEP 8");
  System.out.println("Primes Found = " +count);
  System.out.println("Seconds taken = " +(System.nanoTime() - start) / 1000000000.0);
  System.out.println();

//STEP 9 
count = 0;
start = System.nanoTime();
for(int number = 2; number <= 90000; number++){

	if(isPrime(number)){
	count = count + 1;
	}

}
  System.out.println("STEP 9");
  System.out.println("Primes Found = " +count);
  System.out.println("Seconds taken = " +(System.nanoTime() - start) / 1000000000.0);
  System.out.println();

//STEP 10
count = 0;
start = System.nanoTime();
for(int number = 2; number <= 100000; number++){

	if(isPrime(number)){
	count = count + 1;
	}

}
  System.out.println("STEP 10");
  System.out.println("Primes Found = " +count);
  System.out.println("Seconds taken = " +(System.nanoTime() - start) / 1000000000.0);
  System.out.println();
}

//CHECK IF PRIME
 public static boolean isPrime(int number){
	 for(int i=2; i<number; i++){
		 if(number%i == 0){
			 return false; //not prime
           }
        }
	 return true; //prime
    }
}
