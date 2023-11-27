package d5prob;

import java.time.LocalTime;

public class Post {

    // 객체 속성값
    private String title;
    private String content;
    private LocalTime writeTime;
    private LocalTime editTime;
    private String password;

    // 생성자
    public Post(String title, String content, String password) {
        this.writeTime = LocalTime.now();
        this.editTime = LocalTime.now();
        this.title = title;
        this.content = content;
        this.password = password;
    }

    // printPost 메소드
    public void printPost() {
        System.out.println(String.format("제목 : <%s>", title));
        System.out.println(String.format("본문 : <%s>", content));
        System.out.println("작성일 : " + writeTime);
        System.out.println("수정일 : " + editTime);
    }

    // editTitle 메소드
    public boolean editTitle(String title, String password) {
        if (this.password.equals(password)){
            this.editTime = LocalTime.now();
            this.title = title;
            return true;
        }
        else {
            return false;
        }
    }
    // editContent 메소드
    public boolean editContent(String content, String password) {
        if(this.password.equals(password)) {
            this.editTime = LocalTime.now();
            this.content = content;
            return true;
        }
        else {
            return false;
        }
    }
}
