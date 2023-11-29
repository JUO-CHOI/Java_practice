package d4.d4prob;

// int[]를 인자로 받아, 순서가 반대로 되어있는 배열을 반환하는 메서드를 작성하시오.

public class q5 {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7};
        int[] reversInts = reverse(ints);
        for (int num : reversInts){
            System.out.print(num + " ");
        }
    }

    public static int[] reverse(int[] ints) {
        int[] reverseInt = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            reverseInt[ints.length - i - 1] = ints[i];
        }
        return reverseInt;
    }
}
