package d4prob;

/* String 배열을 인자로 받아 배열의 각 값을
한줄씩 출력하는 메서드 "printAll"를 작성하시오. */

public class q2 {
    public static void main(String[] args) {
        String[] array = {"안녕하세요", "제 이름은", "최주오입니다."};
        printAll(array);
    }

    public static void printAll(String[] strArr) {
        for (String str : strArr) {
            System.out.println(str);
//        for (int i =0; i < strArr.length; i++) {
//            System.out.println(strArr[i]);
        }
    }
}
