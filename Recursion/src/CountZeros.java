public class CountZeros {
    static void main() {
        int n = 100040;
        System.out.println(countzero(n));
    }
    static int countzero(int n) {
        return helper(n, 0);
    }
    static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n/10, count + 1);
        } else {
            return helper(n/10, count);
        }
    }
}
