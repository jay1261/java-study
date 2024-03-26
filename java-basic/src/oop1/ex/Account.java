package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount){
        System.out.println(amount + "원을 입금합니다.");
        balance += amount;
        System.out.println("입금 후 잔액: " + balance);
    }
    void withdraw(int amount){
        if (balance < amount) {
            System.out.println("잔액 부족");
            System.out.println("잔고: " + balance);
        }
        else {
            balance -= amount;
            System.out.println("출금 후 잔액: " + balance);
        }

    }
}
