package hust.soict.ite6.oop.aims.disc;


public class DigitalVideoDisc { //store title, category, cost, director, length 
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	
	public DigitalVideoDisc (String title) {
		super();
		this.title = title;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc (String category, String title,  float cost) {
		super();
		this.title = title;
		this.cost = cost;
		this.category = category;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc ( String director ,String category, String title,  float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc ( String title, String category, String director ,  int length,float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getDirector() {
		return director;
	}
	
	public int getLength() {
		return length;
	}
	
	public float getCost() {
		return cost;
	}
	
	public int getId() {
		return id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	//display full info of the dvd chosen in the cart
	
	// using String
//	public String toString() {
//		String dvdString = this.id+". DVD - "+this.getTitle()+" - ";
//		if ( this.getCategory() != null && !this.getCategory().isEmpty() ) dvdString = dvdString + this.getCategory()+ " - ";
//		if ( this.getDirector() != null && !this.getDirector().isEmpty()) dvdString = dvdString + this.getDirector()+ " - ";
//		if (this.getLength() > 0  ) dvdString = dvdString + this.getLength()+ " min : ";
//		if (this.getCost() > 0) dvdString = dvdString + this.getCost()+ " $ ";
//		return dvdString;
//	}
	
	//using StringBuilder ( faster .. )
	public String toString() {
		StringBuilder dvdString = new StringBuilder();
		dvdString.append(this.id).append(". DVD - ").append(this.getTitle()).append(" - ");
		if (this.getCategory() != null && !this.getCategory().isEmpty())
			dvdString.append(this.getCategory()).append(" - ");
		if (this.getDirector() != null && !this.getDirector().isEmpty())
			dvdString.append(this.getDirector()).append(" - ");
		if (this.getLength() > 0)
			dvdString.append(this.getLength()).append(" min : ");
		if (this.getCost() > 0)
			dvdString.append(this.getCost()).append(" $ ");
		return dvdString.toString();
	}
	
}

