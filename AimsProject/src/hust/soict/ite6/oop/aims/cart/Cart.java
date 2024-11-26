package hust.soict.ite6.oop.aims.cart;


import java.util.ArrayList;

import hust.soict.ite6.oop.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUBMERS_ORDERED = 20; //mamximum number of dvd in a cart
	private float totalCost = 0; //total cost of the cart
	ArrayList<DigitalVideoDisc> itemsOrderedList = new ArrayList<DigitalVideoDisc>(MAX_NUBMERS_ORDERED);
		//(list of dvd )array
	
	public int qtyOrdered = 0; //number of dvd in cart
	
	// add 1 dvd into cart
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		// if quantity is not max yet, then still can add
		if (qtyOrdered < MAX_NUBMERS_ORDERED) {
			itemsOrderedList.add(disc);
			System.out.println("The disc " + disc.getTitle() + " has been added");

			qtyOrdered = itemsOrderedList.size();
		} else
			System.out.println("The cart is full");
	}
//	
//	//solution 1: overload old addDigitalVideoDisc method with Array Parameter Method
//	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
//		for (DigitalVideoDisc disc : dvdList) {
//			if (qtyOrdered < MAX_NUBMERS_ORDERED) {
//				itemsOrderedList.add(disc);
//				System.out.println("The disc " + disc.getTitle() + " has been added");
//				qtyOrdered = itemsOrderedList.size();
//			}
//			else {
//				System.out.println("The cart is full, can't add "+disc.getTitle());
//				break;
//			}
//		}
//	}
//	
	//solution 2 : overload old addDigitalVideoDisc method with Varargs Method
	public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
		for (DigitalVideoDisc disc : dvds) {
			if (qtyOrdered < MAX_NUBMERS_ORDERED) {
				itemsOrderedList.add(disc);
				System.out.println("The disc " + disc.getTitle() + " has been added");
				qtyOrdered = itemsOrderedList.size();
			}
			else {
				System.out.println("The cart is full, can't add "+disc.getTitle());
				break;
			}
		}
	}
	
	//solution 2 : overload old addDigitalVideoDisc method by differing the number of parameters
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		// Add the first disc
	    if (qtyOrdered < MAX_NUBMERS_ORDERED) {
	        itemsOrderedList.add(dvd1);
	        System.out.println("The disc " + dvd1.getTitle() + " has been added.");
	        qtyOrdered = itemsOrderedList.size();
	    } else {
	        System.out.println("The cart is full. Could not add " + dvd1.getTitle());
	        return; // Exit to avoid adding the second disc if the cart is full
	    }

	    // Add the second disc
	    if (qtyOrdered < MAX_NUBMERS_ORDERED) {
	        itemsOrderedList.add(dvd2);
	        System.out.println("The disc " + dvd2.getTitle() + " has been added.");
	        qtyOrdered = itemsOrderedList.size();
	    } else {
	        System.out.println("The cart is full. Could not add " + dvd2.getTitle());
	    }
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
	
	
	//print out all dvd in the cart using StringBuilder
	public void displayCart() {
		StringBuilder displayTitle = new StringBuilder();
		for (int i=0; i<itemsOrderedList.size(); i++) {
			displayTitle.append(itemsOrderedList.get(i).getTitle()).append(", ") ;
		}
		System.out.println(displayTitle.toString());
	}
	
	public void printCart() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i=0; i<itemsOrderedList.size(); i++) {
			System.out.println(itemsOrderedList.get(i).toString());
		}
		System.out.println("Total cost: "+totalCost());
		System.out.println("***************************************************");
	}
	
	public void search(int id) {
		boolean found = false;
		for (int i=0; i<itemsOrderedList.size(); i++) {
			if (itemsOrderedList.get(i).getId() == id) {
				System.out.println(itemsOrderedList.get(i).toString());
				found = true;
			}
		}
		if (!found) System.out.println("No match (id="+id+") is found");
	}
	
	public void search(String title) {
		boolean found = false;
		for (int i=0; i<itemsOrderedList.size(); i++) {
			if (itemsOrderedList.get(i).getTitle().equalsIgnoreCase(title)) {
				System.out.println(itemsOrderedList.get(i).toString());
				found = true;
			}
		}
		if (!found) System.out.println("No match (title="+title+") is found");
	}
	
}
