import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] myArray = new int[10];

    System.out.println("Please enter 10 numbers");

    // Read 10 integers.
    for (int i = 0; i < myArray.length; i++) {
      myArray[i] = input.nextInt();
    }

    double sum = 0, average = 0;

    // Add each value in the array to the sum.
    for (int i = 0; i < myArray.length; i++) {
      sum += myArray[i];
    }

    // Divide sum by number of elements.
    average = sum / myArray.length;

    System.out.printf("Average is %.2f\n", average);
  }
}

