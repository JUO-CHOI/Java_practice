package d6;

// 강사 만들고 (이름, 주제) 인사
public class Lecturer extends Person {
    private String title;

    public Lecturer(String name, int age, String title) {
        super(name, age);
        this.title = title;
    }

    @Override
    public void sayHello() {
        System.out.println(String.format("Hello! I'm %s, and teaching %s!", getName(), title));
    }
}
