package d5.d5prob.Q2;

public class BankAccount {
    // 각 객체별 속성
    private String accountNum;
    private String password;
    private int money;

    // 정적 속성
    private static int totalAccount = 0;
    private static int totalMoney = 0;

    // 생성자 메소드
    public BankAccount(String accountNum, String password) {
        if (accountNum.length() != 8 || password.length() != 4) {
            System.out.println("오류");
        }
        else {
            this.accountNum = accountNum;
            this.password = password;
            totalAccount++;
            this.money = 0;
        }
    }

    // 입금 메소드
    public void deposit(int money) {
        totalMoney += money;
        this.money += money;
    }
    // 출금 메소드
    public boolean withdraw(int money, String password) {
        if(this.password.equals(password)) {
            if(this.money < money) {
                System.out.println("잔고 부족");
                return false;
            }
            this.money -= money;
            totalMoney -= money;
            System.out.println(String.format("%d 출금 완료 / 남은 돈 : %d", money, this.money));
            return true;
        }
        else {
            System.out.println("비밀번호 틀림");
            return false;
        }
    }

    public static int getTotalAccount() {
        return totalAccount;
    }
    public static int getTotalMoney() {
        return totalMoney;
    }
}
