package d6.Person;

import d6.Person.Person;

public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void sayHello() {
        System.out.println(String.format("Hello! I'm %s, and studying %s!", getName(), major));
    }
}
