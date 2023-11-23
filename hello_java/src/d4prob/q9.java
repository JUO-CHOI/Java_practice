package d4prob;

/* int[]을 인자로 받아,

1. 배열의 값들 중 최댓값의 위치를 반환하는 "maxWhere"
2. 배열의 값들 중 최솟값의 위치를 반환하는 "minWhere"
3. 배열의 값들 중 최댓값과 최솟값의 차이를 반환하는 "maxDiff"

메서드를 각각 작성하시오. */

public class q9 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 15, 6, 19, 13, 27, 0, -1, -32, 5};

        System.out.println(maxWhere(nums));
        System.out.println(minWhere(nums));
        System.out.println(maxDiff(nums));
    }

    public static int maxWhere(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                count = i;
            }
        }
        return count;
    }
    public static int minWhere (int[] nums) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                count = i;
            }
        }
        return count;
    }

    public static int maxDiff(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return max - min;
    }
}
