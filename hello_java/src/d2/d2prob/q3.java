/*ASCII 코드로 'A'는 65이다.
1 ~ 26 사이의 숫자 n이 입력될 때, n번째 알파벳을 대문자로 출력하여라.
이때, 범위 밖의 입력이 들어오면 "잘못된 입력입니다"를 출력합니다.*/

package d2.d2prob;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // A == 65 이고, n == 1 일 때 출력이 A

        int n = scanner.nextInt();
        if (n >=1 && n <= 26) {
            System.out.println((char) (n + 64));
        }
       else {
           System.out.println("잘못된 입력입니다.");
        }
    }
}
