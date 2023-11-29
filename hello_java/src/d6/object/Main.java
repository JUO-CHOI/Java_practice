package d6.object;

public class Main {
    public static void main(String[] args) {
        // Person으로 선언했을 때 사용범위가 더 넓음
        // 동류의 객체라는걸 보여줌
        Person alex = new Student("Alex", 25, "CSE");
        Person bred = new Lecturer("Brad", 40, "Generics");
        Person alex2 = new Student("Alex", 25, "CSE");
        Person alex3 = new Lecturer("Alex", 25, "Korean");

        int a = 0;
        // 수많은 계산이 진행된다.
        // 이후 int a가 얼마인지 확인하려면?
        System.out.println(a);

        // 그렇다면 alex에 어떤값이 있는지는 Gette를 쓰겠지만
        System.out.println(alex);
        System.out.println(bred);
        // alex.getMajor();

        System.out.println(alex == alex2);
        // == 는 데이터의 값을 기준으로 비교
        // 참조타입(String, 배열, 객체 등) 변수는 데이터 주소값을 저장 -> 동일한 객체만 같다고 판단
        // equals를 override해서 사용하자
        System.out.println(alex.equals(alex2));
        System.out.println(alex.equals(alex3));
        System.out.println(alex3.equals(alex));

        System.out.println("------------------");

        Person noName = new Student();
        System.out.println(noName.getName());
        System.out.println(noName.getAge());
        System.out.println(noName.getName().equals("Alex"));
        // noName.getName() = String -> equals 사용 (Person의 equals 아님!)
        // 그러나 null의 경우 String이 아니기에 에러!

    }

    public static void printPerson(Person person) {
        System.out.println(person);
    }
}
