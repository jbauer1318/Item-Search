
public class CD extends MediaItem{

	private String artist;
	private String genre;
	
	public CD(){
		super();
		artist = "Null";
		genre = "Null";
	}
	
	public CD(int idNum, String title, int copies,int runtime, String a, String b){
		super(idNum,title,copies, runtime);
		artist = a;
		genre = b;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public String getGenre(){
		return genre;
	}
	
	public void setArtist(String a){
		artist = a;
	}
	
	public void setGenre(String b){
		genre = b;
	}
	
	public String toString(){
		return super.toString() + " Artist: " + artist + " Genre: " + genre;
	}
	
	public void print(){
		super.print();
		System.out.println("Artist: " + artist);
		System.out.println("Genre: " + genre);
	}
	
}
