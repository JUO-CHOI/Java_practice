package d6.d6prob.Q2;

public class SavingAccount extends BankAccount {

    // 3.
    private int deposittimes;
    private int maxtimes;
    private int regularDeposit;

    public SavingAccount(String password, int regularDeposit) {
        super(password);
        this.regularDeposit = regularDeposit;
        deposittimes = 0; // 계좌 개설 시 0회차로 초기화
        maxtimes = 12; // 12개월 만기로 그냥 설정
    }

    // 메소드 오버라이딩
    @Override
    public boolean deposit(String password, int amount) {
        if (!this.getPassword().equals(password)) {
            System.out.println("비밀번호 틀림");
            return false;
        }
        else if (this.regularDeposit != amount) {
            System.out.println("정기적금 금액과 다름"); // 우선 비밀번호를 틀린 경우 실패로 표시
            return false;
        }
        else  {
            deposittimes++;
            return super.deposit(password, amount);
        }
    }
    @Override
    public boolean withdraw(String password, int amount) {
        if(!this.getPassword().equals(password)) {
            System.out.println("비밀번호 틀림");
            return false;

        }
        else if(deposittimes < maxtimes) {
            System.out.println("회차 부족");
            return false;
        }
        else {
            return super.withdraw(password, amount);
        }
    }

    public int getDeposittimes() {
        return deposittimes;
    }
}
