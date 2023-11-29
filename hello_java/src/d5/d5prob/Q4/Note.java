package d5.d5prob.Q4;

public class Note {
    // 속성
    private String title; // 제목
    private String[] pages; // 각 페이지 내용이 들어갈 String 배열
    //private int pageNum; // 노트 페이지 수
    private int writtenPage; // 지금까지 작성한 페이지

    // 생성자
    public Note(String title, int pageNum) {
        this.writtenPage = 0;
        this.title = title;
        this.pages = new String[pageNum];
    }

    // 메소드
    public void write(int page, String content) {
        if(pages[page] == null) {
            this.writtenPage += 1;
            pages[page] = content;
        }
        else {
            pages[page] = content;
        }
    }
    public void read(int page) {
//        if(this.pages[page] == null) {
//            System.out.println("null");
//        }
//        else {
//            System.out.println(pages[page]);
//        }
        // 배열이 비어있으면 null 반환
        System.out.println(pages[page]);
    }
    public void readAll() {
        for (int i = 0; i < pages.length; i++) {
            if(pages[i] == null) {

            }
            else {
                System.out.println(pages[i]);
            }
        }
    }
    public int getWrittenPage() {
        return writtenPage;
    }
}
