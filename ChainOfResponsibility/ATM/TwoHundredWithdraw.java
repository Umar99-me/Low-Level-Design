package ChainOfResponsibility.ATM;

public class TwoHundredWithdraw extends MoneyWithdraw{

    public int count;
    public TwoHundredWithdraw(MoneyWithdraw next, int count) {
        super(next);
        this.count = count;
        //TODO Auto-generated constructor stub
    }

    public boolean checkForAmount(int amount){
        int a = count;
        while(a>0 && amount>=200){
            a--;
            amount-=200;
        }
        return super.checkForAmount(amount);
    }

    public void withDraw(int amount){
        if(amount>=200){
            int notes =  (int) Math.floor(amount/500);
            notes = notes>count?count:notes;
            System.out.println(notes+" 200 Notes");
            amount = amount - (notes*200);
        }
        super.withDraw(amount);
    }

}
