package ch11.capsule.ex03;

public class AccountTest {
    public  static void main(String[] args){
        Account myAccount = new Account();

        // 10000원이 입금 되었습니다. 잔고는 10000원입니다.
        myAccount.deposit(10000);
        // 5000원이 춞 되었습니다. 잔고는 5000원입니다
        myAccount.withdraw(5000);
        // 잔고가 부족합니다. 잔고는 5000원입니다.
        myAccount.withdraw(10000);

        System.out.println("현재 잔고: " + myAccount.getBalance());

    }
}
