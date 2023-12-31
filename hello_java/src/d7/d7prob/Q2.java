package d7.d7prob;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* 어떤 가게의 메뉴 <메뉴명> <가격> 형태로 계속 입력된다.
* "order"가 입력되었을 때,
* 사용자의 단일 주문을 받고 금액을 출력하시오
*/
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> menu = new HashMap<>();

        while (true) {
            String input = scanner.next();
            if ("order".equals(input)) {
                String orderMenu = scanner.next();
                System.out.println("가격 : " + menu.get(orderMenu));
                System.out.println("종료");
                break;
            }
            Integer price = scanner.nextInt();
            scanner.nextLine();
            menu.put(input,price);
        }
    }
}
