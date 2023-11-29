package d7.collections;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        // Key와 Value -> Python의 Dict, JavaScript의 JSON
        // 폰 -> 연락처
        // 연락처를 검색하는 기준?
        // 이름 - 전화번호
        // Key - Value -> Key Value Pair
        // 메뉴 - 가격
        // 이름 - 성적

        Map<String, String> contactBook = new HashMap<>();
        // Map에 연락처 저장
        contactBook.put("Alex", "010-1234-5678");
        contactBook.put("Brad", "010-9876-5432");
        contactBook.put("Chad", "010-1111-1111");
        contactBook.put("Eric", "010-2222-2222");
        // Map에서 연락처 찾아오기
        System.out.println(contactBook.get("Alex"));
        System.out.println(contactBook.get("Dave")); // null

        // git config user.email 이메일
        // git config user.name 아이디

        // 사람 한명에 대한 정보

        // 전공생 수
        Map<String, Integer> majorCount = new HashMap<>();
        majorCount.put("CSE", 10);
        majorCount.put("EE", 20);
        majorCount.put("ME", 15);
        majorCount.put("BA", 30);
        System.out.println(majorCount);

        // 만약 새로운 전공이 생기면?
        // 1. majorCount.get("major") == null
        String newMajor = "ENG";
//        if (majorCount.get(newMajor) == null) {
//            majorCount.put(newMajor, 1);
//        }
//        else {
//            int before = majorCount.get(newMajor);
//            majorCount.put(newMajor, before + 1);
//        }

        // 2. Optional로 만들어봄
//        Optional<Integer> optionalInt = Optional.ofNullable(majorCount.get(newMajor));
//        if (optionalInt.isPresent()) {
//            majorCount.put(newMajor, majorCount.get(newMajor) + 1);
//        }
//        else {
//            majorCount.put(newMajor, 1);
//        }
//
//        System.out.println("---------------");

        // 3. putIfAbsent
        Integer before = majorCount.putIfAbsent(newMajor, 1); // 없어서 새로 만들면 null 반환, 있으면 추가된 value 반환
        System.out.println(before);
        System.out.println(majorCount.get(newMajor));
        if (before != null) {
            majorCount.put(newMajor, before + 1);
        }
        System.out.println(majorCount.get(newMajor));

        // 이중배열
        Map<String, List<String>> majorStudents = new HashMap<>();
        majorStudents.put("CSE", new ArrayList<>());
        List<String> cseStudents = majorStudents.get("CSE");
        cseStudents.add("Alex");
        cseStudents.add("Brad");
        cseStudents.add("Chad");
        System.out.println(majorStudents);

        // keySet(), entrySet()
        // Map을 순회하고 싶으면 둘 중 하나를 선택할 수 있다.

        // keySet() - Key로만 구성된 Set
        Set<String> keySet = contactBook.keySet();
        for (String key : keySet) {
            System.out.println(key);
            System.out.println(contactBook.get(key));
        }

        // entrySet() - Key - Value 쌍(Entry)으로 구성된 Set
        // Entry는 Key와 Value를 조회할 수 있는 메서드를 가지고 있다.
        for (Map.Entry<String, String> entry : contactBook.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
