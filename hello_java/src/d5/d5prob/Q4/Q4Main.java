package d5.d5prob.Q4;

public class Q4Main {
    public static void main(String[] args) {
        // note 객체 생성
        Note note = new Note("노트1", 10);

        // 글쓰기, 읽기 메소드
        note.write(2, "2페이지 내용");
        note.write(3, "3페이지 내용");
        note.write(3, "3페이지 내용 추가");
        note.write(4, "4페이지 내용");


        note.read(1);
        note.read(3);

        // 총 쓰인 페이지 반환
        System.out.println(note.getWrittenPage());

        // 전체 읽기
        note.readAll();

        System.out.println("-----------------");

        Note note1 = new Note("노트2", 15);

        // 글쓰기, 읽기 메소드
        note1.write(5, "5페이지 내용");
        note1.write(11, "11페이지 내용");


        note1.read(1);
        note1.read(3);

        // 총 쓰인 페이지 반환
        System.out.println(note1.getWrittenPage());

        // 전체 읽기
        note1.readAll();
    }
}
