import java.util.Scanner;

public class ReadingInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 10) {
            System.out.print("Enter number #" + (count + 1) + ": ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");
                scanner.next(); // to clear the invalid input
            }
        }

        System.out.println("Sum of the 10 numbers is: " + sum);
        scanner.close();
    }
}
