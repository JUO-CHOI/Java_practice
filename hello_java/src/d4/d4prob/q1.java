package d4.d4prob;

public class q1 {
    public static void main(String[] args) {
        int a = -12;
        int b = 18;
        System.out.println(diff(a , b));

        System.out.println(abs(a));
    }

    /* 어떤 정수를 받아서 절대값을 반환하는 메서드 "abs"를 작성하시오 */
    public static int abs (int a) {
        if (a > 0) {
            return a;
        }
        else {
            return - a;
        }
    }

    /*두 정수를 인자로 받아,
    두 정수 값의 차이의 절대값을 반환하는 매서드 "diff"를 작성하시오*/
    public static int diff (int a, int b) {
        return abs(a - b);
//        if (a > b) {
//            return a - b;
//        }
//        else {
//            return b - a;
//        }
    }
}
