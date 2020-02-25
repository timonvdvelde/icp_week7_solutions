import java.util.Arrays;

class Main {
  /*
   * Returns a random array of the given size, where are all the numbers
   * are between low and high.
   */
  static double[] randomArray(int size, double low, double high) {
    double[] array = new double[size];

    // Generate random numbers between low and high.
    for (int i = 0; i < array.length; i++) {
      array[i] = Math.random() * (high-low) + low;
    }

    return array;
  }

  /*
   * Generates and prints a random array.
   */
  public static void main(String[] args) {
    double[] array = randomArray(10, 2, 8);
    System.out.println(Arrays.toString(array));
  }
}

