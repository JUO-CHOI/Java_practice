public class D4Methods {

    // main 메서드
    public static void main(String[] args) {
        System.out.println("이것도 메서드 입니다!");
        System.out.println(addTwoInt(10, 20));

        // 두개의 정수를 더하고 두배 하여라.
        int a = 10;
        int b = 10;
        int c = (a + b) * 2;
        System.out.println(addAndTwice(a, b));

        // 세 개의 정수를 받아서, 3으로 나눈 몫을 반환하는 메서드
        System.out.println(divideThree(a, b, c));

        // 정수 배열을 받아서, 1이 어디 있는지 반환하거나, 없으면 -1을 반환하는 메서드
        int[] numbers = {2,3,4,5,3,4,2,1,4};
        System.out.println(findOneReturn(numbers));
        System.out.println("_____________________");
        System.out.println(findOneBreak(numbers));

        // 재귀함수
        System.out.println("재귀함수");
        System.out.println(factorial(5));

        // 메서드 오버로딩
        int intA = 2, intB = 3;
        long longA = 2, longB = 3;

        System.out.println(add(intA, intB));
        System.out.println(add(longA, longB));
        System.out.println(add(intA,longB));

        // 메서드 시그니처
        // 매개변수 자료형은 같은데 반환하는 자료형이 달라지는 경우는?
        // 인자의 자료형에 따라 메서드를 호출하는데 이 경우는 선택지가 2개가 되므로 문제 발생
        // 이름과 매개변수 조합 중 하나는 달라야 한다!! -> 반환하는 자료형만 다를 경우 문제 발생

        // Varargs
        // 가변 인자
        // 인자 갯수가 매번 바뀔 수 있으므로 받을때 원하는 만큼의 인자를 전달받음

        System.out.println(varargAvg(3,4,5,3,45,56,4,2,34,45,56,34));
        System.out.println(varargAvg(2,4,5,7));
        int[] argList = {1,2,3,4,5,6,7,8,9,10};
        // 리스트로도 가능
        // System.out.println(varargAvg(argList));

    }

    public static int findOneReturn(int[] numbers) {
        // 부정 데이터 방지도 가능
        if (numbers.length == 0) {
            // 배열의 길이가 0이면 데이터가 없으니 굳이 찾을 필요가 없음
            return -1;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                return i;
            }
        }
        System.out.println("for 종료");
        return -1;
    }

    // index 사용, break 사용
    public static int findOneBreak(int[] numbers) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                index = i;
                break;
            }
        }
        System.out.println("for 종료");
        return index;
    }

    // 두개의 정수를 더하고 그 결과를 반환하는 메서드
    public static int addTwoInt(int a, int b) {
        return a + b; // return 만나면 값 돌려주고 메서드 종료
    }

    // 두개의 정수를 더하고 두배 해서 그 결과를 반환하는 메서드
    public static int addAndTwice(int a, int b) {
        return (a + b) * 2;
    }

    public static int divideThree(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    // 재귀함수
    // n! = n * (n - 1)!
    // n == 1 || n == 0 -> n! = 1
    public static int factorial(int n) {
        // 0이나 1이면 1을 반환한다
        // 종료 조건을 먼저 작성해주는 것이 가독성이 더 좋다.
        if (n == 0 || n == 1) {
            return 1;
        }
        // 아니면 n * f(n-1)를 반환한다
        else {
            return n * factorial(n - 1);
        }
    }

    // 메소드 오버로딩
    // 이름은 같은, 매개변수 형태가 다른 매서드를 여러개 만들 수 있다.
    // 매서드 호출하는 코드에서 코드 활용도가 높아진다.
    public static int add(int a, int b) {  // int + int
        return a + b;
    }
    public static long add(long a, long b) {  // long + long
        return a + b;
    }

    // Varargs - 가변인자
    // 다른 인자랑 같이 쓰고싶다면 가변인자를 제일 뒷쪽으로
    public static int varargAvg(int offset, int... ints) {
        int sum = 0;
        // 사용은 배열처럼
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum / ints.length;
    }
}
