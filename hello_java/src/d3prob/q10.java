package d3prob;

import java.util.Scanner;

//한 정수를 입력받는다.
//이후 이 정수를 거듭제곱하며 1의 자리를 확인하면서, 몇번 거듭제곱 했을 때 다시 원래의 숫자의 1의 자리랑 일치하는지 출력하여라.
public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int result = num;
        int count = 2;
//        System.out.println(origin);

        while (true) {
            result *= num;
            if (result % 10 == num % 10){
                System.out.println(result);
                System.out.println(String.format("%d의 %d제곱 째", num, count));
                break;
            }
            count++;
        }
    }
}
