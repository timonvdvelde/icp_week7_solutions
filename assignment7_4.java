import java.util.Scanner;

class Main {
  static double average(int[] array) {
    double sum = 0;

    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }

    return sum / array.length;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] myArray = new int[10];

    System.out.println("Please enter 10 numbers");

    for (int i = 0; i < myArray.length; i++) {
      myArray[i] = input.nextInt();
    }

    double average = average(myArray);

    int count = 0;

    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] > average) {
        count++;
      }
    }

    System.out.printf("There are %d numbers larger than %.2f\n", count, average);

  }
}

