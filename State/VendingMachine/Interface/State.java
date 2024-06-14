package State.VendingMachine.Interface;

import State.VendingMachine.Classes.Inventory.VendingMachine;

public interface State {

    public void insertCoins(VendingMachine machine,int coins) throws Exception;
    public void insertMoreCoins(VendingMachine machine,int coins) throws Exception;
    public void selectProduct(VendingMachine machine) throws Exception;
    public void chooseProduct(VendingMachine machine, int shelfNumber) throws Exception;
    public void refundOrCancel() throws Exception;
    public void collectProduct(VendingMachine machine) throws Exception;

}
