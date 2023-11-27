package d5;

public class WrapperClass {
    public static void main(String[] args) {
        // 1. 참조 타입이지만, String처럼 값을 할당 가능
        String string = "";
        int primint = 10;
        // int에 대응되는 참조 타입은 Integer / 원래는 new로 만들어야 함
        Integer refInt = 10;

        // 2. 서로 상호호환이 된다.
        refInt = primint;
        primint = refInt;

        // 3. 사칙연산도 그냥 참조타입을 바탕으로 사용 가능하다.
        refInt = 10;
        System.out.println(refInt);
        refInt /= primint;
        System.out.println(refInt);

        Long reflong = 10000L;
        reflong *= 2;
        System.out.println(reflong);

        Character a = 'a';

        // 장점 : 효용성이 좋음
        // 단점 : Heap 메모리를 차지하여 성능저하, 스택이 Heap이 더 빠름

        // 나름 유용한 기능들
        // 문자열 -> 정수 반환
        Integer parsedInt = Integer.parseInt("1000");
        System.out.println(parsedInt + 100);
        // 문자열 -> 실수 변환
        Double parsedDouble = Double.parseDouble("1.0");
        System.out.println(parsedDouble);
        parsedDouble = Double.parseDouble("3.141592");
        // 최대 최소
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // String
        String sentence = "Hello! Today is 27th of November.";
        // 문자열 길이 확인
        System.out.println(sentence.length());
        // 문자열 자르기
        System.out.println(sentence.substring(10));
        System.out.println(sentence.substring(7, 12));
        String[] strArray = sentence.split(" "); // 정규 표현식
        for (String str : strArray) {
            System.out.println(str);
        }
        // 특정 문자열 찾기
        String source = "https://google.com/search?q=";
        System.out.println(source.indexOf("google"));
        // 문자열 한글자씩 확인하는 방법
        // 1. for문 활용
        for (int i = 0; i < source.length(); i++) {
            System.out.print(source.charAt(i) + " ");
        }
        System.out.println();
        // 2. string.toCharArray()
        for (char letter : source.toCharArray()) {
            // 문자열 내부에 저장된 문자 배열 변환하기
            System.out.print(letter + " ");
        }

        source = "오늘 날씨는 4도인데 춥다고 합니다. 밤에는 영하 2도까지 내려갑니다. 28일부턴 다시 추워집니다.";

        // 각 글자가 영문인지 숫자인지 확인하기
        for (char letter : source.toCharArray()) {
            // 문자가 숫자인지 확인
            if (Character.isDigit(letter)) {
                System.out.println(String.format("digit : %c", letter));
            }
            // 문자가 인간의 문자인지 확인
            if (Character.isLetter(letter)) {
                System.out.println(String.format("letter : %c", letter));
            }
        }
    }
}
