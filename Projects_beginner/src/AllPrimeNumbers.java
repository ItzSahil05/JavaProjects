public class AllPrimeNumbers {
    static void main() {
        int n = 30;
        boolean[] prime = new boolean[n + 1];
        sieveEratosthenes(n, prime);
    }
    // false means prime number
    static void sieveEratosthenes(int n, boolean[] prime){
        for (int i = 2; i*i <= n; i++) {
            if (!prime[i]) {
                for (int j = i*2; j < n; j+=i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!prime[i]){
                System.out.print(i + ", ");
            }
        }
    }
}
