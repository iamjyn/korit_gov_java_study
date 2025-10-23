package _16_Class.BankAccount;

public class BankAccount {
    private int balance;

    public BankAccount() {
    }

    public BankAccount(int balance) {
        this.balance = balance;
        System.out.println("계좌가 개설되었습니다.\n현재 잔액: " + this.balance +"원\n");
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int money) {
        if (money > 0) {
            this.balance += money;
            System.out.println("계좌에 " + money + "원이 입금되었습니다.\n현재 잔액: " + this.balance + "원\n");
        } else {
            System.out.println("입금액은 0원 초과이어야 합니다.\n");
        }
    }

    public void withdraw(int money) {
        if (money <= 0) {
            System.out.println("출금액은 0원 초과이어야 합니다.\n");
        } else if (money > balance) {
            System.out.println("잔액이 부족합니다.\n현재 잔액: " + this.balance + "원\n");
        } else {
            this.balance -= money;
            System.out.println("계좌에서 " + money + "원이 출금되었습니다.\n현재 잔액: " + this.balance + "원\n");
        }
    }


}
