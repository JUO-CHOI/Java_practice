package d3.d3prob;

import java.util.Scanner;

public class q7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int remaining = scanner.nextInt();
        int current = scanner.nextInt();
        int goal = scanner.nextInt();
        // 넘을 수 있나를 판단하기 위해서 먼저 전부 이겼다고 가정
        int maxScore = current + remaining * 3;
        // 목표 점수 넘었나?
        if (maxScore >= goal) {
            // 승 한번이 무승부로 바뀌면 최고점에서 몇점이 줄어들까? : 2점
            // 최고 점수 - 목표 점수 = 여유분 점수
            // 여유분 점수를 2로 나눈 몫만큼 덜 이겨도
            // 나머지를 다 무승부로 끝내면 필요한 최소 승수
            int minWins = remaining - ((maxScore - goal) / 2);
            System.out.println(String.format("최소 필요 승수 : %d", minWins));
        }
        else {
            System.out.println(String.format("최대 승점 : %d", maxScore));
        }
    }
}
