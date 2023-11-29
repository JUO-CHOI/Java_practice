package d7.d7prob;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
* 엔터로 구분된 입력이 임의의 횟수만큼 이뤄진다.
* `q`가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
* 여태까지 입력한 정수가 몇가지가 되는지 출력하시오.
*/
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> intSet = new HashSet<>();
        String input;

        while (true) {
            input = scanner.nextLine();
            if ("q".equals(input)) break;
            intSet.add(Integer.parseInt(input));
        }

        System.out.println(intSet.size());

        // Set은 for each로만!
        for (int num : intSet) {
            System.out.print(num + " ");
        }
    }
}
