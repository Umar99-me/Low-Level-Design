package State.VendingMachine.Classes.States;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import State.VendingMachine.Classes.Inventory.ItemShelf;
import State.VendingMachine.Classes.Inventory.VendingMachine;
import State.VendingMachine.Interface.State;

public class ProductSelection implements State{

    @Override
    public void insertCoins(VendingMachine machine,int coins) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertMoney'");
    }

    @Override
    public void insertMoreCoins(VendingMachine machine,int coins) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertCoins'");
    }

    @Override
    public void selectProduct(VendingMachine machine) throws Exception {
            
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
       
        List<ItemShelf> shelf= machine.getInventory().getShelf();

        ItemShelf requiredShelf = shelf.stream().filter(x-> x.getShelfNumber() == shelfNumber).collect(Collectors.toList()).get(0);
        if(requiredShelf.getItem().getPrice() > machine.getCoinsInserted())
        {
             machine.setState(new Idle());
             throw new UnsupportedOperationException("This Product cannot be bought for inserted amount");
        }       else{
        //  machine.setState(new DispenseProduct());
        System.out.println("Added "+requiredShelf.getItem().getType()+" To cart");
        machine.setSelectedProduct(requiredShelf.getItem());
        machine.setState(new DispenseProduct());
        }
    }

}
