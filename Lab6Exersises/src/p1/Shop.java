package p1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Uses an ArrayList to store items in a cart and print their information.
 * @author Wilson Carpenter
 *
 */
public class Shop {
    /**
     * Gets user's input to store their items in a cart and print information
     * about the items.
     * @param args unused.
     */
    public static void main(String[] args) {
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        double totalPrice = 0;
        
        ArrayList<Item> cart = new ArrayList<Item>();
        
        Scanner scan = new Scanner(System.in);
        
        String keepShopping = "y";
        
        //Gets the item information from the user and stores it in the cart
        do {
            System.out.print("Enter the name of the item: ");
            itemName = scan.next();
            
            System.out.print("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            
            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();
            
            item = new Item(itemName, itemPrice, quantity);
            cart.add(item);
            
            //Prints the items that are in the cart 
            int count = 0;
            while (cart.size() > count) {
                System.out.println(cart.get(count));
                count++;
            }
            
            //prints the total price of the items in the cart
            totalPrice += (item.getPrice() * item.getQuantity());
            System.out.println("The total price for your items is: " + totalPrice);
            
            System.out.print("Continue shopping? (y/n) ");
            keepShopping = scan.next();
            }
        
        while(keepShopping.equals("y"));
        scan.close();
        

    }

}
