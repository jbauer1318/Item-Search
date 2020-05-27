
public class JournalPaper extends WrittenItem{
	
	private int yearPublished;
	
	public JournalPaper(){
		super();
		yearPublished = 0;
	}
	
	public JournalPaper(int idNum, String title, int copies, String author, int a){
		super(idNum,title,copies, author);
		yearPublished = a;
	}
	
	public int getYearPublished(){
		return yearPublished;
	}
	
	public void setYearPublished(int x){
		yearPublished = x;
	}
	
	public String toString(){
		return super.toString() + " Year Published: " + yearPublished;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof JournalPaper) {
			JournalPaper i = (JournalPaper) obj;
			return super.equals(i) && yearPublished == i.yearPublished;
		}
		else
			return false;
	}
	
	public void print(){
		super.print();
		System.out.println("Year Published: " + yearPublished);
	}

}
