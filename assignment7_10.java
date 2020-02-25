import java.util.Arrays;

class Main {
  /*
   * Returns true if the given candidate number is prime, false otherwise.
   * Uses an array of existing primes smaller than candidate.
   * Because int[] primes is of length 1000, nrPrimes tells us how many
   * primes have been found.
   */
  static boolean isPrime(int candidate, int[] primes, int nrPrimes) {
    // Check the first half of existing primes for division candidates
    for (int i = 0; i < nrPrimes / 2; i++) {
      // Check if divisible
      if (candidate % primes[i] == 0) {
        return false;
      }
    }
    // Candidate is prime if we make it through the loop.
    return true;
  }

  /*
   * Finds the first 1000 prime numbers.
   */
  public static void main(String[] args) {
    int nrPrimes = 1;
    int[] primes = new int[1000];
    primes[0] = 2;
    int candidate = 3;

    // Keeps looping until we find 1000 primes.
    while (nrPrimes < 1000) {
      // If any candidate number is prime, add it to the primes array.
      if (isPrime(candidate, primes, nrPrimes)) {
        primes[nrPrimes] = candidate;
        nrPrimes += 1;
      }

      // We can increase the candidate by 2 so we don't have to check even numbers.
      candidate += 2;
    }

    System.out.println(Arrays.toString(primes));
  }
}

