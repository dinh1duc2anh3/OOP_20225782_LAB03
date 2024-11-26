package hust.soict.ite6.oop.test.store;

import hust.soict.ite6.oop.aims.disc.DigitalVideoDisc;
import hust.soict.ite6.oop.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Title1", "Category1", "Director1", 120, 19.99f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Title2", "Category2", "Director2", 90, 14.99f);
        
		Store aStore = new Store();
		
		aStore.addDVD(dvd1,dvd2);
		aStore.printDVD();
		aStore.removeDVD(dvd2);
		aStore.printDVD();
        
	}

}
