package d7.d7prob;

import java.util.*;
import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if ("q".equals(input)) {
                break;
            }
            try {
                integerList.add(Integer.parseInt(input));
            }
            catch (NumberFormatException e) {}
        }

        int sum = 0;
        for (int num : integerList) {
            sum += num;
        }

        Set<Integer> integerSet = new HashSet<>(integerList);
        // integerList = integerList.stream().distinct().collect(Collectors.toList());

        System.out.println(integerSet.size());
        System.out.println(sum);
    }
}
