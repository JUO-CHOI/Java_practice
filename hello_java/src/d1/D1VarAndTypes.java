package d1;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class D1VarAndTypes {
    public static void main(String[] args) {
//        // 정수형 변수 선언
//        int a = 100; // 변수 선언 및 값 넣어준다. 최초에 선언하기 때문에 자료형 적어줌
//        System.out.println(a);
//
//        // 문자형 변수 선언
//        String b = "Hello Variables!"; // b라는 상자에 "Hello Variables!"라는 데이터를 넣어준다.
//        System.out.println(b); // b에 들이었는게 뭔지 확인한다.
//
//        // a,b 는 변수이름 or 식별자라고 부른다
//
//        System.out.println(a); // a를 한번만 쓸 수 있는 것은 아니고 계속 확인 가능
//
//        // 값 변경
//        a = 50; //a의 값을 변경하고 싶다면 = 사용, 이때 자료형은 생략
//        System.out.println(a);
//
//        //잘못된 식별자 사용법
//        // a = "이거 될까요?"; int형에 String을 넣기 때문에 안됨
//        // String a = "이거는 될까요?"; a는 이미 사용중이기 때문에 안됨
//
//        // 카페메뉴
//        int americano = 1500;
//        int cappuccino = 2500;
//        int caffeLatte = 3000;
//        int caffeMocha = 4000;
//
//        System.out.println(americano * 5);// 아메리카노 5잔 가격 출력
//        System.out.println(cappuccino * 3 + caffeLatte * 2);// 카푸치노 3잔 + 카페라떼 2잔 가격 출력
//        System.out.println(caffeMocha * 1 + americano * 3); // 카페모카 1잔 + 아메리카노 3잔 가격 출력
//
//        // 변수 미리 선언
//        int frappe; // 가격이 정해지면 이후에 할당
//
//        // 한줄에 여러 변수 선언 및 할당
//        int hotTea = 1000, iceTea = 1500;
//
//        // 여러가지 자료형
//
//        // 정수형
//        int intNumber = 10; // 숫자 한계가 있음, 더 큰 수를 넣고 싶다면 long 사용, 더 작은 수를 넣고 싶다면 short 사용
//        long longInteger = 100000000000L; // L 붙여주기
//        short smallInteger = 10000;
//        byte reallySmallInteger = 127;
//
//        // 실수형
//        float floatPoint = 2.718F; // F 붙여주기
//        double realNunber = 3.14159265359; // 거의 double만 쓴다
//        double reallyLongRealNumber = 3.1243463362353573555789976;
//        System.out.println(reallyLongRealNumber); // 대충 짤려서 반올림된다
//
//        // 불리언 자료형 (참 또는 거짓)
//        boolean trueOrFalse = true;
//        boolean success = false;
//        System.out.println(success);
//
//        // 문자형
//        char character = 'c'; // ' 사용
//        char digit = '1';
//        String word = "This is String"; // " 사용
//        String sentence = "This is a String Variable";
//
//        // 다양한 데이터 입력받기
//        Scanner scanner = new Scanner(System.in);
//        String scannedLine = scanner.nextLine();
//        System.out.println(scannedLine);
//
//        System.out.print("숫자를 입력하시오 : ");
//        int scannedInt = scanner.nextInt();
//        System.out.println("입력한 숫자 : " + scannedInt);
//
//        float scannedFloat = scanner.nextFloat();
//        double scannedDouble = scanner.nextDouble();
//        System.out.println(scannedFloat);
//        System.out.println(scannedDouble);
//
//        success = scanner.nextBoolean();
//        System.out.println(success);

        // Escape Sequence
        String quote = "\"내일봐\"라고 말하였다"; // \활용
        char quotation = '\''; // 이스케이프 시퀀스

        // 엔터키(개행문자), 벡스페이스, 탭키 사용
        System.out.println("개행문자 : \n이 다음은 다음 줄에 표현됩니다."); // \n로 줄바꾸기
        System.out.println("name\tscore"); // \t 로 여백 맞춰주기
        System.out.println("Alex\t3.5");
        System.out.println("Thomas\t4.0");

        // 문자열 포맷팅 - String Formatting

        String message = "미세먼지 농도 :  10 (좋음)";
        // 231118
        message = "미세먼지 농도 : 11 (좋음)"; // 날짜가 바껴도 바뀌지 않는 부분은 존재함, 이 방식은 불편

        // 문자열 포맷팅으로 나타내보기
        int dust = 20;
        String status = "보통";
        String msgTemplate = "미세먼지 농도 : %d (%s)";
        // System.out.println(String.format("미세먼지 농도 : %d (%s)", dust, status));
        System.out.println(String.format(msgTemplate, dust, status));

        // 배열
        int[] scores = {85, 75, 90};
        scores[1] = 80;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        Scanner scanner = new Scanner(System.in);

//        int studentCount = 0;
//
//        System.out.print("학생 수를 입력하시오 : ");
//        studentCount = scanner.nextInt();
//
//        String[] names = new String[studentCount];
//        scores = new int[3];

        System.out.println(String.format("%.2f",0.123456789));

    }
}