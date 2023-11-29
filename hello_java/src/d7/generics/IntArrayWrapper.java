package d7.generics;

/*
* 정수 배열을 가지고 있고
* 그 정수 배열에 대한 정보를
* 제공하는 목적의 배열 편의성 클래스*/

public class IntArrayWrapper {
    private final int[] intArray;

    public IntArrayWrapper(int[] intArray) {
        this.intArray = intArray;
    }

    // 1. intArray의 길이를 반환하는 메소드
    public int arrayLength() {
        return this.intArray.length;
    }

    // 2. 주어진 int target이 intArray에 존재하는지 반환하는 메소드
    public boolean isTarget(int target) {
        for (int num : this.intArray) {
            if (target == num)
                return true;
        }
        return false;
//        for (int i = 0; i < intArray.length; i++) {
//            if (target == intArray[i]) return true;
//        }
//        return false;
    }

    // 3. intArray의 원소 중 최댓값
    public int maxValue() {
        int max = Integer.MIN_VALUE;
        // int max = this.intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (max < intArray[i])
                max = intArray[i];
            // max = Math.max(nuber, max);
        }
        return max;
    }
}
