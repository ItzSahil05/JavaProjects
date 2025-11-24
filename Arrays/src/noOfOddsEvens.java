public class noOfOddsEvens {
        static void main() {
            int[] arr = {12, 45, 52, 45, 32};
            System.out.println(evennums(arr)+" even numbers");
            System.out.println(oddnums(arr)+" odd numbers");
        }
        static int evennums(int[]arr) {
            int evens = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]%2==0){
                evens+=1;
                }
            }
            return evens;
        }
        static int oddnums(int[]arr) {
            int odds = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]%2!=0){
                odds+=1;
                }
            }
            return odds;
        }
}
