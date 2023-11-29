package d3.d3prob;

import java.util.Scanner;

//1인치는 2.54 센티미터이다.
//사용자에게 정수를 두개 입력받는다.
//첫번째 정수가 0이라면 두번째 정수는 센티미터이고,
//첫번째 정수가 1이라면 두번째 정수는 인치이다.
//센티미터는 해당 길이의 인치로, 인치는 해당 길이의 센티미터로 소수점 2째 자리까지 출력하여라.
public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parameter = scanner.nextInt(); // 0 또는 1
        scanner.nextLine();
        int length = scanner.nextInt(); // 길이 받음
        scanner.nextLine();

        switch (parameter) {
            case 0 :
                System.out.println(String.format("%.2f inch", length / 2.54));
                break;
            case 1 :
                System.out.println(String.format("%.2f cm", length * 2.54));
                break;
        }



    }
}
