public class PrintNumbers {
    static void main() {
        int n = 9;
        num(n);
    }
    static void num(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        num(n-1);
        System.out.print(n + " ");
    }
}
