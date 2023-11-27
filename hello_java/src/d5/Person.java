package d5;

/*
사람을 나타내는 클래스이다.
1. 사람은 이름('name'), 나이('age') 정보를 가질 수 있다
age() 라는 메서드를 가지고 있으며 호출되면 age += 1
name과 age에 대한 Getter 메서드
name을 인자로 전달하는 생성자
*/

public class Person {
    private final String name; // 이름, final을 붙이면 추가로 변경 어려움
    private int age; // 나이

    public Person(String name) {
        this.name = name;
        age = 0;
    }

    public void age() {
        age += 1;
        //return age;
    }

    public String getName() {
        return name;
    }

    public  int getAge() {
        return age;
    }

    // 인사하는 기능 -> "Hello, my name is <이름>!"
    public void hello() {
        System.out.println(String.format("Hello! My name is <%s>", name));
    }
}
