package ChainOfResponsibility.ATM;

public class FiveHundredWithdraw extends MoneyWithdraw{

    public int count;
    public FiveHundredWithdraw(MoneyWithdraw next,int count) {
        super(next);
        this.count = count;
        //TODO Auto-generated constructor stub
    }
   
    public boolean checkForAmount(int amount){
        int a = count;
        while(a>0 && amount>=500){
            a--;
            amount-=500;
        }
        return super.checkForAmount(amount);
    }

    public void withDraw(int amount){
        if(amount>=500){
            int notes =  (int) Math.floor(amount/500);
            notes = notes>count?count:notes;
            System.out.println(notes+" 500 Notes");
            amount = amount - (notes*500);
        }
        super.withDraw(amount);
    }
}
