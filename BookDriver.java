class BookDriver
{
	public static void main(String[] args) 
	{
		Book b1 = new Book(100, 50.00, "classmate", "A4", "sprial");

		b1.displayBook();

		Book b2 = new Book(200, 150.00, "apsara", "A3", "normal");
		System.out.println("------------------------------------------------");

		b2.displayBook();
		
	}
}