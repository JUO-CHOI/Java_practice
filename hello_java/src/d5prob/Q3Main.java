package d5prob;

import java.time.LocalTime;

public class Q3Main {
    public static void main(String[] args) {
        // post 객체 생성
        Post post = new Post("Java Essential", "명품 자바 에센셜", "1234");
        post.printPost(); // post 객체 속성값 프린트

        // editTitle 메소드
        System.out.println(post.editTitle("Java Essential 개정판", "2345")); // 비밀번호 틀림
        System.out.println(post.editTitle("Java Essential 개정판", "1234")); // 비밀번호 맞음
        post.printPost();

        // editContent 메소드
        System.out.println(post.editContent("세상을 지배하는 Java 프로그래머", "2345")); // 비밀번호 틀림
        System.out.println(post.editContent("세상을 지배하는 Java 프로그래머", "1234")); // 비밀번호 맞음
        post.printPost();
    }
}
