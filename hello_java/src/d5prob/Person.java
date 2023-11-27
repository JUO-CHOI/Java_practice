package d5prob;

public class Person {
    private String name;
    private int age;

    // 생성자 메소드 : 클래스와 이름이 동일, 인자로 이름 받음
    public Person(String name) {
        this.age = 0; // 나이 0 으로 초기화
    }

    public void sayHello() {
        if (this.age >= 5) {
            System.out.println(String.format("Hello! My name is %s", this.name));
        }
        else {
            System.out.println("응애응애");
        }
    }

    public int age() {
        this.age += 1;
        return this.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
