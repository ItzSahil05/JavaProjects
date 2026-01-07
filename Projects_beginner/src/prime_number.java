public class prime_number {
    static void main() {
        int a = 49;
        System.out.println(isPrime(a));
    }
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int b = 2;
        while (b * b  <= n){
            if (n % b == 0) {
                return false;
            } else {
                b++;
            }
        }
        return true;
    }
}
