package d7.collections;

import java.util.*;

public class ItCoMain {
    public static void main(String[] args) {
        // Iterable 또는 Collection 또는 List 또는 Set
        // 전부 순회 가능하다.
        List<String> skilllist = new ArrayList<>();
        skilllist.add("Java");
        skilllist.add("git");
        skilllist.add("md");
        skilllist.add("python");
        skilllist.add("aws");
        skilllist.add("linux");
        for (String skill : skilllist) {
            System.out.println(skill);
//            // 순회중에 제거하면 예외 발생
//            skilllist.remove("python");
        }

        System.out.println("----------------");

        // Iterator : 한 칸씩 측정하는 센서
        Iterator<String> iter = skilllist.iterator();
        while (iter.hasNext()) {
            String skill = iter.next();
            System.out.println(skill);
            // iter.remove를 쓰면 안전하게 순회중 제거 가능
            if ("python".equals(skill)) {
                iter.remove();
            }
        }
        System.out.println(skilllist);

        // Collection : 데이터 관리를 위한 메소드(add, remove)가 들어있는 인터페이스
        List<String> listCollection = new ArrayList<>();
        Set<String> setCollection = new HashSet<>();
        // List의 Collection 메소드들
        System.out.println(listCollection.size());
        System.out.println(listCollection.isEmpty());
        System.out.println(listCollection.contains(""));
        System.out.println(listCollection.containsAll(listCollection));
        // Set의 Collection 메소드들
        System.out.println(setCollection.size());
        System.out.println(setCollection.isEmpty());
        System.out.println(setCollection.contains(""));
        System.out.println(setCollection.containsAll(setCollection));

        // Collection의 문서를 보면,
        // Collection 인터페이스를 구현하는 클래스는
        // 1. 아무것도 없는 기본 생성자와
        // 2. 다른 Collection을 받아 그 모든 원소를 가지는 생성자를
        // 만들어 마땅하다.
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Java");
        Set<String> setNoDups = new HashSet<>(listWithDuplicates);
        System.out.println(setNoDups);

    }
}
