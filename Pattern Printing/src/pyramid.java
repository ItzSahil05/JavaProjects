public class pyramid {
    static void main() {
        int n = 5;
        for (int i = 1; i<=n; i++) {
            for (int k = n; k>=i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
