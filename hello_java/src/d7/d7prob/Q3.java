package d7.d7prob;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if ("q".equals(input)) {
                System.out.println(intList);
                break;
            }
            try {
                intList.add(Integer.parseInt(input));
            }
            catch (NumberFormatException e) {

            }
        }

        int sum = 0;
        for (int num : intList) {
            sum += num;
        }

        for (int i = 0; i < intList.size(); i++) {
            if (i == intList.size()-1) {
                System.out.print(intList.get(i) + " = " + sum);
            }
            else {
                System.out.print(intList.get(i) + " + ");
            }
        }
    }
}
