class Main {
  /*
   * Returns average value of given integer array.
   */
  static double average(int[] array) {
    double sum = 0;

    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }

    return sum / array.length;
  }

  /*
   * Returns average value of given double array.
   */
  static double average(double[] array) {
    double sum = 0;

    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }

    return sum / array.length;
  }

  /*
   * 
   */
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4};
    double[] array2 = {1.5, 2.5, 3, 4};
    System.out.println(average(array1));
    System.out.println(average(array2));
  }
}

