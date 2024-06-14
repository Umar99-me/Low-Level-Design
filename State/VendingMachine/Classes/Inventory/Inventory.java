package State.VendingMachine.Classes.Inventory;

import java.util.List;

public class Inventory {

    private List<ItemShelf> shelf ;

    

    public Inventory(List<ItemShelf> shelf) {
        this.shelf = shelf;
    }

    public boolean isItemAvailable(int number){
        return false;
    }

    public void addItemShelf(ItemShelf itemshelf){
        this.shelf.add(itemshelf);
    }

    public List<ItemShelf> getShelf() {
        return shelf;
    }

    public void setShelf(List<ItemShelf> shelf) {
        this.shelf = shelf;
    }

    

}
