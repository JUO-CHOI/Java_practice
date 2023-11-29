package d7.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMain {
    public static void main(String[] args) {
        // List는 인터페이스다.

        // ArrayList : 배열을 관리해주는 Collection - List
        List<String> names = new ArrayList<>(); // ArrayList는 실제 클래스, 초기값을 설정안해줘도 됨!
        // 리스트에 넣기 (순차적으로)
        names.add("Alex");
        names.add("Brad");
        names.add("Dave");
        names.add("Eric");
        // 데이터 회수
        System.out.println(names.get(0));
        System.out.println(names.get(2));
        System.out.println(names.size());
        // 중간에 넣기
        names.add(2, "Chad");
        System.out.println(names);
        // 데이터 위치 찾기
        System.out.println("Chad is at : " + names.indexOf("Chad"));
        System.out.println("Greg is at : " + names.indexOf("Greg")); // 없으면 -1 반환
        // 데이터 제거하기
        System.out.println(names.remove(3)); // 순서를 기준으로, 그 칸의 값을 리턴
        System.out.println(names.remove("Eric")); // 값을 기준으로, boolean으로 리턴
        System.out.println(names.remove("Eric")); // 값이 없으므로 false
        System.out.println(names);

        System.out.println("---------------------------------");

        // 원시타입은 못쓴다.
        //List<int> intList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(10);
        integerList.add(100);
        System.out.println(integerList);

        System.out.println(integerList.remove(2)); // 순서로 제거
        System.out.println(integerList.remove(Integer.valueOf(20))); // 값으로 제거

        // Scanner와 List
        // 엔터로 구분된 입력의 임의의 횟수만큼 이뤄진다.
        // `q`가 입력되면 모든 데이터가 입력된 것이라고 생각할 때
        // 여태가지 입력했던 데이터를 순서대로 출력하시오.

        System.out.println("---------------------------------");

        Scanner scanner = new Scanner(System.in);
        List<String> inputList = new ArrayList<>();
        String input;

        while (true) {
            input = scanner.nextLine();
            if ("q".equals(input)) break;
            inputList.add(input);
        }

        for (String output : inputList) {
            System.out.println(output);
        }

//        String[] nameArray = new String[16];
//        nameArray[0] = "Alex";
//        nameArray[1] = "Brad";
//        nameArray[2] = "Dave";
//        nameArray[3] = "Eric";
//        // 밀렸을때 넣기
//        // 1. 직접 일일히 뒤로 밀어줘야 함
//        // 2. 얼마나 미뤄야할지 모름
//        nameArray[4] = nameArray[3];
//        nameArray[3] = nameArray[2];
//        nameArray[2] = "Chad";
    }

    // 인터페이스 이름(List)을 쓰자
    // 매개변수로 전달할때는 기능을 중요시하는 interface 기준으로 매개변수 선언
    public static int sum(List<Integer> integerList) {
        int sum = 0;
        return sum;
    }

    // 이렇게 쓰지 말고
    // 구현을 중시하는 방식으로 요구하면 기능적 측면의 차이가 없는 클래스는 하나도 못쓴다.
    public static int sum(ArrayList<Integer> integerList) {
        int sum = 0;
        return sum;
    }
}
