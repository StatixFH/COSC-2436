import java.util.Scanner;

public class AddingRecursively {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int firstInt, secondInt;

            // prompt user for first integer
            System.out.print("enter first integer: ");
            firstInt = scanner.nextInt();

            // prompt user for second integer, ensure it is larger than the first
            do {
                System.out.print("enter second integer, larger than the first: ");
                secondInt = scanner.nextInt();
            } while (secondInt <= firstInt);

            // calculate sum using recursive method
            int sum = calcSum(firstInt, secondInt);

            // display result
            System.out.println("the sum of integers from " + firstInt + " to " + secondInt + " is: " + sum);

            // ask user to continue
            System.out.print("\nwould you like to continue with new integers? (yes/no): ");
            String continueInput = scanner.next();

            if (!continueInput.equalsIgnoreCase("yes")) {
                // if user doesn't continue, exit loop
                break;
            }
        }

        // close scanner
        scanner.close();
    }

    // use recursive method to calculate sum
    public static int calcSum(int low, int high) {
        if (low == high) {
            return low;
        } else {
            return high + calcSum(low, high - 1);
        }
    }
}