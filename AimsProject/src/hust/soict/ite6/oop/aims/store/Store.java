package hust.soict.ite6.oop.aims.store;

import java.util.ArrayList;

import hust.soict.ite6.oop.aims.disc.DigitalVideoDisc;

public class Store {
	public static final int MAX_NUBMERS_STORED = 100;
	ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();
	
	int qtyStored = 0;

	public void addDVD(DigitalVideoDisc... discs) {
		for (DigitalVideoDisc disc : discs) {
			if (qtyStored < MAX_NUBMERS_STORED) {
				itemsInStore.add(disc);
				System.out.println("The disc " + disc.getTitle() + " has been added into the store");
				qtyStored = itemsInStore.size();
			} else {
				System.out.println("The store is full, can't add " + disc.getTitle());
				break;
			}
		}
	}
	
	
	public void removeDVD(DigitalVideoDisc disc) {
		itemsInStore.remove(disc);
		System.out.println("The disc " + disc.getTitle() + " has been removed");
		qtyStored = itemsInStore.size();
	}
	
	public void printDVD() {
		System.out.println("***********************STORE***********************");
		for (int i=0; i<itemsInStore.size(); i++) {
			System.out.println(itemsInStore.get(i).toString());
		}
		System.out.println("***************************************************");
	}
	
}
