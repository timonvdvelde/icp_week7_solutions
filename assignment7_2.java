
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

    // Loop from the end of the array to the beginning to print.
    for (int i = myArray.length-1; i >= 0; i--) {
      System.out.printf("%d ", myArray[i]);
    }

    System.out.println();
    

  }
}
