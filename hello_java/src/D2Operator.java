public class D2Operator {
    public static void main(String[] args) {
        double notDivided = (double) 21 / 10; // 정수와 정수를 나눌 때 실수로 나오게 하기 위해선 double로 형변환
        System.out.println(notDivided);  // 2

        int dataLost = (int) 42645634632567L;
        System.out.println(dataLost);

        // 삼항 연산자
        int temperature = 39;
        String message = temperature < 38 ? "OK" : "Feverish";
        System.out.println(message);
    }
}

