package d6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PersonMain {
    public static void main(String[] args) {
        Person alex = new Student("Alex", 20, "CSE");
        alex.sayHello();

        Person bred = new Student("Bred", 21, "CSE");
        bred.sayHello();

        Person tom = new Lecturer("Tom", 50,"CSE");
        tom.sayHello();

        Person dave = new Student("Dave", 25, "CSE");
        Person eric = new Student("Eric", 23, "MD");

        System.out.println("------------------------------");

        Person[] people = {alex, bred, tom};
        for (Person person : people) {
            person.sayHello();
        }

        System.out.println("------------------------------");

        people = new Person[] {alex, bred, tom, dave, eric};
        Arrays.sort(people); // 나이순 정렬
        for (Person person : people) {
            person.sayHello();
        }
    }
}
