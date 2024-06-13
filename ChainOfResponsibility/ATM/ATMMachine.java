package ChainOfResponsibility.ATM;
import java.util.*;
public class ATMMachine {

    MoneyWithdraw moneyWithdraw;

    public ATMMachine(int fiveHundredNotes,int twoHundredNotes,int hundredNotes)
    {
        this.moneyWithdraw = new FiveHundredWithdraw(new TwoHundredWithdraw(new HundredWithdraw(null,hundredNotes),twoHundredNotes), fiveHundredNotes);
    }

    public void withdrawAmount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to Withdraw");
        int amount = sc.nextInt();
        if(this.moneyWithdraw.checkForAmount(amount))
        {
            this.moneyWithdraw.withDraw(amount);
        }
    }
}
