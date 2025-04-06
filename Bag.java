class Bag
{
	String brand;
	double price;
	String material;
	String color;
	String type;

	Bag( String brand,double price, String material, String color, String type)
	{
		System.out.println("constructor starts");

		this.brand = brand ;
		this.type = type;
		this.price = price;
		this.material = material;
		this.color =color;
	}

	public void displayBag()
	{
		System.out.println(brand);
		System.out.println(type);
		System.out.println(price);
		System.out.println(material);
		System.out.println(color);
	}
}