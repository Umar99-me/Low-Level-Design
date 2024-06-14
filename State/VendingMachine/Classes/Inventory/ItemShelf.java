package State.VendingMachine.Classes.Inventory;

public class ItemShelf {

    private int shelfNumber;
    private Item item;
    private boolean isAvailable;

    public ItemShelf( Item item,int shelfNumber) {
        this.shelfNumber = shelfNumber;
        this.item = item;
    }
    public int getShelfNumber() {
        return shelfNumber;
    }
    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    
}
