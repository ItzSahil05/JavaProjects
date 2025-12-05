public class NoOfRotations {
    static void main() {
        int[] arr = {3,4,5,1,2,2};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while (start<end) {
            int midValue = start+(end-start)/2;
            if (nums[midValue]>nums[end]) {
                start = midValue+1;
            } else if (nums[midValue]<nums[end]) {
                end = midValue;
            } else {
                end--;
            }
        }
        return start;
    }
}
