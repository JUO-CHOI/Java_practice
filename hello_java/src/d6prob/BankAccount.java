package d6prob;

public class BankAccount {
    // 1.
    private int balance;
    private String password;

    public BankAccount(String password) {
        this.password = password;
        balance = 0;
    }

    // 2.
    public boolean deposit(String password, int amount) {
        if(password.equals(this.password)) {
            balance += amount;
            System.out.println(String.format("잔고 : %d", balance));
            return true;
        }
        else {
            System.out.println("계좌번호 틀림");
            return false;
        }
    }
    public boolean withdraw(String password, int amount) {
        if(password.equals(this.password)) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(String.format("잔액 : %d", balance));
                return true;
            }
            else {
                System.out.println(String.format("잔고 부족, 현재 잔고 : %d", balance));
                return false;
            }
        }
        else {
            System.out.println("비밀번호 틀림");
            return false;
        }
    }

    public int getBalance() {
        return balance;
    }
    public String getPassword() {
        return password;
    }
}
