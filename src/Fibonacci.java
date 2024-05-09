public class Fibonacci {
    public static void main(String[] args) {
        int count = 8;
        int first = 1, second = 1;

        System.out.print(first + " " + second + " ");
        for (int i = 3; i <= count; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second= next;
        }
    }
}
