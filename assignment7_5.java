
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] myArray = new int[10];

    System.out.println("Please enter 10 numbers");

    for (int i = 0; i < myArray.length; i++) {
      myArray[i] = input.nextInt();
    }

    int evens = 0;

    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] % 2 == 0) {
        evens++;
      }
    }

    System.out.printf("There are %d numbers even and %d odd\n", evens, myArray.length - evens);
  }
}

