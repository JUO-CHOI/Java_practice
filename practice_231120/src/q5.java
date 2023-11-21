/*Q. 사용자에게 3개의 0.0 ~ 4.5 사이의 실수를 입력받고 그 뒤에 3개의 이름을 입력받은 뒤,
이름 - <이름>, 학점 - <실수> 의 형태로 3줄을 출력하는 프로그램을 작성하시오.
단, 실수의 범위가 틀려도 상관없다*/

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float[] score = new float[3];
        String[] name = new String[3];

        // 세 학생 점수 입력받기
        System.out.println("첫번째 학생의 학점을 입력하시오");
        score[0] = scanner.nextFloat();
        scanner.nextLine(); // 해당 줄은 없어도 됨
        System.out.println("두번째 학생의 학점을 입력하시오");
        score[1] = scanner.nextFloat();
        scanner.nextLine(); // 해당 줄은 없어도 됨
        System.out.println("세번째 학생의 학점을 입력하시오");
        score[2] = scanner.nextFloat();
        scanner.nextLine(); // 해당 줄은 다음이 nextLine이기 때문에 꼭 필요함

        // 세 학생 이름 입력받기
        System.out.println("첫번째 학생 이름을 입력하시오");
        name[0] = scanner.nextLine();
        System.out.println("두번째 학생 이름을 입력하시오");
        name[1] = scanner.nextLine();
        System.out.println("세번째 학생 이름을 입력하시오");
        name[2] = scanner.nextLine();

        String form = "이름 - <%s>, \t 학점 - <%.2f>"; // 학점은 보통 2자리로 표현하기 때문에 %.2f 로 받음

        for (int i = 0; i < 3; i++) {
            System.out.println(String.format(form, name[i], score[i]));
        }

    }
}