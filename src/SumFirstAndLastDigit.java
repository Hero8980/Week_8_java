public class SumFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252)); // Should print 4
        System.out.println(sumFirstAndLastDigit(257)); // Should print 9
        System.out.println(sumFirstAndLastDigit(0));   // Should print 0
        System.out.println(sumFirstAndLastDigit(5));   // Should print 10
        System.out.println(sumFirstAndLastDigit(-10)); // Should print -1
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = lastDigit;

        while (number >= 10) {
            number /= 10;
            firstDigit = number;
        }

        return firstDigit + lastDigit;
    }
}
