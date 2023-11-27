package d5;

// 클래스의 정보(속성), 기능을 넣는 작업
public class Car {
    // 총 도로를 달리고 있는 자동차의 갯수
    // 객체는 다른 객체에 대해 파악하지 못한다.
    // 정적 속성 : 객체 각각이 아닌 클래스가 가지고 있는 속성


    // 클래스의 속성
    private static int count = 0; // static을 적어주면 객체가 가진 속성이 아닌 설계도 자체에 기록이 되는 속성이 된다.
    private final String brand; // 브랜드 -> 바뀌지 않는다.
    private final String name; // 차종명 -> 바뀌지 않는다.
    private int fuel; // 주유 상고 -> 주행하면서 바뀔 수 있다.

    // 생성자 : 객체를 만들때 호출되는 메서드
    // private인데 setter도 없다. -> 만들 때 정보를 딱 한번만 전달하게 하자!
    public Car(String name, String brand, int fuel) {
        count++; // 자동차가 생성될때마다 한대씩 추가
        this.name = name;
        this.brand = brand;
        this.fuel = fuel;
    }

    // 생성자도 기본적으로 메소드이기 때문에 오버로딩 가능!
    public Car() {
        count++;
        // 정보를 안넣는 경우 생성되는 일반적인 차
        this.name = "Sonata";
        this.brand = "Hyundai";
        this.fuel = 60;
    }

    // Getter
    public String getBrand() {
        return brand;
    }
    public String getName() {
        return name;
    }

    public static int getCount() {
        return Car.count;
    }

    public int getFuel() {
        return fuel;
    }

    // Setter
    public void setFuel(int fuel) {
        this.fuel = fuel; // this. : 객체 자신을 가르키는 키워드
    }

    // static 속성은 Car.count로 호출
//    public void setCount(int count) {
//        Car.count = count;
//    }


    // 클락션을 울리는 기능 -> 메소드
    public void beep() {
        System.out.println("beep");
    }
    // 가진 정보를 출력하는 기능
    public /*static*/ void  printInfo() {
        System.out.println(String.format("name:\t%s", name));
        System.out.println(String.format("brand:\t%s", brand));
        System.out.println(String.format("fule:\t%d", fuel));
    }
    // 특정 거리를 이동하는 기능
    public void drive(int kilo) {
        fuel -= kilo / 2; // 본인의 속성들을 사용해서 기능을 달리할 수 있음
        System.out.println(String.format("Moved : %d km, RemainFuel : %d", kilo, fuel));
    }
}
