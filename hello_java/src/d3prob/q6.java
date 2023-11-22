package d3prob;

import java.util.Scanner;

//한 정수를 입력받아, 해당 정수가 음수인지 양수인지 아니면 0인지 출력하는 코드를 작성하여라.
public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt(); // 숫자 입력받음

        if (input > 0) {
            System.out.println("양수");
        }
        else if (input < 0) {
            System.out.println("음수");
        }
        else {
            System.out.println("0");
        }
    }
}
