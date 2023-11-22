import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;

public class D3ControlStatement {
    public static void main(String[] args) {
        // 조건문 : 조건이 맞으면 실행 if, switch
        // 반복문 : "조건이 맞다면" 반복 실행 -> 조건문과 연관됨! while, for, for each

        // 조건문 - if : 어떤 조건에 대하여, 코드를 실행할지 말지 결정하는 제어문
        // 조건문은 삼항 연산자로도 할 수 있지만 가독성이 훨씬 떨어진다.
        Scanner scanner = new Scanner(System.in);
        int age = 17; //나이 입력받기
        if (age < 20) {
            System.out.println("You cannot enter");
            System.out.println(String.format("%d 년 뒤에 오세요", 20-age));
        }

        int multiple = 10;
        // multiple이 2의 배수면 2의 배수 출력
        if (multiple % 2 == 0) {
            System.out.println("2의 배수");
        }
        // multiple이 5의 배수면 5의 배수 출력
        if (multiple % 5 == 0) {
            System.out.println("5의 배수");
        }
        // multiple이 10의 배수면 10의 배수 출력
        if (multiple % 10 == 0) {
            System.out.println("10의 배수");
        }
        // 연도를 받는다
        int year = 2024;
        //4의 배수면서 100의 배수가 아니거나, 400의 배수
        if (year % 4 == 0) {
            if (year % 100 != 0 ) {
                System.out.println("윤년이다");
            }
            if (year % 400 == 0) {
                System.out.println("윤년이다");
            }
        }

        // 조건문 else
        int number = 9;
        if (number % 2 == 0) {
            System.out.println("짝수");
        }
        else {
            System.out.println("홀수"); // else는 따로 조건을 제시할 필요 없음
        }

        /*어떤 학생의 시험점수가 입력 되었을 때, 80점을 넘으면 "Good Job, 못넘으면 "Too Bad"*/
        int score = 86;
        if (score >= 0 && score <= 100) {
            if (score >= 80) {
                System.out.println("Good Job");
            }
            else {
                System.out.println("To Bad");
            }
        }
        else {
            System.out.println("잘못된 입력입니다.");
        }

        // else if : 조건을 좀 더 세분화힐 때 사용
        // 0 ~ 30 : 좋음
        // 31 ~ 80 : 보통
        // 81 ~ 150 : 나쁨
        // 150 ~ : 매우 나쁨

        // 밑에가 실행되는 조건을 생각해보면 조건을 줄여볼 수 있다.
        int pm = 87;
        if (pm >= 0 && pm <=30) {
            System.out.println("좋음");
        }
        else if (pm <= 80) { //30은 무조건 성립
            System.out.println("보통");
        }
        else if (pm <= 150) {
            System.out.println("나쁨");
        }
        else if (pm > 150) {
            System.out.println("매우 나쁨");
        }
        else {
            System.out.println("잘못된 입력");
        }

        // switch -case
        // switch : 만약 확인하는 조건이 어떤 데이터인지 중요하다면?

        String input = "w";
        switch (input) {
            case "w":
                System.out.println("up");
                break; // case의 끝에는 꼭 break를 넣어줘야 한다. 그렇지 않으면 아래도 break 만나기 전까지 계속 실행
            case "a":
                System.out.println("left");
                break;
            case "s":
                System.out.println("down");
                break;
            case "d":
                System.out.println("right");
                break;
            default: // 아무것도 일치하지 않을 때 실행, 생략 가능
                System.out.println("invalid");
                break;
        }

        // 반복문
        // while : 특정조건이 true일 동안 계속해서 실행하는 반복문 (if와 비슷한데 반복해서 실행)

//        int loan = 1000;
//        int month = 0;
//        while (loan > 0) {
//            loan -= 50;
//            month++;
//            System.out.println("남은 대출액 : " + loan);
//        } // 무한루프에 걸릴 수 있음 ex) 이자가 붙어서 갚아도 계속 원금이 남는 경우
//        System.out.println("대출 상환 완료! 총 걸린 개월 수 : " + month);

        // 배열의 총합 및 평균 구하기
//        int[] numbers = {2, 3, 5, 6, 19, 23};
//        int i = 0;
//        int sum = 0;
//        while (i < numbers.length) { // 배열의 길이 알아내기 .length
//            sum += numbers[i];
//            i++;
//        }
//        System.out.println("합 : " + sum);
//        System.out.println("평균 : " + (double) sum / numbers.length); // 나누기니까 double로 형변환

        // for : 세 부분으로 나눠서 반복할 조건을 설정하는 반복문
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //별찍기
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < i + 1; j++){
                System.out.print("*"); // 줄 안바꾸고 별 찍기
            }
            System.out.println(); // 개행문자 1개
        }

        // 총합, 최대, 평균
        int[] numbers = {2, 3, 5, 6, 156, 23};
        int sum = 0;
        int max = Integer.MIN_VALUE; //후보군중에 가장 첫번째꺼 써도 됨 (어차피 다 비교할거니까)
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            sum += numbers[i];
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println((double) sum / numbers.length);

        // 무한루프
//        for (;;) {
//            System.out.println("이건 그냥 무한루프");
//        }

        // for문 while문 중괄호 안에서 선언된 문자는 끝나면 사라진다.
        // 밖에서 만들어놓은건 쓸 수 있지만 안에서 다시 선언할 수 없음.
        // 안에서 선언하면 끝나고 나선 다시 쓸 수 없으므로 다시 선언해야 함.

        // foreach : 복수의 데이터의 모음인 변수에 대하여 사용할 수 있는 특수한 형태의 반복문
        String[] fruits = {"apple", "strawberry", "banana", "pear"};
        for (String name : fruits) {
            System.out.println(name); // 몇번째인지 확인하기 힘들다.
            // for문 내부에서 배열 수정은 위험하다.
        }

        // 반복문 제어 : 특정 상황에서 반복 중단 혹은 일부 코드를 실행하지 않음
        // break
        int wallet = 21000;
        int price = 5000;

        while (true) {
            wallet -= price;
            System.out.println(String.format("1인분 먹고 %d원 남음", wallet));
            if (wallet < price) {
                System.out.println("돈 다써서 못먹음");
                break;
            }
        }

        numbers = new int[]{1, 2, 3, 4, 11, 24, 34};
        int targer = 11;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == targer) {
                System.out.println(String.format("%d번째", i+1));
                break;
            }
        }

        // continue
        // 0 - 10 사이의 짝수만 출력
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue; // continue 만나는 순간 해당 반복 종료 후 다음 반복 시작
            }
            System.out.println(i);
        }

        boolean[] vaccinated = {true, true, false, false, true, true, false, false, false, false, false};
        int groupCount = 0;
        for (boolean vaccine : vaccinated) {
            if (vaccine) {
                continue; // 접종 한 사람은 넘어감
            }
            groupCount++; // 접종 안한 사람 카운트
            if (groupCount >= 5) {
                System.out.println("입장이 불가합니다");
                break; // 5명 넘어갸면 그냥 의미 없으니까 브레이크
            }
        }
        System.out.println(groupCount);
    }
}
