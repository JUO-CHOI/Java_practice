package d3prob;

/*
어떤 학생의 시험점수가 정수로 주어진다.
점수가 90점 이상이면 "수",
점수가 80점 이상 90점 미만이면 "우",
점수가 80점 미만이면 "미"
를 출력하여라.
*/

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("수");
        }
        else if (score >= 80) {
            System.out.println("우");
        } else if (score < 80) {
            System.out.println("미");
        }
    }
}
