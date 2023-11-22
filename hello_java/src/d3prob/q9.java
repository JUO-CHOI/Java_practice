package d3prob;

import java.util.Scanner;

//3명의 사람들에 대한 정보가 개행문자로 구분된 이름(문자열)이 세번, 개행문자로 구분된 체온(정수)이 세번 입력된다.
//이 중 체온이 38도가 넘는 사람들의 이름을 출력하도록 한다.
public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] name = new String[3];
        int[] temperature = new int[3];

        for (int i = 0; i < 3; i++) {
            name[i] = scanner.nextLine();
        }
        for (int i = 0; i < 3; i++) {
            temperature[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            if (temperature[i] > 38) {
                System.out.println(name[i]);
            }
        }
    }
}
