package State.VendingMachine.Classes.Inventory;

import State.VendingMachine.Interface.State;

public class VendingMachine {

    private Inventory inventory;
    private State state;
    private int coinsInserted;
    private Item selectedProduct;
    
    public VendingMachine(Inventory inventory, State state) {
        this.inventory = inventory;
        // this.coinsInserted = coinsInserted;
        this.state = state;
    }

    public Inventory getInventory() {
        return inventory;
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    public int getCoinsInserted() {
        return coinsInserted;
    }
    public void setCoinsInserted(int coinsInserted) {
        this.coinsInserted = coinsInserted;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }

    public Item getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Item selectedProduct) {
        this.selectedProduct = selectedProduct;
    } 

    
}
