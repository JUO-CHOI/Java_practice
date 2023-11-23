package d4prob;

/* 원반을 끼울 수 있는 탑 3개에,
다양한 크기의 원반 n개가, 큰것이 아래쪽에 위치하도록
하나의 탑에 끼워져 있다.
이 원반은 옮길 수 있는데,

1. 한번에 하나의 원반만을 옮길 수 있으며,
2. 작은 원반 위에 큰 원반이 잠시라도 올라가서는 안된다.

라는 조건을 지키면서 모든 원반을 한 탑에서 다른 탑으로 이동하는 문제를
하노이의 탑이라 부른다.
한 탑에서 원반을 하나 꺼내 다른 탑으로 옮긴 횟수를 센다고 했을 때,
n개의 원반을 총 몇번 옮겨야 하는지를 구하는 메소드를 작성하시오. */

public class q11 {
    public static void main(String[] args) {
        int count = hanoi(3, 1, 2, 3, 0);
        System.out.println(count);

    }

    public static int hanoi(int n, int start, int mid, int end, int count) {
//        System.out.println("하노이 실행중" + n);
//        System.out.print(start + " ");
//        System.out.print(mid + " ");
//        System.out.println(end + " ");
        count++; // 메소드가 호출될때마다, 즉 한번 옮길때마다 추가

        // 1개일 때
        if(n == 1) {
//            System.out.println(start + "to" + end + "*");
            return count;
        }

        count = hanoi(n-1, start, end, mid, count); // N-1개를 1번에서 2번으로
        System.out.println(start + "to" + end + "&"); // N을 1에서 3으로 이동
//        System.out.println(n);
        count = hanoi(n-1, mid, start, end, count); // N-1개를 2번에서 3번으로

        return count;
    }
}
