package d5prob;

public class Q1Main {
    public static void main(String[] args) {
        Person me = new Person("Juo Choi");
        System.out.println(me.getName());
        for (int i = 0; i < 10; i++) {
            System.out.println(me.age()); // 나이 한살 추가
            System.out.println(me.getAge()); // 현재 나이
            me.sayHello(); // 나이에 따른 인사
        }
    }
}
