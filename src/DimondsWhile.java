public class DimondsWhile {
    public static void main(String[] args) {
        int n = 7;
        int i = 1;
        int a, b;

        while (i <= n) {
            a = 1;
            while (a <= n - i) {
                System.out.print(" ");
                a++;
            }
            b = 1;
            while (b <= 2 * i - 1) {
                System.out.print("*");
                b++;
            }
            System.out.println();
            i++;
        }
        i = n - 1;
        while (i >= 1) {
            a = 1;
            while (a <= n - i) {
                System.out.print(" ");
                a++;
            }

            b = 1;
            while (b <= 2 * i - 1) {
                System.out.print("*");
               b++;
            }

            System.out.println();
            i--;
        }
    }


}
