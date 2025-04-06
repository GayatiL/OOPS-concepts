class Book
{
	int pages;
	double price ;
	String brand;
	String size;
	String bind;

	Book(int pages, double price, String brand, String size, String bind)
	{
		System.out.println("constructor starts");

		this.pages;
		this.price;
		this.brand;
		this.size;
		this.bind;

		System.out.println("constructor ends");
	}

	public void displayBook()
	{
		System.out.println(pages);
		System.out.println(price);
		System.out.println(brand);
		System.out.println(size);
		System.out.println(bind);
	}
}