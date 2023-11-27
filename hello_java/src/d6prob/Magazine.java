package d6prob;

public class Magazine extends Book{
    private String releaseDate;
    private String theme;

    public Magazine(String title, int pageNum, String releaseDate, String theme) {
        super(title, pageNum);
        this.releaseDate = releaseDate;
        this.theme = theme;
    }

    @Override
    public void printInfo() {
        System.out.println(this.getTitle());
        System.out.println(this.getPageNum());
        System.out.println(this.releaseDate);
        System.out.println(this.theme);
    }
}
