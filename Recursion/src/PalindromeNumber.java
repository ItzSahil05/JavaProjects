public class PalindromeNumber {
    static void main() {
        int n = 45654;
        System.out.println(palin(n));
    }
    static int helper(int n) {
        int digit = (int) Math.log10(n) + 1;
        return reverse(n, digit);
    }
    private static int reverse(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digit - 1) + reverse(n / 10, digit - 1);
    }
    static boolean palin(int n) {
        return n == helper(n);
    }
}
