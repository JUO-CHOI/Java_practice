package d6.Car;

public class Main {
    public static void main(String[] args) {
        /*단순상속, 구상클래스*/
        Car sonata = new Car();
        refuel(sonata);
        System.out.println(sonata.getFuel());
        sonata.beep();
        sonata.drive(100);

        Truck porter = new Truck(200);
        refuel(porter); // Car의 메소드 사용 중. 업캐스팅
        System.out.println(porter.getFuel());
        porter.drive(100);
        porter.beep();
        porter.load(100);
        System.out.println(String.format("max load : %d, load : %d", porter.getMaxLoad(), porter.getLoad()));

        // 업캐스팅
        Car bongo = new Truck(100); // Truck의 인스턴스. 이 경우, Truck의 속성에 값을 쓰기 위해선 형변환 필요
        ((Truck) bongo).load(50); // 다운캐스팅
        refuel(bongo);
        // ((Truck) sonata).load(20); 이건 안됨
        if (bongo instanceof Truck) {
            ((Truck) bongo).load(50);
        }
        // Truck은 어디서든 Car의 역할을 할 수 있지만, 반대로 Car은 Truck의 역할을 하기 위해선 다운캐스팅 필요

        System.out.println("------------------");
        refuel(porter);
        porter.drive(10);
        bongo.drive(10);

    }

    public static void refuel(Car car) {
        car.setFuel(100);
    }

    public static boolean isTruck(Car car) {
        return car instanceof Truck;
    }
}
