package d7.d7prob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> nameList = new ArrayList<>();

        while (true) {
            String name = scanner.nextLine();

            if ("q".equals(name)) break;

            nameList.add(name);
        }
        // 순서대로
        Collections.sort(nameList);
        // 중복 제거하여 새로운 리스트에 넣기
        List<String> resultList = new ArrayList<>();
        for (String name : nameList) {
            if (!resultList.contains(name)) {
                resultList.add(name);
            }
        }
        for (String name : resultList) {
            System.out.println(name);
        }
    }
}
