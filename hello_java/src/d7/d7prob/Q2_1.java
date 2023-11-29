package d7.d7prob;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> menuBook = new HashMap<>();

        while (true) {
            String input = scanner.nextLine();
            String[] arr = input.split(" ");

            if (arr[0].equals("order")) {
//                menu 메소드 활용
//                System.out.println(order(menuBook, arr[1]));
                System.out.println(menuBook.get(arr[1]));
                break;
            }
            menuBook.put(arr[0], Integer.parseInt(arr[1]));
        }
    }

    // order 메소드 만들어봄
    public static Integer order(Map<String, Integer> menuBook, String menu) {
        return menuBook.get(menu);
    }
}
