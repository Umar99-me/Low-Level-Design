package State.VendingMachine.Classes.States;

import State.VendingMachine.Classes.Inventory.VendingMachine;
import State.VendingMachine.Interface.State;

public class HasMoney implements State{

    @Override
    public void insertCoins(VendingMachine machine,int coins) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertMoney'");
    }

    @Override
    public void insertMoreCoins(VendingMachine machine,int coins) throws Exception {
        // TODO Auto-generated method stub
        machine.setCoinsInserted(machine.getCoinsInserted()+coins);
        // throw new UnsupportedOperationException("Unimplemented method 'insertCoins'");
    }

    @Override
    public void selectProduct(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'selectProduct'");
        machine.setState(new ProductSelection());
    }

    @Override
    public void refundOrCancel() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refundOrCancel'");
    }

    @Override
    public void collectProduct(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'collectProduct'");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int shelfNumber) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseProduct'");
    }

}
