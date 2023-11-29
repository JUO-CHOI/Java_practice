package d7.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> skillSet = new HashSet<>();
        // 값 넣기
        skillSet.add("md");
        skillSet.add("git");
        skillSet.add("java");
        skillSet.add("opp");
        skillSet.add("java"); // 중복! 추가 안됨

        System.out.println(skillSet); // 순서를 보장해주지 않음, 중복은 알아서 제거

        // 값 제거 -> 순서가 보장되지 않기 때문에 인덱스 말고 값으로 제거


        List<String> skillList = new ArrayList<>();
        skillList.add("java");
        skillList.add("kotlin");
        skillList.add("android");
        skillList.add("flutter");
        skillList.add("react");
        skillList.add("git");
        // 다른 collection의 원소를 전부 추가 시도
        System.out.println(skillSet.addAll(skillList)); // skillList가 가진 것 중 없는거 다 추가, boolean 리턴
        System.out.println(skillSet);

        List<Pigeon> listHoles = new ArrayList<>();
        Set<Pigeon> setHoles = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            Pigeon pigeon = new Pigeon(i % 10);
            listHoles.add(pigeon);
            setHoles.add(pigeon);
        }

        System.out.println("List의 비둘기 : " + listHoles.size());
        System.out.println("Set의 비둘기 : " + setHoles.size()); // 객체는 모두 다르기 때문에(Hash값이 다름) Set으로 거르지 못함 -> equals, hash 구현

        List<String> thirdSkills = new ArrayList<>();
        thirdSkills.add("javascript");
        thirdSkills.add("typescript");
        thirdSkills.add("python");
        thirdSkills.add("java");
        thirdSkills.add("react");

        thirdSkills.remove("python"); // set은 인덱스로 불가능

        System.out.println(skillSet.removeAll(thirdSkills));
        System.out.println(skillSet);

    }
}
