package d5.d5prob.Q5;

public class Q5Main {
    public static void main(String[] args) {
        Batter batter = new Batter();
        batter.hit(1);
        batter.out();
        batter.walk();

        System.out.println(batter.batAvg());
        System.out.println(batter.onBasePer());
        System.out.println(batter.slugPer());

        System.out.println("------------------");

        Batter batter1 = new Batter();
        batter1.hit(3);
        batter1.out();
        batter1.walk();

        System.out.println(batter1.batAvg());
        System.out.println(batter1.onBasePer());
        System.out.println(batter1.slugPer());

        System.out.println(batter.getBatterInstance());
        System.out.println(batter1.getBatterInstance());
    }
}
