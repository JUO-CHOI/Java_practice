package d7.collections;

import java.util.Objects;

/*
* 비둘기집 원리
* 비둘기가 들어갈 수 있는 집이 10개
* 비둘기가 25마리라면 누군가는 한 방에 두마리 이상이 들어간다.
* */
public class Pigeon {
    private int age;

    public Pigeon(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pigeon pigeon = (Pigeon) o;
        return age == pigeon.age;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(age);
    }
}
