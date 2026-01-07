public class BinarySearch2DArray {
    static void main() {
        int[] [] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        int target = 21;
        System.out.println(search(arr, target));
    }
    static boolean search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = rows * cols - 1;
        while (start<=end){
            int midVal = start+(end-start)/2;
            int r = midVal/cols;
            int c = midVal%cols;
            if (matrix[r][c]==target){
                return true;
            }
            if (matrix[r][c]<target){
                start = midVal+1;
            } else {
                end = midVal-1;
            }
        }
        return false;
    }
}
