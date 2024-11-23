package lab02;

public class Aims {
	public static void main(String[] args) {
		//add a new cart
		Cart anOrder = new Cart();
		
		//initial with 3 dvd with details
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation" , "Roger Allers", 97, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction" , "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation" ,"Aladin", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		//remove disc 2 from the cart anOrder
		anOrder.removeDigitalVideoDisc(dvd2);
		
		
		//print out totalCost of the cart
		System.out.println("Total cost is : " + anOrder.totalCost());
		
		//print out all dvd in the cart
		System.out.println("All dvd in cart : " );
		 anOrder.displayCart();
	}
}