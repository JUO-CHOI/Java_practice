package d6.Car;

public class InterfaceMain {
    public static void main(String[] args) {
        Car car = new Car();
        Ship ship = new Ship();
        makeNoise(car);
        makeNoise(ship);
    }

    public static void makeNoise(Horn horn) {
        horn.beep();
    }
}
