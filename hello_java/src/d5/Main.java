package d5;

// 같은 패키지 안에 있다면 import 안해도 됨

public class Main {
/*    public static void main(String[] args) {
        Car myCar = new Car(); // 클래스의 객체를 만드는 행위태

        // 객체에 정보 넣기
        //myCar.count += 1;
        Car.count +=1; // Car 클래스에 속한 속성
        myCar.brand = "Kia";
        myCar.name = "K5";
        myCar.fuel = 72;
        myCar.beep();
        myCar.printInfo();
        myCar.drive(10);
        System.out.println(myCar.count);

        Car car = new Car();
        Car.count += 1;
        car.brand = "Hyundai";
        car.name = "Sonata";
        car.fuel = 80;
        car.beep();
        car.printInfo();
        car.drive(20);
        System.out.println(car.count);

        System.out.println("------------------");

        // 사람의 이름과 체온을 적는 배열을 만들 때
        // Person이라는 클래스를 이용해 me 객체 만들음 만들고 me.name, me.temperature 정의
        Person me = new Person(); // 객체 선언
        me.name = "Juo Choi";
        me.age = 26;
        System.out.println(me.name);
        System.out.println(me.age);
        me.hello();
        System.out.println("------------------");

        Car someCar = new Car();
        Car.count += 1;
        someCar.name = "K3";
        someCar.brand = "Kia";
        someCar.fuel = 60;
        someCar.printInfo();

        someCar.brand = "Mercedes-Benz";
        someCar.name = "E-Class";
        someCar.printInfo();
    }*/

    public static void main(String[] args) {
        Car someCar = new Car("K3", "Kia", 60);
//        Car.count += 1;
//        someCar.name = "K3";
//        someCar.brand = "Kia";
//        someCar.fuel = 60;
        someCar.printInfo();
        someCar.setFuel(100);
        someCar.printInfo();

        Car sonata = new Car();
        sonata.printInfo();
        sonata.drive(50);
        System.out.println(sonata.getFuel());

        System.out.println(Car.getCount());

//        someCar.brand = "Mercedes-Benz";
//        someCar.name = "E-Class";
//        someCar.printInfo();

        System.out.println("--------------------");

        Person person = new Person("최주오");
        for (int i = 0; i < 40; i++) {
            person.age();
        }
        System.out.println(person.getAge());
        person.age();
        System.out.println(person.getAge());

        int a = 10;
        int b = 20;
        swap(a, b);
        // Call by value이기 때문에 값 안바뀜
        System.out.println(a);
        System.out.println(b);

    }

    public static void swap (int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
