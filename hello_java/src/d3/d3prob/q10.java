package d3.d3prob;

import java.util.Scanner;

//한 정수를 입력받는다.
//이후 이 정수를 거듭제곱하며 1의 자리를 확인하면서, 몇번 거듭제곱 했을 때 다시 원래의 숫자의 1의 자리랑 일치하는지 출력하여라.
public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1의 자리만 확인해도 괜찮다.
        int num = scanner.nextInt() % 10; // 바로 1의 자리만 구해놓음
        int now = num; // 현재값 저장
        int i = 1; // 몇번 반복됐는지 새기 위한 변수

        while (true) {
            now *= num; // 거듭제곱
            now %= 10; // 1의 자리만 남긴다
            i++;
            if (now == num){
                System.out.println(String.format("%d의 %d제곱 째", num, i));
                break;
            }
        }
    }
}
