package d3prob;

import java.util.Scanner;

// 1월1일의 요일이 주어지고 2월29일 유뮤가 각각 정수, 불린으로 주어진다.
// 각 달의 1일이 무슨 요일인지 1월부터 12월까지 출력하는 코드를 작성하시오.

public class q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int date = scanner.nextInt();
        scanner.nextLine();
        boolean leapYear = scanner.nextBoolean();
        scanner.nextLine();

        // 먼저 그 달의 요일을 출력한 후
        // 자기달의 일수를 이용해서 다음달의 요일을 계산해줌

        if (leapYear) {
            for (int month = 1; month <= 12; month++){
                if (month % 2 == 0) { // 짝수
                    if (month == 8 || month == 10){ // 8월과 10월은 31일까지, 12월은 고려할 필요 없음
                        System.out.println(String.format("%d월 : %d", month, date));
                        date = (date + 31) % 7;
                    }
                    else if (month == 2) { // 윤년 2월은 29일까지
                        System.out.println(String.format("%d월 : %d", month, date));
                        date = (date + 29) % 7;
                    }
                    else { // 남은 짝수월은 30일까지
                        System.out.println(String.format("%d월 : %d", month, date));
                        date = (date + 30) % 7;
                    }
                }
                else { // 홀수
                    if (month == 9 || month == 11) { // 9월과 11월은 30일까지
                        System.out.println(String.format("%d월 : %d", month, date));
                        date = (date + 30) % 7;
                    }
                    else { // 남은 홀수월은 31일까지
                        System.out.println(String.format("%d월 : %d", month, date));
                        date = (date + 31) % 7;
                    }
                }
            }
        }
        else {
            for (int month = 1; month <= 12; month++){
                if (month % 2 == 0) { // 짝수
                    if (month == 10 || month == 8){
                        System.out.println(String.format("%d월 : %d", month, date));
                        date = (date + 31) % 7;
                    }
                    else if (month == 2) {
                        System.out.println(String.format("%d월 : %d", month, date));
                        date = (date + 28) % 7;
                    }
                    else {
                        System.out.println(String.format("%d월 : %d", month, date));
                        date = (date + 30) % 7;
                    }
                }
                else { // 홀수
                    if (month == 9 || month == 11) {
                        System.out.println(String.format("%d월 : %d", month, date));
                        date = (date + 30) % 7;
                    }
                    else {
                        System.out.println(String.format("%d월 : %d", month, date));
                        date = (date + 31) % 7;
                    }
                }
            }
        }
    }
}
