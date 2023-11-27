package d4prob;

/*사칙연산을 나타내는 문자(char) (+, -, *, /) 하나와
두개의 정수를 입력받아, 각 기호에 대응하는 연산의 결과를
반환하는 메서드를 작성하시오.
단, 정수 범위에서만 결과를 반환합니다.*/

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char operation = scanner.next().charAt(0); // Scanner로 char 받는 방법
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(calculate(operation, a, b));
    }

    public static int calculate(char operator, int a, int b) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return -1;
    }

//    각가의 메소드를 만드는 경우
//    public static int plus (int a, int b) {
//        return a + b;
//    }
//
//    // 빼기
//    public static int minus (int a, int b) {
//        return a - b;
//    }
//
//    // 곱하기
//    public static int multiply (int a, int b) {
//        return a * b;
//    }
//
//    // 나누기, 소수점까지 고려하여 실수형으로 반환
//    // 문제에서 정수형에서만 반환하라고 하기에 반환형 int
//    public static int divide (int a, int b) {
//        return a / b;
//    }
}
