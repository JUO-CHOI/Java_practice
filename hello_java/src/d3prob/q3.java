package d3prob;

/*
정수 n과 n개의 정수가 순서대로 입력된다.
n개의 정수의 총합, 평균을 출력하여라.
*/

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt(); // 입력받은 값을 sum에다가 계속해서 넣기
        }

        System.out.println(sum);
        System.out.println((double) sum / n);
    }
}
