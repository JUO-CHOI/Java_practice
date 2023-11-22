/*ASCII 코드로 'A'는 65이다.
1 ~ 26 사이의 숫자 n이 입력될 때, n번째 알파벳을 대문자로 출력하여라.*/

package d2prob;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // A == 65 이고, n == 1 일 때 출력이 A
        int n = scanner.nextInt();
        System.out.println((char) (n + 64));
    }
}
