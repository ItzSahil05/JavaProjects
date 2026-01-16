public class SearchRotatedArrayDuplicate {
    static void main() {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(findElement(arr, target));
    }
    static int findElement(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int midValue = start+(end-start)/2;
            if (nums[midValue]==target){
                return midValue;
            }
            if (nums[midValue]==nums[start] && nums[midValue]==nums[end]) {
                start++;
                end--;
            }
            else if (nums[start]<=nums[midValue]) {
                if (target>=nums[start] && target<nums[midValue]) {
                    end = midValue-1;
                } else {
                    start = midValue+1;
                }
            }
            else {
                if (target>nums[midValue] && target<=nums[end]){
                    start = midValue+1;
                } else {
                    end = midValue-1;
                }
            }
        }
        return -1;
    }
}
