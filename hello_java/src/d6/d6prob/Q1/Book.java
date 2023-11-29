package d6.d6prob.Q1;

public abstract class Book {

    // 속성
    private String title;
    private int pageNum;

    public Book(String title, int pageNum) {
        this.title = title;
        this.pageNum = pageNum;
    }

    public abstract void printInfo();

    public String getTitle() {
        return title;
    }
    public int getPageNum() {
        return pageNum;
    }
}
