import java.util.Arrays;
import java.util.Scanner;

class Main {
  /*
   * Returns an array of length 10, each index containing the number
   * of times that digit appeared in the given array. Essentially an
   * array of counters.
   */
  static int[] countDigits(int[] array, int nrValues) {
    int[] counts = new int[10];

    // For each digit we find, add one to the matching counter.
    for (int i = 0; i < nrValues; i++) {
      counts[array[i]]++;
    }

    return counts;
  }

  /*
   * Creates and returns an array twice the length of the original array. 
   * The new array contains everything of the original array.
   */
  static int[] makeBigger(int[] array) {
    int[] newArray = new int[array.length * 2];

    // Copy array
    for(int i = 0; i < array.length; i++) {
      newArray[i] = array[i];
    }

    return newArray;
  }

  public static void main(String[] args) {
    int newNumber;
    int index = 0;
    int[] array = new int[10];
    Scanner input = new Scanner(System.in);

    System.out.println("Please put positive integers between 0 and 9."
        + " Input ends with -1.");
    newNumber = input.nextInt();

    // Keep asking for input until given the number -1
    while (newNumber != -1) {
      array[index] = newNumber;
      index++;

      // If our array becomes too small, make a bigger one.
      if (index == array.length) {
        array = makeBigger(array);
      }

      newNumber = input.nextInt();
    }

    // Count the digits, print the results.
    System.out.println("Counting");
    int[] counts = countDigits(array, index);
    System.out.println(Arrays.toString(array));
    System.out.println(Arrays.toString(counts));

  }
}

