package d5.d5prob.Q2;

public class Q2Main {
    public static void main(String[] args) {
        // 계좌번호 혹은 비밀번호가 조건에 안맞으면 객체 추가 안됨?
        BankAccount account = new BankAccount("12", "12");
        System.out.println(BankAccount.getTotalAccount());

        // 계좌 2개 개설
        BankAccount account1 = new BankAccount("12345678", "1234");
        BankAccount account2 = new BankAccount("87654321", "1234");

        // 총 계좌 갯수 2개 확인
        System.out.println(BankAccount.getTotalAccount());

        // 계좌1에 돈 넣고빼기
        account1.deposit(100);
        System.out.println(BankAccount.getTotalMoney());
        System.out.println(account1.withdraw(200, "1234")); // 비밀번호는 맞으나 돈이 부족한 경우
        System.out.println(account1.withdraw(50, "4321")); // 돈은 있으나 비밀번호가 틀린 경우
        System.out.println(account1.withdraw(200, "4321")); // 돈도 없고 비밀번호가 틀린 경우
        System.out.println(account1.withdraw(50,"1234"));
        System.out.println(BankAccount.getTotalMoney());

        // 계좌2에 돈 넣고빼기
        account2.deposit(200);
        System.out.println(BankAccount.getTotalMoney());
        System.out.println(account2.withdraw(50,"1234"));

        // 최종 확인
        System.out.println(BankAccount.getTotalMoney());
    }
}
