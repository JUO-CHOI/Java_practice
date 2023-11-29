package d6.d6prob.Q1;

public class TextBook extends Book {
    private String subject;
    public int grade;

    public TextBook(String title, int pageNum, String subject, int grade) {
        super(title, pageNum);
        this.subject = subject;
        this.grade = grade;
    }

    @Override
    public void printInfo() {
        System.out.println(this.getTitle());
        System.out.println(this.getPageNum());
        System.out.println(this.subject);
        System.out.println(this.grade);
    }
}
