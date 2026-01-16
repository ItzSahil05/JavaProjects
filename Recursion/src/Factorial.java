public class Factorial {
    static void main() {
        int n = 5;
        System.out.println(fact(n));
    }
    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
