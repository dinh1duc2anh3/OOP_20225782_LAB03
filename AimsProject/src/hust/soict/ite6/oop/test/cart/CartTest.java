package hust.soict.ite6.oop.test.cart;

import hust.soict.ite6.oop.aims.cart.Cart;
import hust.soict.ite6.oop.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        // Create a Cart object
        Cart cart = new Cart();

        // Create some DigitalVideoDisc objects
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 29.99f);


        cart.addDigitalVideoDisc(dvd1,dvd2,dvd3, dvd4);

        cart.displayCart();

        cart.printCart();

        cart.search("the lion King");  // Existing title
        cart.search("avengers");      // Non-existing title


        cart.search(dvd1.getId());  // Existing ID
        cart.search(999);           // Non-existing ID


        cart.removeDigitalVideoDisc(dvd2);
        cart.displayCart(); // Verify removal

        // Test total cost
        System.out.println("\nTotal cost of DVDs in the cart: " + cart.totalCost());

    }
}
