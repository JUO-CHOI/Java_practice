package d7.generics;

import java.io.Serializable;

// T : Type Parameter, T를 타입처럼 쓸 수 있다.
// 클래스를 매개변수로 받게 해준다.
// T extends <> : 제한된 타입 파라미터
public class ArrayWrapper<T extends Number & Comparable<T> & Serializable> {

    private T[]  array;

    public ArrayWrapper(T[] array) {
        if (array == null)
            throw new IllegalArgumentException("null array provided");
        this.array = array;
    }

    public int length() {
        return this.array.length;
    }

    public boolean contains(T target) { // T는 null이 될 수 있음
        for (T item : this.array) {
            if (item == null) continue;
            if (item.equals(target)) return true;
        }
        return false;
    }

    // 최댓값 최솟값은 어떻게..?
    public T max() {
        T max = this.array[0];
        for (T item : this.array) {
            if (item == null) continue;
            if (max == null) max = item;
            else if (item.compareTo(max) > 0) max = item;
        }
        return max;
    }
}
