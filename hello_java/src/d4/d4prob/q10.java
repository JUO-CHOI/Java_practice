package d4.d4prob;

/*int[]을 두개 받아,
두 배열이 합쳐진 배열을 반환하는 메서드를 작성하시오. */

public class q10 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] resultArr = combineArr(arr1, arr2);
        for (int num : resultArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] combineArr(int[] arr1, int[] arr2) {
        int[] resultArr = new int[arr1.length + arr2.length];
        // 1번 배열 먼저 합치기
        for (int i = 0; i < arr1.length; i++) {
            resultArr[i] = arr1[i];
        }
        // 2번 배열 합치기
        for (int i = 0; i < arr2.length; i++) {
            resultArr[arr1.length + i] = arr2[i];
        }
        return resultArr;
    }
}
