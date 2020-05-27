
public class Video extends MediaItem{
	
	private String director;
	private String genre;
	private int yearReleased;
	
	public Video(){
		super();
		director = "Null";
		genre = "Null";
		yearReleased = 0000;
	}
	
	public Video(int idNum, String title, int copies,int runtime, String a, String b, int c){
		super(idNum,title,copies, runtime);
		director = a;
		genre = b;
		yearReleased = c;
	}
	
	public String getDirector(){
		return director;
	}
	
	public String getGenre(){
		return genre;
	}
	
	public int getYearReleased(){
		return yearReleased;
	}
	
	public void setDirector(String a){
		director = a;
	}
	
	public void setGenre(String b){
		genre = b;
	}
	
	public void setYearReleased(int c){
		yearReleased = c;
	}
	
	public String toString(){
		return super.toString() + " Director: " + director + " Genre: " + genre + " Year Released: " + yearReleased;
	}
	
	public void print(){
		super.print();
		System.out.println("Director: " + director);
		System.out.println("Genre: " + genre);
		System.out.println("Year Released: " + yearReleased);
	}

}

