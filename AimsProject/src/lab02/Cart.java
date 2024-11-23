package lab02;


import java.util.ArrayList;

public class Cart {
	public static final int MAX_NUBMERS_ORDERED = 20; //mamximum number of dvd in a cart
	private float totalCost = 0; //total cost of the cart
	ArrayList<DigitalVideoDisc> itemsOrderedList = new ArrayList<DigitalVideoDisc>(MAX_NUBMERS_ORDERED);
		//(list of dvd )array
	
	public int qtyOrdered = 0; //number of dvd in cart
	
	//add 1 dvd into cart
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		//if quantity is not max yet, then still can add
		if (qtyOrdered < MAX_NUBMERS_ORDERED ) {
			itemsOrderedList.add(disc);
			System.out.println("The disc " + disc.getTitle() + " has been added");
			
			qtyOrdered = itemsOrderedList.size();
		}
		else System.out.println("The cart is full");
	}
	
	//remove 1 dvd from cart
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		itemsOrderedList.remove(disc);
		System.out.println("The disc " + disc.getTitle() + " has been removed");
		qtyOrdered = itemsOrderedList.size();
	}
	
	//total cost of all dvd in cart
	public float totalCost() {
		for (int i=0; i<itemsOrderedList.size(); i++) {
			totalCost += itemsOrderedList.get(i).getCost();
		}
		return totalCost;
	}
	
	
	//print out all dvd in the cart
	public void displayCart() {
		for (int i=0; i<itemsOrderedList.size(); i++) {
			String displayTitle = itemsOrderedList.get(i).getTitle();
			System.out.print(displayTitle + ", ");
		}
	}
	
}
