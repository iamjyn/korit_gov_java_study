package _16_Class.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        /*
        * BankAccount 클래스에서 속성으로 balance 선언
        * balance(잔액) private로 제한
        * 해당 객체를 생성할 때 balance에 값 주입
        * > 객체가 생성될 때 "계좌가 개설되었습니다. 현재 잔액: ***원" 출력
        * > balance의 값을 볼 수 있게 get만들기
        * > 메소드로 deposit, withdraw 만들기
        * deposit => 입금 금액이 0 원 이상일 때 입금이 가능하도록
        * 입금이 되었을 때 "계좌에 ***원이 입금되었습니다. 현재 잔액 : ***원" 출력
        * withdraw => 출금액이 0원 이상이면서 잔액이 출금액보다 이하일 경우 출금 가능
        * 출금액이 0원 이상이 되지 않으면 "출금액은 0원 초과이어야 합니다" 출력
        * 출금액이 잔액보다 많을 경우 "잔액이 부족합니다. 현재 잔액 : ***원" 출력
        * > 메인에서 계좌 개설 후 한번씩 다 테스트 해보기
        * */

        BankAccount bankAccount = new BankAccount(10000);

        bankAccount.deposit(0);
        bankAccount.deposit(5000);
        bankAccount.deposit(-5000);

        bankAccount.withdraw(3000);
        bankAccount.withdraw(0);
        bankAccount.withdraw(-1000);
        bankAccount.withdraw(500000000);
        System.out.println(bankAccount.getBalance());

    }
}
