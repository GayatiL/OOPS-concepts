class Mango 
{
	String type;
	double price;
	String place;


	Mango ()
	{

	}

	public Mango displayType()
	{
		System.out.println(type);
		System.out.println("from method 1");
		return this;
	}

	public Mango displayPrice()
	{
		System.out.println(price);
		System.out.println("from method 2");
		return this;
	}
	public Mango displayPlace()
	{
		System.out.println(place);
		System.out.println("from method 3");
		return this;
	}

}