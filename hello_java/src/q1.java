// Q. 사용자에게 입력을 받고, 동일한 내용을 세번 출력하는 코드를 작성하시오.

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int i;

        String sentence = scanner.nextLine();

        System.out.println(sentence);

        for (i=0; i<3; i++){
            System.out.println(sentence);
            i++;
        }
    }
}