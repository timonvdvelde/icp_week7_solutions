import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] myArray = new int[10];

    System.out.println("Please enter 10 numbers");

    // Ask user for 10 numbers.
    for (int i = 0; i < myArray.length; i++) {
      myArray[i] = input.nextInt();
    }
   
    // Give it a value from the array. This is better than
    // setting to 0 in case numbers in array are negative.
    int maximum = myArray[0];

    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] > maximum) {
        maximum = myArray[i];
      }
    }
    
    System.out.printf("Maximum value is: %d\n", maximum);
  }
}

