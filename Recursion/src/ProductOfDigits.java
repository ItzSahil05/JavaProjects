public class ProductOfDigits {
    static void main() {
        int n = 152;
        System.out.println(product(n));
    }
    static int product(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * product(n / 10);
    }
}
