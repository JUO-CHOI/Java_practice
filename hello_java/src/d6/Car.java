package d6;

/*
* 연료가 얼마나 들었는지에 대한 정보
* 연료가 얼마나 남았는지에 대한 정보를 반환하는 메서드
* 연료를 설정하는 메서드
* 운전하는 메서드, 실행 시 주행거리 / 10 (정수) 만큼 연료 소모
* 경적을 울리는 'beep'
*/

public class Car implements Horn {

    @Override // 안넣어줘도 동작은 하지만, 넣어주는거 권장
    public void beep()  {
        System.out.println("beep");
    }

    // private 접근 제어자는 나, 그리고 오로지 나
    // protected 접근 제어자는 우리 자식, 자손 사용 가능
    protected int fuel;

    public int getFuel() {
        return this.fuel;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public void drive(int kilo) {
        System.out.println("Drive Car");
        this.fuel -= kilo /10;
        System.out.println(String.format("moved : %d, current fuel : %d", kilo, this.fuel));
    }

}
