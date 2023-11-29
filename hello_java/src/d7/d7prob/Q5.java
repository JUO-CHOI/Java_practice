package d7.d7prob;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> menuBook = new HashMap<>();

        int sum = 0;

        while (true) {
            String input = scanner.nextLine();

            if ("order".equals(input)) break;

            String[] menuArr = input.split(" ");
            menuBook.put(menuArr[0], Integer.parseInt(menuArr[1]));
        }

        while (true) {
            String order = scanner.nextLine();

            if ("done".equals(order)) break;

            String[] orderArr = order.split(" ");
            sum += menuBook.get(orderArr[0]) * Integer.parseInt(orderArr[1]);
        }
        System.out.println(sum);
    }
}
