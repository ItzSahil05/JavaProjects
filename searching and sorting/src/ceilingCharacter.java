public class ceilingCharacter {
    static void main() {
        char[] arr = {'a', 'b', 'c', 'd'};
        char target = 'a';
        char ans = ceilingChar(arr,target);
        System.out.println(ans);
    }
    static char ceilingChar(char[] arr, char target) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int midVal = start+(end-start)/2;
            if (target<arr[midVal]){
                end = midVal-1;
            } else {
                start = midVal+1;
            }
        }
        return (start==arr.length)? arr[start%arr.length]:arr[start];
    }
}
