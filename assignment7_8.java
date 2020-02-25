import java.util.Arrays;

class Main {
  /*
   * Modifies given array so that its contents are reversed
   */
  static void reverse(int[] array) {
    int[] arrayCopy = new int[array.length];

    // First copy array into new array.
    for (int i = 0; i < array.length; i++) {
      arrayCopy[i] = array[i];
    }

    int j = 0;

    // Then copy the numbers back in reverse order.
    for (int i = array.length - 1; i >= 0; i--) {
      array[j] = arrayCopy[i];
      j++;
    }
  }

  /*
   * Prints some array, then the same array but reversed.
   */
  public static void main(String[] args) {
    // Example array, prints original, then reversed.
    int[] numbers = {1, 2, 3, 4, 5, 6};
    System.out.println(Arrays.toString(numbers));
    reverse(numbers);
    System.out.println(Arrays.toString(numbers));
  }
}

