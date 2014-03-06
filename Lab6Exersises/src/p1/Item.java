package p1;
import java.text.NumberFormat;
/**
 * Represents an item at a store with a name, price, and quantity.
 * 
 * @author Wilson Carpenter
 *
 */

public class Item {
    private String name;
    private double price;
    private int quantity;
    
   
    /**
     * Creates a new item with given attributes.
     * @param itemName The name of the item.
     * @param itemPrice The price of the item.
     * @param numPurchased the amount of the item purchased.
     */
    public Item(String itemName, double itemPrice, int numPurchased) {
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }
    
    /**
     * Return a string with the information about the item
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t"
                + fmt.format(price * quantity));
    }
    
    /**
     * Returns unit price of the item.
     * @return
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Returns the name of the item/
     * @return
     */
    public String getName() {
        return name;
        }
    
    /**
     * Returns the quantity of the item.
     * @return
     */
    public int getQuantity() {
        return quantity;
    }

}
