package d6;

// 가장 먼저 자동차의 모든 기능을 가지게 만들자. : extends 사용

public class Truck extends Car {
    private final int maxLoad; // 짐을 실을 수 있는 한도
    private int load; // 현재 실은 짐

    public Truck(int maxLoad) {
        this.maxLoad = maxLoad;
        this.load = 0; // 원시타입의 경우 초기화 안해도됨
    }

    // 짐을 인자로 받아, 'maxLoad' 이하면 추가하고
    // 아니면 추가하지 않은 다음
    // 추가 성공 여부를 boolean으로 반환하는 메서드

    public int getLoad() {
        return this.load;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public boolean load(int load) {
        if (this.load + load <= this.maxLoad) {
            this.load += load;
            return true;
        }
        else {
            return false;
        }
    }

    // 메소드 오버라이딩
    @Override
    public void drive(int kilo) {
        System.out.println("Drive Truck");
//        setFuel(getFuel() -1);
        this.fuel -= load / (maxLoad / 10);
        super.drive(kilo);
    }
}
