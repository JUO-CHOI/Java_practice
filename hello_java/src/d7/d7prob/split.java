package d7.d7prob;

public class split {
    public static void main(String[] args) {
        String a = "가나다 123";
        String[] aa = a.split(" ");
        for (String aaa : aa) {
            System.out.println(aaa);
        }
    }
}
