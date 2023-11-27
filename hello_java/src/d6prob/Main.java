package d6prob;

public class Main {
    public static void main(String[] args) {
//        Book magazine = new Magazine("title", 20, "2020-08", "패션");
//        magazine.printInfo();
//
        SavingAccount savingAccount = new SavingAccount("1234", 50);
        System.out.println(savingAccount.deposit("1234", 500));
        System.out.println(savingAccount.deposit("123456", 50));
        for (int i = 0; i < 12; i++) {
            System.out.println(savingAccount.deposit("1234", 50));
        }
        System.out.println("-------------------------");
        System.out.println(savingAccount.getDeposittimes());
        System.out.println(savingAccount.getBalance());

        System.out.println(savingAccount.withdraw("12345", 50));
        System.out.println(savingAccount.withdraw("1234", 700));
        System.out.println(savingAccount.withdraw("1234", 300));

        System.out.println(savingAccount.getPassword());
    }
}
