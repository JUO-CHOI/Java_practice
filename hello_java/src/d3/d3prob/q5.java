package d3.d3prob;

import java.util.Scanner;

        /*한 정수를 입력받는다. 이 정수는 잔고이다.
        이후 반복해서 인출할 돈을 정수로 계속 입력받는다.
        인출한 결과를 "성공: 잔고"의 형태로 출력하고,
        잔고가 부족할 경우 "잔고가 부족합니다". 라고 출력 뒤 프로그램을 종료하여라. */

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int remain = scanner.nextInt(); // 잔고
        scanner.nextLine();


        while (true) {
            int out = scanner.nextInt(); // 인출할 돈
            if (remain < out) { // 인출할 금액이 잔고보다 많을 경우
                System.out.println("잔고가 부족합니다");
                break;
            }
            remain -= out; // 잔고에서 인출할 돈만큼 인출
            System.out.println(String.format("성공 : %d", remain));
        }
    }
}
