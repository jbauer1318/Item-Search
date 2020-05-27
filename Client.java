
public class Client {x

	public static void main(String[] args) {
		
		Item a = new CD(12345, "The leak", 23, 42, "Lil Wayne", "Rap");
		Item b = new Video(52836,"Scarface", 3, 182, "Brian De Palma", "Drama", 210);
		Item c = new Book(23262, "Holes", 42, "Louis Sachar");
		Item d = new JournalPaper(90210, "Java Programming", 3, "Craig Federahgi", 2012);
		
		
		System.out.println("Display info about a song");
		a.print();
		System.out.println();
		System.out.println("Display info about a movie");
		b.print();
		System.out.println();
		System.out.println("Display info about a movie");
		c.print();
		System.out.println();
		System.out.println("Display info about a book");
		d.print();
		System.out.println();
		
		
		a.checkOut();
		b.checkIn();
		
		System.out.println("After a new copy of this song was checked out,"
				+ " the number of copies changed. The new info is: ");
		a.print();
		System.out.println();
		System.out.println("After a new copy of this movie was added,"
				+ " the number of copies changed. The new info is: ");
		b.print();
		System.out.println();
		
	}

}
