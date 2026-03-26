package 은행입출금예외;


// 잔액 부족 예외
public class InsufficientBalanceException extends Exception {
    private final int amount;  // 출금 요정 금액
    private final int balance; // 현재 잔액

    public InsufficientBalanceException(int amount, int balance) {
        this.amount = amount;
        this.balance = balance;
    }

    @Override
    public String getMessage() {
        return "잔액이 부족 합니다. 요청: " + amount + "원 / 잔액: " + balance + "원";
    }
}

// 금액 오류 예외
class InvalidAmountException extends Exception {
    private final int amount;

    public InvalidAmountException(int amount) {
        this.amount = amount;
    }

    @Override
    public String getMessage() {
        return "입금/출금 금액은 0원보다 커야 합니다. 입력값: " + amount + "원";
    }
}

// 계좌 클래스
class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    // 입금
    public void deposit(int amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException(amount);
        }
        balance += amount;
        System.out.println("[임금 성공]" + amount + "원 입금 -> 잔액 ");
    }

    // 출금
    public void withdraw(int amount) throws InsufficientBalanceException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException(amount);
        }
        if (amount > balance) {
            throw new InsufficientBalanceException(amount, balance);
        }
        balance -= amount;
        System.out.println("[출금 성공]" + amount + "원 출금 -> 잔액: " + balance + "원");
    }

    public int getBalance() {
        return balance;
    }

}













