import java.util.Arrays;
public class LinearSearch2DArray {
    static void main() {
        int[] [] arr = {
                {5, 10, 15, 20},
                {11, 16, 21, 26},
                {17, 22, 27, 31},
                {23, 25, 32, 35}
        };
        int target = 25;
        System.out.println(search(arr, target));
    }
    static boolean search(int[] [] matrix, int target){
        int r = 0;
        int c = matrix[0].length-1;
        while (r < matrix.length && c >= 0){
            if (matrix[r][c] == target){
                return true;
            }
            if (matrix[r][c] < target){
                r++;
            } else {
                c--;
            }
        }
        return false;
    }
}
