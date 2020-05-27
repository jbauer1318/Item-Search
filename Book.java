
public class Book extends WrittenItem{
	
	public Book(){
		super();
	}
	
	public Book(int idNum, String title, int copies, String author){
		super(idNum,title,copies, author);
	}
	
	
	public String toString(){
		return super.toString();
	}
	
	public boolean equals(Object obj){
		if(obj instanceof JournalPaper) {
			JournalPaper i = (JournalPaper) obj;
			return super.equals(i);
		}
		else
			return false;
	}
	
	public void print(){
		super.print();
	}

}
