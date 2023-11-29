package d6.d6prob.Q1;

public class Series extends Book {
    private String author;
    private String subTitle;
    private int seriesNum;

    public Series(String title, int pageNum, String author, String subTitle, int seriesNum) {
        super(title, pageNum);
        this.author = author;
        this.subTitle = subTitle;
        this.seriesNum = seriesNum;
    }

    @Override
    public void printInfo() {
        System.out.println(this.getTitle());
        System.out.println(this.getPageNum());
        System.out.println(author);
        System.out.println(subTitle);
        System.out.println(seriesNum);
    }
}
