package d1.d1prob;// Q. 시간과 오전 오후를 입력받고, 오전 XX시의 형식으로 출력하는 코드를 작성하시오.

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("시간을 입력하시오." );
        int time = scanner.nextInt();

        System.out.println("오전, 오후를 입력하시오.");
        scanner.nextLine(); // 개행문자(엔터) 제거
        String amPm = scanner.nextLine();

        String info = "현재 시각은 %s %d시 입니다";
        System.out.println(String.format(info,amPm,time));

    }
}