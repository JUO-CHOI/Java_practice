package d5prob;

public class Batter {

    // 속성
    private int atBat;
    private int hit;
    private int fourBall;
    private int bases;

    public Batter() {
        this.atBat = 0;
        this.hit = 0;
        this.fourBall = 0;
        this.bases = 0;
    }

    // 메소드
    public void hit(int bases) {
        if (bases < 1 || bases > 4) {
            System.out.println(-1);
        }
        else {
            atBat += 1;
            hit += 1;
            this.bases += bases;
        }
    }
    public void out() {
        atBat += 1;
    }
    public void walk() {
        atBat += 1;
        fourBall += 1;
    }

    // 성적을 나타내는 메소드
    public double batAvg() {
        return (double) hit / (atBat - fourBall);
    }
    public double onBasePer() {
        return (double) (hit + fourBall) / atBat;
    }
    public double slugPer() {
        return (double) bases / (atBat - fourBall);
    }

    public Batter getBatterInstance() {
        return this;
    }


}
