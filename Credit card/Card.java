import java.util.Scanner;

class Card {
    Scanner scanner = new Scanner(System.in);
    private final int cardNumber;
    final int pinCode;
    int balance;
    int creditLimit;
    int creditDebt = 0;

    public Card(int cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        int balance = this.balance;
        int creditDebt = this.creditDebt;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    void deposit() {
        System.out.println("Введите пинкод");
        int pinCode = scanner.nextInt();
        if (pinCode == this.pinCode) {

            System.out.println("Какую сумму хотите внести?");

            int depositSum = scanner.nextInt();

            System.out.println("Внесли сумму на счёт " + depositSum);

            int newBalance = balance + depositSum;

            newBalance = this.balance;

            setBalance(+depositSum);
            if (creditDebt < balance) {

                this.balance = creditDebt + depositSum;
                setBalance(+depositSum);
            }

        } else if (pinCode != this.pinCode) {

            System.out.println("Пинкод не верен");

        }
    }

    void withdraw() {
        System.out.println("Введите пинкод");
        int pinCode = scanner.nextInt();

        if (pinCode == this.pinCode) {

            System.out.println("Какую сумму хотите снять?");

            int withdrawSum = scanner.nextInt();

            System.out.println("Вы сняли такую сумму со счёта " + withdrawSum);

            int newBalance = this.balance - withdrawSum;

            setBalance(-withdrawSum);

            System.out.println("На счету осталось " + newBalance);

            if (newBalance < balance) {

                int restSum = balance - withdrawSum;

                creditDebt = restSum;

                restSum = this.balance;

                System.out.println("Сумма превысила счёт и занесена в кредитный баланс ");

                setBalance(-withdrawSum);

            } else if (creditDebt > creditLimit) {

                System.out.println("К сожалению невозможно превысить кредитный лимит");

            }

        } else if (pinCode != this.pinCode) {

            System.out.println("Пинкод не верен");
        }
    }
}


