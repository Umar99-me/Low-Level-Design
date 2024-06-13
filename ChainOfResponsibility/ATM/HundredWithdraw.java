package ChainOfResponsibility.ATM;

public class HundredWithdraw extends MoneyWithdraw{

    public int count;
    public HundredWithdraw(MoneyWithdraw next,int count) {
        super(next);
        this.count = count;
        //TODO Auto-generated constructor stub˚s
    }

    public boolean checkForAmount(int amount){
        int a = count;
        while(a>0 && amount>=100){
            a--;
            amount-=100;
        }
        return super.checkForAmount(amount);
    }

    public void withDraw(int amount){
        if(amount>=100){
            int notes =  (int) Math.floor(amount/100);
            notes = notes>count?count:notes;
            System.out.println(notes+" 100 Notes");
            amount = amount - (notes*100);
        }
        super.withDraw(amount);
    }
}
