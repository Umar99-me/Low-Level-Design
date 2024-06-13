package ChainOfResponsibility.ATM;

class Main {
    public static void main(String[] args) {

        ATMMachine machine = new ATMMachine(4, 10, 20);
        machine.withdrawAmount();

        // MoneyWithdraw money = new FiveHundredWithdraw(new TwoHundredWithdraw(new HundredWithdraw(null,20),10), 4);
        // System.out.println(money.checkForAmount(1000));
        // money.withDraw(1000);
    }
}
