package d4prob;

/* int[], long[], double[]
상기의 자료형에 대해서 동작하는 메서드를 같은 이름으로 만들어
평균을 구하는 메서드를 만드시오 */

public class q4 {
    public static void main(String[] args) {
        int[] intNums = {12,234,432};
        long[] longNums = {23,443,748};
        double[] doubleNums = {13,345,644};
        System.out.println(avg(intNums));
        System.out.println(avg(longNums));
        System.out.println(avg(doubleNums));
    }

    // 매서드 오버로딩
    public static double avg(int[] intNums) {
        int sum = 0;
        for (int number : intNums) {
            sum += number;
        }
        return (double) sum / intNums.length;
    }

    public static double avg(long[] longNums) {
        long sum = 0;
        for (long number : longNums) {
            sum += number;
        }
        return (double) sum / longNums.length;
    }

    public static double avg(double[] doubleNums) {
        double sum = 0;
        for (double number : doubleNums) {
            sum += number;
        }
        return sum / doubleNums.length;
    }
}
