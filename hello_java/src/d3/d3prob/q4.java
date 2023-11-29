package d3.d3prob;

import java.util.Scanner;

//정수 n이 입력된 뒤, n개의 이름이 개행을 기준으로 입력이 된다고 가정할 때, n개의 이름을 입력된 순서의 반대로 출력하여라.

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 개행문자 소모

        String[] names = new String[n]; // 이름 받아줄 배열

        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(names[n - i - 1]); // 뒤에서부터 출력
        }

        // for eachf를 굳이굳이 써보았다.
//        for (int i = n; i > 0; i--) {
//            names[i-1] = scanner.nextLine();
//        }
//
//        for (String name : names) {
//            System.out.println(name);
//        }
    }
}
