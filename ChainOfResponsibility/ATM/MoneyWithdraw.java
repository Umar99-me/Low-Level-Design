package ChainOfResponsibility.ATM;

public class MoneyWithdraw {

    MoneyWithdraw next;
    public MoneyWithdraw(MoneyWithdraw next){
        this.next = next;
    }

    public boolean checkForAmount(int amount){
        if(amount == 0)
            return true;
        if(null!=this.next)
            return this.next.checkForAmount(amount);
        return false;
    }

    public void withDraw(int amount){
        if(null!=this.next)
            this.next.withDraw(amount);
    }
}
