package State.VendingMachine;

import java.util.ArrayList;
import java.util.List;

import State.VendingMachine.Classes.Inventory.Inventory;
import State.VendingMachine.Classes.Inventory.Item;
import State.VendingMachine.Classes.Inventory.ItemShelf;
import State.VendingMachine.Classes.Inventory.VendingMachine;
import State.VendingMachine.Classes.States.Idle;
import State.VendingMachine.Enums.ItemType;

public class Main {

    public static void main(String[] args){

        List<ItemShelf> itemShelf = new ArrayList<>();
        
        for(int i = 0;i < 3;i++){
            itemShelf.add(new ItemShelf(new Item(ItemType.COKE, 100),i));
        }
        for(int i = 3;i < 6;i++){
            itemShelf.add(new ItemShelf(new Item(ItemType.LAYS, 20),i));
        }
        for(int i = 6;i < 9;i++){
            itemShelf.add(new ItemShelf(new Item(ItemType.MAAZA, 10),i));
        }
        for(int i = 9;i < 12;i++){
            itemShelf.add(new ItemShelf(new Item(ItemType.MOONGDAl, 10),i));
        }

        Inventory inventory = new Inventory(itemShelf);

        try{
            VendingMachine machine = new VendingMachine(inventory, new Idle());
            machine.getState().insertCoins( machine,100);
            machine.getState().insertMoreCoins(machine,100);
            machine.getState().selectProduct(machine);
            machine.getState().chooseProduct(machine, 0);
            machine.getState().collectProduct(machine);
        }
        catch(Exception e){
            System.out.println("Operation Cannot be performed in state ");
        }
       

    }
}
