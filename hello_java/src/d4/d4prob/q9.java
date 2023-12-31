package d4.d4prob;

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
        int max = Integer.MIN_VALUE; // 초기 비교 대상, 그냥 첫번째 숫자 넣어줘도 됨 nums[0];
        int index = 0; // 위치
        for (int i = 0; i < nums.length; i++) {
            // 더 큰 숫자 발견, 인덱스 저장
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        // for문이 끝나면 index에 최댓값 위치 저장
        return index;
    }
    public static int minWhere (int[] nums) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                index = i;
            }
        }
        return index;
    }

    public static int maxDiff(int[] nums) {
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > max) {
//                max = nums[i];
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < min) {
//                min = nums[i];
//            }
//        }
//        return max - min;
        // 위 메소드를 호출하자!!
        return nums[maxWhere(nums)] - nums[minWhere(nums)]; // 각각 for 한번씩
    }
}
