package d3.d3prob;

import java.util.Scanner;

/*축구리그에서는 승점을, 승리시 3점 무승부시 1점, 패배시 0점을 획득한다.
남은 경기와 목표 승점이 주어졌을 때,
남은 경기에서 목표 승점을 넘을 수 있으면 필요한 최소 승수를, 없으면 최고 승점을 출력하여라. */

public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int remainGame = scanner.nextInt(); // 남은 게임
        scanner.nextLine();
        int current = scanner.nextInt();
        scanner.nextLine();
        int forwardPoint = scanner.nextInt(); // 목표 승점
        scanner.nextLine();

        int shouldWin = forwardPoint - current;
        int win = shouldWin / 3;
        int draw = shouldWin % 3;

        if (remainGame * 3 < shouldWin) { // 다 이겨도 목표승점이 안될 때
            System.out.println(String.format("최고승점 : %d", remainGame * 3));
        }
        else if (win + draw > remainGame) {
            win++;
            draw = 0;
            System.out.println(String.format("필요한 최소 승수 : %d승 %d무", win, draw));
        }
        else {
            System.out.println(String.format("필요한 최소 승수 : %d승 %d무", win, draw));
        }
    }
}
