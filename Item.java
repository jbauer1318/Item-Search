
public abstract class Item {
	
	private int idNum;
	private String title;
	private int copies;
	
	Item() {
		idNum = 00000;
		title = "Null";
		copies = 0;
	}
	
	Item(int idNum, String title, int copies) {
		this.idNum = idNum;
		this.title = title;
		this.copies = copies;	
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	public boolean equals(Item a) {
		return (this.idNum == a.idNum && this.title == a.title && this.copies == a.copies);
	}
	
	public void checkIn() {
		copies++;
	}
	
	public void checkOut() {
		copies--;
	}
	
	public void addItem(int id, String title) {
		if(idNum == id && this.title.equals(title))
			copies++;
	}
	
	public void print(){
		System.out.println("ID Number: " + idNum);
		System.out.println("Title: " + title);
		System.out.println("Copies: " + copies);
		
		
	}
	
	

}
