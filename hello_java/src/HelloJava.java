import java.util.Scanner;

public class HelloJava {
    public static void main(String [] args) {
        //라인 출력하기
        System.out.println("Hello, World!");
        System.out.println("만나서 반갑습니다");
        System.out.println("열심히 할게요");
        System.out.println(1024);
        System.out.println(3.141592);

        // 주석 달기
//        command / 로 주석을 달 수 있음
        /*
        여러 줄 주석처리 가능
        */

        // 사용자 입력 받기
        Scanner scanner = new Scanner(System.in); // import java.util.Scanner; 필요. 대체로 자동으로 추가해줌
        System.out.println(scanner.nextLine()); // 입력을 받아서 출력

        scanner.nextLine(); // 입력은 받는데 출력은 안함
    }
}
