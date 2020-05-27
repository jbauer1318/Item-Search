
public abstract class WrittenItem extends Item {
	
	private String author; 
	
	public WrittenItem(){
		super();
		author = " ";
	}
	
	public WrittenItem(int idNum, String title, int copies, String a){
		super(idNum,title,copies);
		author = a;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setAuthor(String x){
		author = x;
	}
	
	public String toString(){
		return super.toString() + " Author: " + author;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof WrittenItem) {
			WrittenItem i = (WrittenItem) obj;
			return super.equals(i) && author.equals(i.author);
		}
		else
			return false;
	}
	
	public void print(){
		super.print();
		System.out.println("Author: " + author);
	}
	
}	
