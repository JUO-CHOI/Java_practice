package d7.optional;

import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 에러가 될수도 안될수도...
        //System.out.println(nullOrString().length());
        String nullable = nullOrString();
        if (nullable == null) {
            System.out.println("got : null");
        }
        else {
            System.out.println(nullable);
        }

        // 어떤 메소드든 Optional을 통해
        Optional<String> optionalString = Optional.ofNullable(nullOrString()); // 정적 메소드로 객체를 만들면 정적 팩토리
        if(optionalString.isPresent()) { // 값을 가지고 있는지 확인하는 메소드
            System.out.println(optionalString.get());
        }
        else {
            System.out.println(optionalString.isEmpty());
            System.out.println("got : null");
        }

        // 결과를 Optional로 받았으면, orElse를 통해
        // 결과가 null일때 기본값을 설정할 수 있다.
        String resultOrElse = Optional.ofNullable(nullOrString()).orElse("got : null");
        System.out.println(resultOrElse);


        // 메소드에서 직접 온 optional을 다루자
        String resultFromOptional = nullOrOpt().orElse("got : null from orElse method");
    }



    public static String nullOrString() {
        Random random = new Random();
        if (random.nextInt() % 2 == 0) // 짝수
            return "not null string";
        else return null;
    }

    // 메소드에서 직접 Optional 만들기
    public static Optional<String> nullOrOpt() {
        Random random = new Random();
        if (random.nextInt() % 2 == 0) // 짝수
            // Optional.of로 Optional을 만든다
            return Optional.of("not null string");
        else return Optional.empty();
    }
}
