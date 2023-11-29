package d7.generics;

public class Main {
    public static void main(String[] args) {


        Integer[] intArray = {10, 20, 30};
        ArrayWrapper<Integer> integerArrayWrapper = new ArrayWrapper<>(intArray);
        System.out.println(integerArrayWrapper.contains(10));
        System.out.println(integerArrayWrapper.contains(15));
        System.out.println(integerArrayWrapper.length());

        Double[] doubleArray = {1.0, 2.0, 3.0, 4.5};
        ArrayWrapper<Double> doubleArrayWrapper = new ArrayWrapper<>(doubleArray);
        System.out.println(doubleArrayWrapper.contains(1.));

        System.out.println(contains(doubleArray, 2.3));
        System.out.println(contains(doubleArray, 2.));

        System.out.println(integerArrayWrapper.max());
        System.out.println(doubleArrayWrapper.max());
    }

    // 메소드에서 사용 시, 제어자 뒤, 반환타입 전
    public static <T> boolean contains(T[] source, T target) {
        for (T item : source) {
            if (item == null) continue;
            if (item.equals(target)) return true;
        }
        return false;
    }


}
