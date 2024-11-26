package hust.soict.ite6.oop.aims;

import hust.soict.ite6.oop.aims.cart.Cart;
import hust.soict.ite6.oop.aims.disc.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
		//add a new cart
		Cart anOrder = new Cart();
		
		//initial with 3 dvd with details
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation" , "Roger Allers", 97, 19.95f);		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction" , "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation" ,"Aladin", 18.99f);
		
		//auto add data
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Inception", "Science Fiction", 22.95f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Christopher Nolan", "Science Fiction", "Interstellar", 27.99f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Avatar", "Fantasy", "James Cameron", 162, 29.99f);
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("Titanic");
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Horror", "A Quiet Place", 18.99f);
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 24.50f);
		DigitalVideoDisc dvd10 = new DigitalVideoDisc("Pixar", "Animation", "Toy Story", 90, 15.75f);
		
		//method overloading using var args method
		anOrder.addDigitalVideoDisc(dvd1,dvd2,dvd3);
		anOrder.addDigitalVideoDisc(dvd4, dvd5, dvd6, dvd7, dvd8, dvd9, dvd10);
		
//		anOrder.addDigitalVideoDisc(dvd3);
		
		//remove disc 2 from the cart anOrder
//		anOrder.removeDigitalVideoDisc(dvd2);
		
		
		//print out totalCost of the cart
		System.out.println("Total cost is : " + anOrder.totalCost());
		
		//print out all dvd in the cart
		System.out.println("All dvd in cart : " );
		anOrder.displayCart();
		 
		//printCart
		anOrder.printCart();
		
		anOrder.search(11);
		anOrder.search("Harry potter");
		anOrder.search("titanic");
	}
	
	
}