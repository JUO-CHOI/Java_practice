package d4.d4prob;

/*
피보나치 수열은
f(0) = 0
f(1) = 1
f(2) = 1
f(n) = f(n-1) + f(n-2)
음이 아닌 정수 n을 인자로 받아 n번째 피보나치 수를 반환하는 매서드를 구현하시오.
*/

public class q3 {
    public static void main(String[] args) {
        //재귀함수로 구현
        System.out.println(fibonacci(19));

        // for문으로 구현
        int num0 = 0;
        int num1 = 1;
        int sum = 1; // 1부터 시작
        for (int i = 0; i < 19; i++) {
            System.out.print(sum + " "); // 1번째부터 출력하고 시작
            sum = num0 + num1;
            num0 = num1;
            num1 = sum;
        }
        System.out.println();

    }

    public static int fibonacci (int n) {
        if (n == 0 || n == 1) {
            return n;
        }
//        else if (n == 2) { f(2) = f(1) + f(0) = 1 + 0 이므로 어차피 0, 굳이 안적어도 됨.
//            return 1;
//        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
