package hw;

public class ReaderTest {

	public static void main(String[] args) {
		
		Book book1= new Book();
		book1.title= "Bulbulu Oldurmek";
		book1.isHardCover=false;
		book1.page= 358;
		book1.currentPage=80;
		BookType getbookType = BookType.DRAMATIC;
		
		
		
		
		Author author1= new Author();
		author1.name= "Harper Lee";
		book1.author= author1;
		
		Reader reader1 = new Reader();
		reader1.name= "Sema Demir";
		reader1.age= 23;
		reader1.sex="F";
		reader1.book= book1;
		

		
				
		System.out.println(reader1.name+ " " + getbookType + " turunde "+ book1.title + " kitabinda "+ book1.currentPage + " . sayfada su an." );
			
		
		
		
	}
	
}
